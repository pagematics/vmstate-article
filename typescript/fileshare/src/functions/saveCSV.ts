import { app, HttpRequest, HttpResponseInit, InvocationContext } from "@azure/functions";
import { Readable } from 'stream';
import { parseAsync } from 'json2csv';
import {ShareServiceClient, StorageSharedKeyCredential}  from '@azure/storage-file-share';
export async function saveCSV(request: HttpRequest, context: InvocationContext): Promise<HttpResponseInit> {
    context.log(`Http function processed request for url "${request.url}"`);
            //fetching the required methods
            const config = require("./config");
            const { storageAccount, storageAccountKey, shareName, directoryName} = config;
            const credential = new StorageSharedKeyCredential(storageAccount, storageAccountKey);
            const serviceClient = new ShareServiceClient(
            `https://${storageAccount}.file.core.windows.net`,
             credential
            );
            var errorMessage;
            var resultString;
            try{
            //Print the request url
            context.log(`Http function processed request for url "${request.url}"`);
            //defining error message and result
            const data = await request.text();
             
            var user = JSON.parse(data);
              // Convert JSON data to CSV
              const csvData = await parseAsync(user);
              //upload the csv file
              
              const streamData = Readable.from(csvData); 
              const now = new Date();
              const fileName = `${now.getTime()}.csv`;
              const directoryClient = serviceClient.getShareClient(shareName).getDirectoryClient(directoryName);
              const fileClient = directoryClient.getFileClient(fileName);
              await fileClient.uploadStream(streamData, csvData.length,  4 * 1024 * 1024, 20);
            } catch (err) {
              errorMessage = err.message.split('.')[0];
              console.log(err.message);
            }
            //Defining the output based on the status of save function
            if (errorMessage){
              resultString = errorMessage;
            }
            else{
              resultString = 'please check the fileshare to view the result';
            }
            //printing the result
            return { body: resultString };
};

app.http('saveCSV', {
    methods: ['GET', 'POST'],
    authLevel: 'anonymous',
    handler: saveCSV
});
