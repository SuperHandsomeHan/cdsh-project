-- 创建数据库
-- CREATE DATABASE cdsh_DB;
-- 使用数据库
-- USE cdsh_DB;

-- 创建表
DROP TABLE IF EXISTS user_relation;
CREATE TABLE user_relation(
	 open_id VARCHAR(50) NOT NULL COMMENT 'open_id 微信唯一标识' ,
	 user_id VARCHAR(20) COMMENT 'user_id 用户编号' ,
	 user_tel VARCHAR(11) NOT NULL COMMENT 'user_tel 用户手机号' ,
	 PRIMARY KEY (open_id)
) COMMENT = 'user_relation 用户关联表';

DROP TABLE IF EXISTS user_info;
CREATE TABLE user_info(
    user_id VARCHAR(20) NOT NULL COMMENT 'user_id 用户编号' ,
    user_name VARCHAR(16) NOT NULL COMMENT 'user_name 用户名称' ,
    user_native VARCHAR(50) NOT NULL COMMENT 'user_native 用户籍贯' ,
    user_position VARCHAR(30) NOT NULL COMMENT 'user_position 用户职位标识码' ,
    face_url VARCHAR(100) NOT NULL COMMENT 'face_url 用户头像' ,
    company VARCHAR(20) NOT NULL COMMENT 'company 公司' ,
    user_address VARCHAR(20) NOT NULL COMMENT 'user_address 用户地址' ,
    user_tel VARCHAR(20) NOT NULL COMMENT 'user_tel 用户手机号' ,
		create_time DATETIME NOT NULL COMMENT 'create_time 创建时间',
		create_user VARCHAR(20) NOT NULL COMMENT 'create_time 创建人员',
    PRIMARY KEY (user_id)
) COMMENT = 'user_info 会员信息表';

DROP TABLE IF EXISTS common_code;
CREATE TABLE common_code(
		code_num VARCHAR(8) NOT NULL COMMENT 'common_code 标识代码',
		code_type VARCHAR(8) NOT NULL COMMENT 'code_type 代码类型',
		common_remark VARCHAR(30) COMMENT 'common_remark 备注',
		code_meaning VARCHAR(40) NOT NULL COMMENT 'code_meaning 代码含义',
		PRIMARY KEY (code_num)
) COMMENT 'common_code 公共标码';
-- 插入用户类型
insert into common_code(code_num, code_type, common_remark, code_meaning) value('0011000', '0', '', '用户类型');
insert into common_code(code_num, code_type, common_remark, code_meaning) value('0011001', '0011000', '', '常德商会会员');
insert into common_code(code_num, code_type, common_remark, code_meaning) value('0011002', '0011000', '', '异地商会会员');
insert into common_code(code_num, code_type, common_remark, code_meaning) value('0011003', '0011000', '', '珠海商会顾问');
insert into common_code(code_num, code_type, common_remark, code_meaning) value('0011004', '0011000', '', '高尔夫会员');
insert into common_code(code_num, code_type, common_remark, code_meaning) value('0011005', '0011000', '', '其他来宾');
insert into common_code(code_num, code_type, common_remark, code_meaning) value('0020000', '0', '', '联系地址类型');
insert into common_code(code_num, code_type, common_remark, code_meaning) value('0021000', '0020000', '', '物理地址');
insert into common_code(code_num, code_type, common_remark, code_meaning) value('0022000', '0020000', '', '电话地址');
insert into common_code(code_num, code_type, common_remark, code_meaning) value('0023000', '0020000', '', '互联网地址');
insert into common_code(code_num, code_type, common_remark, code_meaning) value('0030000', '0', '', '职位类型');
insert into common_code(code_num, code_type, common_remark, code_meaning) value('0040000', '0', '', '行业类型');

DROP TABLE IF EXISTS user_tag;
CREATE TABLE user_tag(
		user_id VARCHAR(20) NOT NULL COMMENT 'user_id 用户编号',
		type_id VARCHAR(8) NOT NULL COMMENT 'type_id 用户类型编号'
) COMMENT 'user_tag 用户标签';

DROP TABLE IF EXISTS business_card;
CREATE TABLE business_card(
    card_id VARCHAR(20) NOT NULL COMMENT 'card_id 卡片编号' ,
    user_id VARCHAR(20) NOT NULL COMMENT 'user_id 用户编号' ,
    user_position VARCHAR(30) NOT NULL COMMENT 'user_position 职位标码值' ,
    user_tel VARCHAR(20) NOT NULL COMMENT 'user_tel 手机号' ,
		company VARCHAR(20) NOT NULL COMMENT 'company 公司' ,
    company_address VARCHAR(20) NOT NULL COMMENT 'company_address 公司地址' ,
    face_url VARCHAR(100) COMMENT 'face_url 头像地址' ,
    user_email VARCHAR(20) COMMENT 'user_email 用户邮箱' ,
    website VARCHAR(20) COMMENT 'website 网址' ,
		cooperate_scope VARCHAR(256) NOT NULL COMMENT 'cooperate_scope 业务合作范围',
    create_time DATETIME NOT NULL COMMENT 'create_time 创建时间' ,
		is_default VARCHAR(1) NOT NULL COMMENT 'is_default 是否默认',
		is_open VARCHAR(1) NOT NULL COMMENT 'is_open 是否公开',
    PRIMARY KEY (card_id)
) COMMENT = 'business_card 电子名片';

