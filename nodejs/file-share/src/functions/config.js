const config = {
    endpoint: "End point of the Cosmos DB connection",
    key: "Key to connect with Cosmos DB",
    databaseId: "Database Id",
    containerId: "Container Id",
    partitionKey: { kind: "partion key", paths: ["/partion key"] },
    storageAccount:  "Name of the storage account",
    storageAccountKey: "Key of the storage account",
    shareName: "Name of the file share",
    directoryName: "Name of the directory in the file share"
  };
    
module.exports = config;