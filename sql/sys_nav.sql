DROP TABLE IF EXISTS `sys_nav`;

CREATE TABLE `sys_nav` (
                           `id` INT NOT NULL AUTO_INCREMENT,
                           `name` VARCHAR(45) DEFAULT NULL COMMENT '导航名',
                           `path` VARCHAR(200) DEFAULT NULL COMMENT '路径',
                           `icon` VARCHAR(100) DEFAULT NULL COMMENT '图标',
                           `nav_sort` INT DEFAULT NULL COMMENT '导航分类(1:首页导航，2：个人信息导航)',
                           `nav_id` VARCHAR(20) DEFAULT NULL COMMENT '导航索引',
                           PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb3;

INSERT INTO `sys_nav` (`name`, `path`, `nav_sort`, `nav_id`) VALUES ('首页', '/recipes', '1', '1');
INSERT INTO `sys_nav` (`name`, `path`, `nav_sort`, `nav_id`) VALUES ('健康菜谱', '/menus', '1', '2');
INSERT INTO `sys_nav` (`name`, `path`, `nav_sort`, `nav_id`) VALUES ('食物热量','/calorie','1','3');
INSERT INTO `sys_nav` (`name`, `path`, `nav_sort`, `nav_id`) VALUES ('运动管理','/sport','1','4');
INSERT INTO `sys_nav` (`name`, `path`, `nav_sort`, `nav_id`) VALUES ('健康商城','/product','1','5');
INSERT INTO `sys_nav` (`name`, `path`, `nav_sort`, `nav_id`) VALUES ('个人中心', '/owndetail', '1', '6');
INSERT INTO `sys_nav` (`name`, `path`, `icon`, `nav_sort`, `nav_id`) VALUES ('完善信息', '/ownmessage/prefmessage', 'el-icon-menu', '2', '1');
INSERT INTO `sys_nav` (`name`, `path`, `icon`, `nav_sort`, `nav_id`) VALUES ('修改信息', '/ownmessage/chanmessage','el-icon-menu' ,'2','2');
INSERT INTO `sys_nav` (`name`, `path`, `icon`, `nav_sort`, `nav_id`) VALUES ('找回密码', '/ownmessage/findmessage','el-icon-menu','2','3'); 