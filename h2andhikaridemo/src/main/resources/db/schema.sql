DROP TABLE IF EXISTS USER;
create table if not exists USER (
USE_ID int not null primary key auto_increment,
USE_NAME varchar(100),
USE_SEX varchar(1),
USE_AGE NUMBER(3),
USE_ID_NO VARCHAR(18),
USE_PHONE_NUM VARCHAR(11),
USE_EMAIL VARCHAR(100),
CREATE_TIME DATE,
MODIFY_TIME DATE,
USE_STATE VARCHAR(1));

DROP TABLE IF EXISTS t_seckill_product;

CREATE TABLE t_seckill_product (
                                   id int primary key auto_increment,
                                   gmt_create timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
                                   gmt_update timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                                   prod_id varchar NOT NULL DEFAULT '-1' COMMENT '商品id',
                                   prod_name varchar NOT NULL DEFAULT '-1' COMMENT '商品名称',
                                   prod_status int NOT NULL DEFAULT '0' COMMENT '商品状态,0-上架，1-下架',
                                   prod_stock int NOT NULL DEFAULT '0' COMMENT '商品库存',
                                   prod_price DECIMAL(10, 3) NOT NULL DEFAULT  '0.000' COMMENT '商品售价'
);
