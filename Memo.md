# Mybatis
Mybatis实例

第一个：

  数据库：便签(memo)的应用
  
创建该项目的步骤
  
0.安装Free Mybatis Plugin
1.创建Maven项目
	1.1 添加依赖 org.mybatis:mybatis:3.4.5
	1.2 添加依赖 mysql:mysql-connector-java:5.1.43驱动
	1.3 准备数据库 （cmd , IDEA Database）
2.创建mybatis配置
	2.1 src/main/resources -> mybatis-config.xml
	2.2 配置文件中需要配置数据库的信息，driver, url, username, password
3.编码
    3.0 com.bittech.mybatis
	3.1 entity 包  实体类 -> 数据库表
	3.2 mapper 包  xxxMapper接口 -> 数据库操作的方法 query,insert
	3.3 映射文件 src/main/resources/mapper 创建xxxMapper.xml 定义信息,告诉在什么地方找（mybatis-config.xml）
	3.4 编码，创建SqlSessionFactory SqlSession Mapper Interface
	3.5 测试一下代码

问题：
1.容易拼写错误
2.文件夹，包名称，类名称
3.mybatis-config.xml环境的Id名称，简明
4.mapper文件中的namespace是mapper接口的全限定名
5.写mapper中的命令（insert select delele update）通过mapper接口的方法名直接获取
