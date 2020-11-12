package bimda.cdshproject.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * business_card 电子名片
 * </p>
 *
 * @author jobob
 * @since 2020-11-11
 */
@Data
public class BusinessCard {

    private static final long serialVersionUID = 1L;

    /**
     * card_id 卡片编号
     */
    private String cardId;

    /**
     * u_id 用户编号
     */
    private String uId;

    /**
     * u_position 职位标码值
     */
    private String uPosition;

    /**
     * company 公司
     */
    private String company;

    /**
     * u_tel 手机号
     */
    private String uTel;

    /**
     * u_region 地区号
     */
    private String uRegion;

    /**
     * u_address 公司地址
     */
    private String uAddress;

    /**
     * website 网址
     */
    private String website;

    /**
     * u_email 邮箱
     */
    private String uEmail;

    /**
     * is_choice 是否选用
     */
    private String isChoice;

    /**
     * u_face 头像
     */
    private String uFace;

}
