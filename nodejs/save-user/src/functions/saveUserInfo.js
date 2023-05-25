const { app } = require('@azure/functions');
app.http('saveUserInfo', {
    methods: ['POST'],
    authLevel: 'anonymous',
    handler: async (request, context) => {
        //importing required functions
        const CosmosClient = require("@azure/cosmos").CosmosClient;
        const config = require("./config");
        const dbContext = require("./dbcontext");
        //Defining the variables error message and result string
        var errorMessage;
        var resultString;
        //printing the url information
        context.log(`Http function processed request for url "${request.url}"`);
        //converting the request body to json object
        const user = request.query.get('id','name','email') || await request.text();  
        const jsonObject = JSON.parse(user);
        // create ClientObject DatabaseContainer
        const { endpoint, key, databaseId, containerId} = config;
        const client = new CosmosClient({ endpoint, key });
        const database = client.database(databaseId); 
        const container = database.container(containerId);
        await dbContext.create(client, databaseId, containerId);
        // Create the new user in the container
        try {
        const { resource: createdItem } = await container.items.create(jsonObject); 
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
       //printing the result
      return { body: resultString };
    }
});