DROP TABLE IF EXISTS user_contact_info;
CREATE TABLE user_contact_info(
    user_id VARCHAR(20) NOT NULL COMMENT 'user_id 用户编号' ,
		company VARCHAR(20) NOT NULL COMMENT 'company 公司' ,
		company_address VARCHAR(20) NOT NULL COMMENT 'user_id 公司地址' ,
		user_tel VARCHAR(20) NOT NULL COMMENT 'user_id 用户手机号' ,
    user_fixed_tel VARCHAR(20) COMMENT 'user_fixed_tel 用户电话号码' ,
    user_fax VARCHAR(20) COMMENT 'user_fax 用户传真' ,
    user_wechat VARCHAR(20) COMMENT 'user_wechat 用户微信号' ,
    user_qq VARCHAR(20) COMMENT 'user_qq 用户QQ号' ,
    user_ali VARCHAR(20) COMMENT 'user_ali 用户阿里旺旺号' ,
    user_email VARCHAR(20) COMMENT 'user_email 用户邮箱' ,
    website VARCHAR(20) COMMENT 'website 网址' ,
		cooperate_scope VARCHAR(256) NOT NULL COMMENT 'cooperate_scope 业务合作范围',
    PRIMARY KEY (user_id)
) COMMENT = 'user_contact_info 用户联系信息表';

DROP TABLE IF EXISTS operation_log;
CREATE TABLE operation_log(
    operation_id VARCHAR(50) NOT NULL COMMENT 'operation_id 操作编号' ,
    operation_content VARCHAR(500) NOT NULL COMMENT 'operation_content 操作内容' ,
    operation_time DATETIME NOT NULL COMMENT 'operation_time 操作时间' ,
    operation_user VARCHAR(20) NOT NULL COMMENT 'operation_user 操作人编号' ,
    PRIMARY KEY (operation_id)
) COMMENT = 'operation_log 操作日志表';

DROP TABLE IF EXISTS net_address_info;
CREATE TABLE net_address_info(
		address_id VARCHAR(20) NOT NULL COMMENT 'address_id 地址编号',
		address_content VARCHAR(100) NOT NULL COMMENT 'address_content 地址内容',
		contant_type VARCHAR(8) NOT NULL COMMENT 'contant_type 联系地址类型',
		user_id VARCHAR(20) NOT NULL COMMENT 'user_id 用户编号',
		create_time DATETIME NOT NULL COMMENT 'create_time 创建时间',
		PRIMARY KEY (address_id)
) COMMENT = 'net_address_info 互联网地址信息表';

DROP TABLE IF EXISTS role_info;
CREATE TABLE role_info(
		role_id INT NOT NULL AUTO_INCREMENT COMMENT 'role_id 角色编号',
		role_name VARCHAR(30) NOT NULL COMMENT 'role_name 角色名称',
		remark VARCHAR(100) NOT NULL COMMENT 'remark 角色备注',
		is_use VARCHAR(1) NOT NULL COMMENT 'is_use 是否使用',
		create_time DATETIME NOT NULL COMMENT 'create_time 创建时间',
		create_user VARCHAR(100) NOT NULL COMMENT 'create_user 创建人',
		PRIMARY KEY (role_id)
) COMMENT = 'role_info 角色信息表';
-- 插入角色
insert into role_info(role_name, remark, is_use, create_time, create_user) value("游客", '只能查看商会首页', '1', '2020-11-25 14:22:00', '-');
insert into role_info(role_name, remark, is_use, create_time, create_user) value("商会会员", '可以使用小程序基本功能', '1', '2020-11-25 14:22:00', '-');
insert into role_info(role_name, remark, is_use, create_time, create_user) value("商会管理员", '可以使用小程序基本功能和管理功能', '1', '2020-11-25 14:22:00', '-');

DROP TABLE IF EXISTS user_role;
CREATE TABLE user_role(
		user_id VARCHAR(20) NOT NULL COMMENT 'user_id 用户编号',
		role_id INT NOT NULL COMMENT 'role_id 角色编号'
) COMMENT = 'user_role 用户角色表';

DROP TABLE IF EXISTS menu_info;
CREATE TABLE menu_info(
		menu_id INT NOT NULL AUTO_INCREMENT COMMENT 'menu_id 权限编号',
		parent_id INT NOT NULL COMMENT 'parent_id 上级编号',
		menu_name VARCHAR(30) NOT NULL COMMENT 'menu_name 权限名称',
		url VARCHAR(100) NOT NULL COMMENT 'url 接口路径',
		order_num INT NOT NULL COMMENT 'order_num 菜单顺序号',
		is_use VARCHAR(1) NOT NULL COMMENT 'is_use 是否使用',
		create_time DATETIME NOT NULL COMMENT 'create_time 创建时间',
		create_user VARCHAR(20) NOT NULL COMMENT 'create_user 创建人',
		PRIMARY KEY (menu_id)
) COMMENT = 'menu_info 权限信息表';

