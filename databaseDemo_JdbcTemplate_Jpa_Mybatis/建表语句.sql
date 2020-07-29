CREATE DATABASE IF NOT EXISTS test;
USE test;
#建表
DROP TABLE IF EXISTS user;
CREATE TABLE user (
	id INT NOT NULL AUTO_INCREMENT,
	username VARCHAR(50) DEFAULT NULL,
	password VARCHAR(50) DEFAULT NULL,
	name VARCHAR(50) DEFAULT NULL,
	PRIMARY KEY (id)
	)
	ENGINE = INNODB;
	
INSERT INTO user (username,password,name) VALUES ('zhangsan','123','张三');
INSERT INTO user (username,password,name) VALUES ('lisi','321','李四');
INSERT INTO user (username,password,name) VALUES ('chenhao','584','程浩');