DROP TABLE IF EXISTS `user_record`;
CREATE TABLE `user_record` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `userid` INT(11) NOT NULL  COMMENT '对应用户表id',
  `date` DATETIME  NOT NULL COMMENT '日期',
  `height` INT(11) NOT NULL COMMENT '身高',
  `weight` INT(11) NOT NULL COMMENT '体重',
  `Calorie` INT(11) NOT NULL COMMENT '摄入热量',
  `drink` INT(11) NOT NULL COMMENT '喝水量',
  `steps` INT(11) NOT NULL COMMENT '运动步数',
  PRIMARY KEY (`id`),
  FOREIGN KEY (userid) REFERENCES sys_user (id)
) ENGINE=INNODB  DEFAULT CHARSET=utf8 COMMENT='用户记录表';
INSERT INTO user_record VALUES(1,1,'2022-01-15 00:00:00',180,160,500,1500,6000);

DROP TABLE IF EXISTS `user_cart`;
CREATE TABLE `user_cart` (
                             `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
                             `goodid` INT(11) NOT NULL  COMMENT '对应商品id',
                             `userid` INT(11) NOT NULL  COMMENT '对应用户表id',
                             `collect` INT(1) NOT NULL COMMENT '收藏',
                             `cart` INT(11) NOT NULL COMMENT '加购物车',
                             PRIMARY KEY (`id`),
                             FOREIGN KEY (userid) REFERENCES sys_user (id)
) ENGINE=INNODB  DEFAULT CHARSET=utf8 COMMENT='用户收藏加购表';
INSERT INTO user_cart VALUES(1,33305,1,1,2);

DROP TABLE IF EXISTS `user_address`;
CREATE TABLE `user_address` (
                                `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
                                `userid` INT(11) NOT NULL  COMMENT '对应用户表id',
                                `name` VARCHAR(45) NOT NULL  COMMENT '姓名',
                                `phone` VARCHAR(45) NOT NULL COMMENT '电话',
                                `address` VARCHAR(256) NOT NULL COMMENT '地址',
                                `code` VARCHAR(11) COMMENT '邮编',
                                PRIMARY KEY (`id`),
                                FOREIGN KEY (userid) REFERENCES sys_user (id)
) ENGINE=INNODB  DEFAULT CHARSET=utf8 COMMENT='用户地址表';
INSERT INTO user_address VALUES(NULL,1,"张三","13720618866","地球村",NULL);