DROP TABLE IF EXISTS role_menu;
CREATE TABLE role_menu(
		role_id INT NOT NULL COMMENT 'role_id 角色编号',
		menu_id INT NOT NULL COMMENT 'menu_id 权限编号'
) COMMENT = 'role_menu 角色权限表';


-- 二阶段

DROP TABLE IF EXISTS activity_info;
CREATE TABLE activity_info(
		activity_id VARCHAR(100) NOT NULL COMMENT 'activity_id 活动编号',
		activity_name VARCHAR(100) NOT NULL COMMENT 'activity_name 活动名称',
		activity_content VARCHAR(1000) COMMENT 'activity_content 活动内容',
		start_time DATETIME COMMENT 'start_time 开始时间',
		end_time DATETIME COMMENT 'end_time 结束时间',
		activity_host VARCHAR(100) COMMENT 'activity_host 活动主持人',
		activity_leader VARCHAR(100) NOT NULL COMMENT 'activity_leader 活动负责人',
		create_time DATETIME NOT NULL COMMENT 'create_time 创建时间',
		create_admin VARCHAR(100) NOT NULL COMMENT 'create_admin 创建人',
		PRIMARY KEY (activity_id)
)COMMENT = 'activity_info 活动信息表';

DROP TABLE IF EXISTS seat_info;
CREATE TABLE seat_info(
		seat_id VARCHAR(100) NOT NULL COMMENT 'seat_id 座位编号',
		seat_name VARCHAR(100) NOT NULL COMMENT 'seat_name 座位编号',
		activity_id VARCHAR(100) NOT NULL COMMENT 'activity_id 活动编号',
		people_num INT NOT NULL COMMENT 'people_num 人数',
		is_use VARCHAR(1) NOT NULL COMMENT 'is_use 是否使用',
		create_time DATETIME NOT NULL COMMENT 'create_time 创建时间',
		create_admin VARCHAR(100) NOT NULL COMMENT 'create_admin 创建人',
		PRIMARY KEY (seat_id)
) COMMENT = 'activity_info 座位信息表';

DROP TABLE IF EXISTS activity_participation;
CREATE TABLE activity_participation(
		participation_id VARCHAR(100) NOT NULL COMMENT 'participation_id 报名编号',
		user_id VARCHAR(100) NOT NULL COMMENT 'user_id 用户编号',
		registration_time DATETIME COMMENT 'registration_time 报名时间',
		end_time DATETIME COMMENT 'end_time 结束时间',
		seat_id VARCHAR(100) COMMENT 'seat_id 座位编号',
		activity_id VARCHAR(100) NOT NULL COMMENT 'activity_id 活动编号',
		create_time DATETIME NOT NULL COMMENT 'create_time 创建时间',
		create_admin VARCHAR(100) NOT NULL COMMENT 'create_admin 创建人',
		PRIMARY KEY (participation_id)
) COMMENT = 'activity_participation 活动报名表';

DROP TABLE IF EXISTS prize_info;
CREATE TABLE prize_info(
		prize_id INT NOT NULL AUTO_INCREMENT COMMENT 'prize_id 奖品编号',
		prize_name VARCHAR(30) NOT NULL COMMENT 'prize_name 奖品名称',
		prize_mark VARCHAR(100) NOT NULL COMMENT 'prize_mark 奖品备注',
		prize_num INT NOT NULL COMMENT 'prize_num 奖品数量',
		activity_id VARCHAR(100) NOT NULL COMMENT 'activity_id 活动编号',
		create_time DATETIME NOT NULL COMMENT 'create_time 创建时间',
		create_admin VARCHAR(100) NOT NULL COMMENT 'create_admin 创建人',
		PRIMARY KEY (prize_id)
) COMMENT = 'prize_info 活动奖品信息表';

DROP TABLE IF EXISTS prize_user;
CREATE TABLE prize_user(
		prize_id INT NOT NULL COMMENT 'prize_id 奖品编号',
		user_id VARCHAR(100) NOT NULL COMMENT 'user_id 用户编号',
		activity_id VARCHAR(100) NOT NULL COMMENT 'activity_id 活动编号'
) COMMENT = 'prize_user 获奖用户表';

DROP TABLE IF EXISTS activity_flow;
CREATE TABLE activity_flow(
		flow_id INT NOT NULL COMMENT 'flow_id 流程编号',
		start_time DATETIME NOT NULL COMMENT 'start_time 开始时间',
		end_time DATETIME NOT NULL COMMENT 'end_time 结束时间',
		flow_remark VARCHAR(100) COMMENT 'flow_remark 流程内容',
		activity_id VARCHAR(100) NOT NULL COMMENT 'activity_id 活动编号',
		PRIMARY KEY(flow_id)
) COMMENT = 'activity_flow 活动流程表';