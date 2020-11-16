package com.bimda.cdshproject.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * <p>
 * business_card 电子名片
 * </p>
 *
 * @author jobob
 * @since 2020-11-11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "business_card")
public class BusinessCard {

    private static final long serialVersionUID = 1L;

    /** card_id;卡片编号 */
    @Id
    @ApiModelProperty("卡片编号")
    private String cardId ;

    /** user_id;用户编号 */
    @ApiModelProperty("用户编号")
    private String userId ;

    /** user_position;职位标码值 */
    @ApiModelProperty("职位标码值")
    private String userPosition ;

    /** company;公司 */
    @ApiModelProperty("公司")
    private String company ;

    /** user_tel;手机号 */
    @ApiModelProperty("手机号")
    private String userTel ;

    /** user_region;地区号 */
    @ApiModelProperty("地区号")
    private String userRegion ;

    /** user_address;公司地址 */
    @ApiModelProperty("公司地址")
    private String userAddress ;

    /** face_url;头像地址 */
    @ApiModelProperty("头像地址")
    private String faceUrl ;

    /** user_email;用户邮箱 */
    @ApiModelProperty("用户邮箱")
    private String userEmail ;

    /** website;网址 */
    @ApiModelProperty("网址")
    private String website ;

    /** create_time;创建时间 */
    @ApiModelProperty("创建时间")
    private Date createTime ;

}
