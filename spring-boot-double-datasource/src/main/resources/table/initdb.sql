-- 数据源1-数据库中的表
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键id',
  `customer_name` varchar(50) DEFAULT NULL COMMENT '客户姓名',
  `customer_age` varchar(50) DEFAULT NULL COMMENT '客户年龄',
  `insert_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '插入时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户信息表';
-- 插入条数据-测试使用
insert into db1.customer(customer_name, customer_age) values ('张三', 30);


-- 数据源2-数据库中的表
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `person_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键id',
  `person_name` varchar(50) DEFAULT NULL COMMENT '人员姓名',
  `person_age` varchar(50) DEFAULT NULL COMMENT '人员龄',
  `insert_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '插入时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人员信息表';

-- 插入条数据-测试使用
insert into db2.person(person_name, person_age) values ('李四', 40);