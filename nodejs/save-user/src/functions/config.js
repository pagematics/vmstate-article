const config = {
    endpoint: "endpoint of cosmos db",
    key: "key of cosmos db",
    databaseId: "database id",
    containerId: "container id",
    partitionKey: { kind: "partion key", paths: ["/path"] }
};
module.exports = config;