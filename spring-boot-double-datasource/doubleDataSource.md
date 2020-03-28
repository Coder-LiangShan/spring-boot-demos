## double-datasource
> 做项目需要配置双数据源，查阅资料后，顺利完成双数据源的配置，现整理成demo。

**具体步骤：**
1. [初始化数据库环境](./src/main/resources/table/initdb.sql)
2. [建项目，并作相应的配置，**关注数据库配置**](./src/main/resources/application.properties)
3. [书写数据源的配置类](./src/main/java/pers/liangshan/doubledatasource/config/Datasource1Config.java)
4. 编写数据库对应表的dao，entity，mapper等信息，可借助插件生成，如：easyCode，**请留意mapper类和xml的目录结构**
5. 编写Controller测试，访问：http://localhost:8080/test 查看结果

注：具体代码请下载查询