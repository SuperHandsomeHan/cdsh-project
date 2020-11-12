package com.cdshproject.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * <p>
 * contact_list 通讯录
 * </p>
 *
 * @author jobob
 * @since 2020-11-11
 */
@Data
public class ContactList {

    private static final long serialVersionUID = 1L;

    /**
     * c_id 编号
     */
    private String cId;

    /**
     * u_id 用户编号
     */
    private String uId;

    /**
     * u_tel 手机号
     */
    private String uTel;

    /**
     * u_region 地区号
     */
    private String uRegion;

    /**
     * u_address 地址
     */
    private String uAddress;

    /**
     * u_fixed_tel 固话
     */
    private String uFixedTel;

    /**
     * u_fax 传真
     */
    private String uFax;

    /**
     * u_wechat 微信号
     */
    private String uWechat;

    /**
     * u_qq QQ号
     */
    private String uQq;

    /**
     * u_ali 阿里旺旺号
     */
    private String uAli;

    /**
     * u_email 邮箱
     */
    private String uEmail;

    /**
     * website 网址
     */
    private String website;


}
