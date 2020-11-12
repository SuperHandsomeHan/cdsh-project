DROP TABLE IF EXISTS user_info;
CREATE TABLE user_info(
    u_id VARCHAR(100) NOT NULL COMMENT 'u_id 用户编号' ,
    u_name VARCHAR(10) NOT NULL COMMENT 'u_name 用户名称' ,
    u_sex VARCHAR(2)  COMMENT 'u_sex 性别' ,
    u_birthday DATE  COMMENT 'u_birthday 生日' ,
    u_native VARCHAR(20) COMMENT 'u_native 籍贯' ,
		u_face VARCHAR(100) COMMENT 'u_face 用户头像',
    PRIMARY KEY (u_id)
) COMMENT = 'user_info 会员信息表';


DROP TABLE IF EXISTS  business_card;
CREATE TABLE business_card(
    card_id VARCHAR(100) NOT NULL COMMENT 'card_id 卡片编号' ,
    u_id VARCHAR(100) NOT NULL COMMENT 'u_id 用户编号' ,
    u_position VARCHAR(10) COMMENT 'u_position 职位标码值' ,
    company VARCHAR(32) NOT NULL COMMENT 'company 公司' ,
    u_tel VARCHAR(11) NOT NULL COMMENT 'u_tel 手机号' ,
    u_region VARCHAR(10) NOT NULL COMMENT 'u_region 地区号' ,
    u_address VARCHAR(100) NOT NULL COMMENT 'u_address 公司地址' ,
    website VARCHAR(100) COMMENT 'website 网址' ,
    u_email VARCHAR(50) COMMENT 'u_email 邮箱' ,
		u_face VARCHAR(100) COMMENT 'u_face 用户头像',
    is_choice VARCHAR(1) COMMENT 'is_choice 是否选用' ,
    PRIMARY KEY (card_id)
) COMMENT = 'business_card 电子名片';


DROP TABLE IF EXISTS  contact_list;
CREATE TABLE contact_list(
    c_id VARCHAR(100) NOT NULL COMMENT 'c_id 编号' ,
    u_id VARCHAR(100) NOT NULL COMMENT 'u_id 用户编号' ,
		u_position VARCHAR(10) NOT NULL 'u_position 常德商会的职位',
    u_tel VARCHAR(11) NOT NULL COMMENT 'u_tel 手机号' ,
    u_region VARCHAR(10) NOT NULL COMMENT 'u_region 地区号' ,
    u_address VARCHAR(100) NOT NULL COMMENT 'u_address 地址' ,
		u_fixed_tel VARCHAR(13) COMMENT 'u_fixed_tel 固话',
    u_fax VARCHAR(13)  COMMENT 'u_fax 传真' ,
    u_wechat VARCHAR(30) COMMENT 'u_wechat 微信号' ,
    u_qq VARCHAR(13) COMMENT 'u_qq QQ号' ,
    u_ali VARCHAR(30) COMMENT 'u_ali 阿里旺旺号' ,
    u_email VARCHAR(50) COMMENT 'u_email 邮箱' ,
    website VARCHAR(100) COMMENT 'website 网址' ,
    PRIMARY KEY (c_id)
) COMMENT = 'contact_list 通讯录';
;