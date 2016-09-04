#### 基于SSM搭建的Spring+SpringMVC+Mybatis框架的User Reference

##### 创建MySQL数据库
创建数据库user：

	CREATE DATABASE user;

创建数据表tb_user：

	CREATE TABLE `tb_user` (`id` bigint(255) NOT NULL,`name` varchar(255) NOT NULL, PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;

其中用户名&密码为：

	user=root
	password=root


