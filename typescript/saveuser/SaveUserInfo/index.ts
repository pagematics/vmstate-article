import { AzureFunction, Context, HttpRequest } from "@azure/functions"

const httpTrigger: AzureFunction = async function (context: Context, req: HttpRequest): Promise<void> {
    context.log('HTTP trigger function processed a request.');
                //importing required functions
                const CosmosClient = require("@azure/cosmos").CosmosClient;
                const config = require("./config");
                const dbContext = require("./dbcontext");
                //Defining the variables error message and result string
                var errorMessage;
                var resultString;
                //printing the url information
                context.log(`Http function processed request for url "${req.url}"`);
                //converting the request body to json object
                const {id,name,email} = req.body;
                const user = {
                    id:id,
                    name: name,
                    email: email
                }
                // create ClientObject DatabaseContainer
                const { endpoint, key, databaseId, containerId} = config;
                const client = new CosmosClient({ endpoint, key });
                const database = client.database(databaseId); 
                const container = database.container(containerId);
                await dbContext.create(client, databaseId, containerId);
                // Create the new user in the container
                try {
                const { resource: createdItem } = await container.items.create(user); 
                 console.log("Added a new user");
                } catch (err) {
                  errorMessage = err.message.split('.')[0];
                  console.log(errorMessage);
                }
                //Defining the output based on the status of save function
               if (errorMessage){
                resultString = errorMessage;
               }
               else{
                resultString = 'successfully saved the user';
               }
        context.res = {
        // status: 200, /* Defaults to 200 */
        body: resultString
    };

};

export default httpTrigger;