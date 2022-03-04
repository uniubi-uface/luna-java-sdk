## luna-java-sdk

[中文文档](./README-zh_CN.md)

## Release Notes

* [ReleaseNotes](./docs/ReleaseNotes.md)

### Open API Document

* [UStar Open API Document](./docs/UStar%20SDK%20Open%20API.md)
  Open API provides HTTP / HTTPS interfaces, and developers can connect to UStar through open API,

  Obtain attendance phase data, equipment identification record data, etc. According to the product roadmap,

  more API capabilities will be provided later.

### UStar Java SDK Example

Through the open API, developers can use various languages to connect with UStar to obtain corresponding data,

such as Java, C, C++. In order to facilitate docking, we provide Java SDK to realize the docking of open API.

The following SDK usage examples are provided:

* [API simple example](./luna-sdk-examples/api-simple-example)
* [API springboot example](./luna-sdk-examples/api-springboot-example)
* [message receive example](./luna-sdk-examples/message-receive-example)

### Maven dependency

Maven dependency GAV:

```xml

<dependency>
    <groupId>com.uniubi.cloud</groupId>
    <artifactId>luna-java-development-kit</artifactId>
    <version>${latestTagName}</version>
</dependency>
```

Use the latest release tag name as the version.