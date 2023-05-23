import { app, HttpRequest, HttpResponseInit, InvocationContext } from "@azure/functions";

export async function searchUser(request: HttpRequest, context: InvocationContext): Promise<HttpResponseInit> {
    context.log(`Http function processed request for url "${request.url}"`);
            // fetching the required methods
            const config = require("./config");
            const json2csv = require('json2csv').Parser;
            const CosmosClient = require("@azure/cosmos").CosmosClient;
            const { BlobServiceClient } = require("@azure/storage-blob");
            const { Readable } = require('stream');
            const { endpoint, key, databaseId, containerId, connectionString, containerName} = config;
            const client = new CosmosClient({ endpoint, key });
            const database = client.database(databaseId); 
            const container = database.container(containerId);
            //Print the request url
            context.log(`Http function processed request for url "${request.url}"`);
            //defining error message and result
            var errorMessage;
            var resultString;
            try {
              //get the request body and retrive email from it
              const searchData = request.query.get('email') || await request.text() || 'world';
              var useremail = JSON.parse(searchData).email;
               // query to return all items with the given email
              const querySpec = {
                query: "SELECT * from Items c WHERE c.email=@useremail",
                parameters: [
                  {
                    name: "@useremail",
                    value: useremail
                  }
                ]
              };
              // read items in container with the given email
              const { resources: items } = await container.items
                .query(querySpec)
                .fetchAll();
              items.forEach(item => {
                console.log(`${item.id}-${item.name}`);
              });
              // Convert JSON data to CSV
              if(items.length!=0){
              const json2csvParser = new json2csv();
              const csvData = json2csvParser.parse(items);
              //upload the csv file to blob
              if (csvData){
              const blobServiceClient = BlobServiceClient.fromConnectionString(connectionString);
              const streamData = Readable.from([csvData]);
              const fileName = `user-${useremail}.csv`;
              const containerClient = blobServiceClient.getContainerClient(containerName);
              const blockBlobClient = await containerClient.getBlockBlobClient(fileName);
              await blockBlobClient.uploadStream(streamData, csvData.length);
              console.log(`Upload complete. Blob URL: ${blockBlobClient.url}`);
              } 
            }
            } catch (err) {
              errorMessage = err.message.split('.')[0];
              console.log(err.message);
            }
            //Defining the output based on the status of save function
            if (errorMessage){
              resultString = errorMessage;
            }
            else{
              resultString = 'please check the blob to view the result';
            }
            //printing the result
            return { body: resultString };
};

app.http('searchUser', {
    methods: ['GET', 'POST'],
    authLevel: 'anonymous',
    handler: searchUser
});
