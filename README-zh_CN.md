## luna-java-sdk

[English Document](./README.md)

## 版本发布日志

* [版本发布日志](./docs/ReleaseNotes-zh_CN.md)

### Open API Document

* [UStar Open API Document](./docs/UStar%20SDK%20Open%20API-zh_CN.md)

  Open API 提供了 http/https 接口，开发者可通过Open API对接UStar，

  获取考勤相数据、设备识别记录数据等。根据产品roadmap，后续会提供更多API能力。

### UStar Java SDK Example

通过Open API，开发者可以使用各种语言对接UStar获取相应的数据，如java、C、c++等。

为了方便对接，我们提供了Java SDK，实现Open API 的对接。并提供以下SDK的使用示例：

* [API simple example](./luna-sdk-examples/api-simple-example)
* [API springboot example](./luna-sdk-examples/api-springboot-example)
* [message receive example](./luna-sdk-examples/message-receive-example)

Maven 依赖 Maven依赖GAV:

```xml

<dependency>
    <groupId>com.uniubi.cloud</groupId>
    <artifactId>luna-java-development-kit</artifactId>
    <version>${latestTagName}</version>
</dependency>
```

请使用最新的RELEASE tag名称作为版本号