DROP TABLE IF EXISTS user_info;
CREATE TABLE user_info(
    user_id VARCHAR(100) NOT NULL   COMMENT 'user_id 用户编号' ,
    user_name VARCHAR(16) NOT NULL   COMMENT 'user_name 用户名称' ,
    user_native VARCHAR(50) NOT NULL   COMMENT 'user_native 用户籍贯' ,
    user_position VARCHAR(10) NOT NULL   COMMENT 'user_position 用户职位标识码' ,
    face_url VARCHAR(100) NOT NULL   COMMENT 'face_url 用户头像' ,
    open_id VARCHAR(100) NOT NULL   COMMENT 'open_id 微信唯一标识' ,
    company VARCHAR(40) NOT NULL   COMMENT 'company 公司' ,
    user_region VARCHAR(10) NOT NULL   COMMENT 'user_region 用户地区编号' ,
    user_address VARCHAR(100) NOT NULL   COMMENT 'user_address 用户地址' ,
    user_tel VARCHAR(11) NOT NULL   COMMENT 'user_tel 用户手机号' ,
    cooperate_scope VARCHAR(1000) NOT NULL   COMMENT 'cooperate_scope 业务合作范围' ,
		user_type INT NOT NULL COMMENT 'user_type 用户类型',
    PRIMARY KEY (user_id)
) COMMENT = 'user_info 会员信息表';

DROP TABLE IF EXISTS user_type;
CREATE TABLE user_type(
    type_id INT NOT NULL  AUTO_INCREMENT COMMENT 'type_id 类型编号' ,
    type_name VARCHAR(30) NOT NULL   COMMENT 'type_name 类型名称' ,
    PRIMARY KEY (type_id)
) COMMENT = 'user_type 会员类型表';

DROP TABLE IF EXISTS business_card;
CREATE TABLE business_card(
    card_id VARCHAR(100) NOT NULL   COMMENT 'card_id 卡片编号' ,
    user_id VARCHAR(100) NOT NULL   COMMENT 'user_id 用户编号' ,
    user_position VARCHAR(10) NOT NULL   COMMENT 'user_position 职位标码值' ,
    user_tel VARCHAR(11) NOT NULL   COMMENT 'user_tel 手机号' ,
    user_region VARCHAR(10) NOT NULL   COMMENT 'user_region 地区号' ,
    user_address VARCHAR(100) NOT NULL   COMMENT 'user_address 公司地址' ,
    face_url VARCHAR(100)    COMMENT 'face_url 头像地址' ,
    user_email VARCHAR(50)    COMMENT 'user_email 用户邮箱' ,
    website VARCHAR(100)    COMMENT 'website 网址' ,
    create_time DATETIME NOT NULL   COMMENT 'create_time 创建时间' ,
    PRIMARY KEY (card_id)
) COMMENT = 'business_card 电子名片';

DROP TABLE IF EXISTS user_contact_info;
CREATE TABLE user_contact_info(
    user_id VARCHAR(100) NOT NULL   COMMENT 'user_id 用户编号' ,
    user_fixed_tel VARCHAR(12)    COMMENT 'user_fixed_tel 用户电话号码' ,
    user_fax VARCHAR(20)    COMMENT 'user_fax 用户传真' ,
    user_wechat VARCHAR(30)    COMMENT 'user_wechat 用户微信号' ,
    user_qq VARCHAR(13)    COMMENT 'user_qq 用户QQ号' ,
    user_ali VARCHAR(30)    COMMENT 'user_ali 用户阿里旺旺号' ,
    user_email VARCHAR(50)    COMMENT 'user_email 用户邮箱' ,
    website VARCHAR(100)    COMMENT 'website 网址' ,
    PRIMARY KEY (user_id)
) COMMENT = 'user_contact_info 用户联系信息表';

DROP TABLE IF EXISTS approval_info;
CREATE TABLE approval_info(
    approveal_id VARCHAR(100) NOT NULL   COMMENT 'approveal_id 审批编号' ,
    type_id INT NOT NULL   COMMENT 'type_id 审批类型编号' ,
    approveal_content VARCHAR(500) NOT NULL   COMMENT 'approveal_content 审批内容' ,
    approveal_time DATETIME NOT NULL   COMMENT 'approveal_time 审批时间' ,
    approveal_result VARCHAR(1)    COMMENT 'approveal_result 审批结果' ,
    PRIMARY KEY (approveal_id)
) COMMENT = 'approval_info 审批信息表';

DROP TABLE IF EXISTS approval_type;
CREATE TABLE approval_type(
    type_id INT NOT NULL AUTO_INCREMENT  COMMENT 'type_id 审批类型编号' ,
    type_name VARCHAR(12) NOT NULL   COMMENT 'type_name 审批类型名称' ,
    PRIMARY KEY (type_id,type_name)
) COMMENT = 'approval_type 审批类型表';

DROP TABLE IF EXISTS operation_log;
CREATE TABLE operation_log(
    operation_id VARCHAR(50) NOT NULL   COMMENT 'operation_id 操作编号' ,
    operation_content VARCHAR(500) NOT NULL   COMMENT 'operation_content 操作内容' ,
    operation_time DATE NOT NULL   COMMENT 'operation_time 操作时间' ,
    operation_admin VARCHAR(100) NOT NULL   COMMENT 'operation_admin 操作人编号' ,
    PRIMARY KEY (operation_id)
) COMMENT = 'operation_log 操作日志表';
;
insert into user_type(type_name) value('商会会员');