DROP TABLE IF EXISTS `sys_login_log`;
CREATE TABLE `sys_login_log` (
  `id` INT(65) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `logname` VARCHAR(255) DEFAULT NULL COMMENT '日志名称',
  `userid` INT(65) DEFAULT NULL COMMENT '管理员id',
  `createtime` DATETIME DEFAULT NULL COMMENT '创建时间',
  `succeed` VARCHAR(255) DEFAULT NULL COMMENT '是否执行成功',
  `message` TEXT COMMENT '具体消息',
  `ip` VARCHAR(255) DEFAULT NULL COMMENT '登录ip',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=217 DEFAULT CHARSET=utf8 COMMENT='登录记录';
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `num` INT(11) DEFAULT NULL COMMENT '序号',
  `pid` INT(11) DEFAULT NULL COMMENT '父角色id',
  `name` VARCHAR(255) DEFAULT NULL COMMENT '角色名称',
  `tips` VARCHAR(255) DEFAULT NULL COMMENT '提示',
  `version` INT(11) DEFAULT NULL COMMENT '保留字段(暂时没用）',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='角色表';


INSERT INTO `sys_role` VALUES ('1', '1', '0', '超级管理员',  'administrator', '1');
INSERT INTO `sys_role` VALUES ('5', '2', '1', '临时', 'temp', NULL);
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `avatar` VARCHAR(255) DEFAULT NULL COMMENT '头像',
  `account` VARCHAR(45) DEFAULT NULL COMMENT '账号',
  `password` VARCHAR(45) DEFAULT NULL COMMENT '密码',
  `salt` VARCHAR(45) DEFAULT NULL COMMENT 'md5密码盐',
  `name` VARCHAR(45) DEFAULT NULL COMMENT '名字',
  `birthday` DATETIME DEFAULT NULL COMMENT '生日',
  `sex` INT(11) DEFAULT NULL COMMENT '性别（1：男 2：女）',
  `email` VARCHAR(45) DEFAULT NULL COMMENT '电子邮件',
  `phone` VARCHAR(45) DEFAULT NULL COMMENT '电话',
  `roleid` VARCHAR(255) DEFAULT NULL COMMENT '角色id',
  `status` INT(11) DEFAULT NULL COMMENT '状态(1：启用  2：冻结  3：删除）',
  `createtime` DATETIME DEFAULT NULL COMMENT '创建时间',
  `version` INT(11) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COMMENT='管理员表';


INSERT INTO `sys_user` VALUES ('1', 'girl.gif', 'admin', 'ecfadcde9305f8891bcfe5a1e28c253e', '8pgby', '我是超级管理员', '2022-01-15 00:00:00', '2', 'byte@qx.com ','18200000000', '1', '1', '2022-01-15 00:00:00', '25');
