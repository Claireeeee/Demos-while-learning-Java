## hello
idea+maven+mybatis+mysql，连接本地数据库并进行简单查询，+test

### maven：
- pom使用：依赖引入与版本查询（可以到maven的一些搜索网站如https://mvnrepository.com/）进行搜索可用版本）
### mybatis
配置统一放resource文件夹下
- recourse->mybatis-config.xml: properties文件，数据库连接environments（包括driver，url，user和password等），mapper文件路径
- recourse->mapper文件夹：放置sql语句映射的文件（xml
- 流程：用id调用映射语句，返回结果转换之后放入java对象，业务代码直接处理对象
### test
一些测试知识的应用
- 和业务代码放在同一个包，测试类名加test
### 业务类User
就是一个很简答的pojo
