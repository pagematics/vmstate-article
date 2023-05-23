const config = {
    endpoint: "End point of Cosmos DB account",
    key: "Key of Cosmos DB account",
    databaseId: "Database id of the database created in Cosmos DB account",
    containerId: "Container id of the container created inside the database",
    partitionKey: { kind: "path specified for the container", paths: ["/path specified for the container"] },
    connectionString: "Connection string to connect to the blob storage account",
    containerName: "Name of the container in the storage account "
};
  
  module.exports = config;

