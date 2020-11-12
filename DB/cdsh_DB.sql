DROP TABLE IF EXISTS user_info;
CREATE TABLE user_info(
    u_id VARCHAR(100) NOT NULL COMMENT 'u_id �û����' ,
    u_name VARCHAR(10) NOT NULL COMMENT 'u_name �û�����' ,
    u_sex VARCHAR(2)  COMMENT 'u_sex �Ա�' ,
    u_birthday DATE  COMMENT 'u_birthday ����' ,
    u_native VARCHAR(20) COMMENT 'u_native ����' ,
		u_face VARCHAR(100) COMMENT 'u_face �û�ͷ��',
    PRIMARY KEY (u_id)
) COMMENT = 'user_info ��Ա��Ϣ��';


DROP TABLE IF EXISTS  business_card;
CREATE TABLE business_card(
    card_id VARCHAR(100) NOT NULL COMMENT 'card_id ��Ƭ���' ,
    u_id VARCHAR(100) NOT NULL COMMENT 'u_id �û����' ,
    u_position VARCHAR(10) COMMENT 'u_position ְλ����ֵ' ,
    company VARCHAR(32) NOT NULL COMMENT 'company ��˾' ,
    u_tel VARCHAR(11) NOT NULL COMMENT 'u_tel �ֻ���' ,
    u_region VARCHAR(10) NOT NULL COMMENT 'u_region ������' ,
    u_address VARCHAR(100) NOT NULL COMMENT 'u_address ��˾��ַ' ,
    website VARCHAR(100) COMMENT 'website ��ַ' ,
    u_email VARCHAR(50) COMMENT 'u_email ����' ,
		u_face VARCHAR(100) COMMENT 'u_face �û�ͷ��',
    is_choice VARCHAR(1) COMMENT 'is_choice �Ƿ�ѡ��' ,
    PRIMARY KEY (card_id)
) COMMENT = 'business_card ������Ƭ';


DROP TABLE IF EXISTS  contact_list;
CREATE TABLE contact_list(
    c_id VARCHAR(100) NOT NULL COMMENT 'c_id ���' ,
    u_id VARCHAR(100) NOT NULL COMMENT 'u_id �û����' ,
		u_position VARCHAR(10) NOT NULL 'u_position �����̻��ְλ',
    u_tel VARCHAR(11) NOT NULL COMMENT 'u_tel �ֻ���' ,
    u_region VARCHAR(10) NOT NULL COMMENT 'u_region ������' ,
    u_address VARCHAR(100) NOT NULL COMMENT 'u_address ��ַ' ,
		u_fixed_tel VARCHAR(13) COMMENT 'u_fixed_tel �̻�',
    u_fax VARCHAR(13)  COMMENT 'u_fax ����' ,
    u_wechat VARCHAR(30) COMMENT 'u_wechat ΢�ź�' ,
    u_qq VARCHAR(13) COMMENT 'u_qq QQ��' ,
    u_ali VARCHAR(30) COMMENT 'u_ali ����������' ,
    u_email VARCHAR(50) COMMENT 'u_email ����' ,
    website VARCHAR(100) COMMENT 'website ��ַ' ,
    PRIMARY KEY (c_id)
) COMMENT = 'contact_list ͨѶ¼';
;