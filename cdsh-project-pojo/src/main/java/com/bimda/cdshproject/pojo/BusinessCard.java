package com.bimda.cdshproject.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * business_card 电子名片
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "business_card")
@EqualsAndHashCode(callSuper = false)
public class BusinessCard implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * card_id 卡片编号
     */
    @TableId(value = "card_id")
    @ApiModelProperty("卡片编号")
    private String cardId;

    /**
     * user_id 用户编号
     */
    @ApiModelProperty("用户编号")
    private String userId;

    /**
     * user_position 职位标码值
     */
    @ApiModelProperty("职位标码值")
    private String userPosition;

    /**
     * user_tel 手机号
     */
    @ApiModelProperty("手机号")
    private String userTel;

    /**
     * company 公司
     */
    @ApiModelProperty("公司")
    private String company;

    /**
     * company_address 公司地址
     */
    @ApiModelProperty("公司地址")
    private String companyAddress;

    /**
     * face_url 头像地址
     */
    @ApiModelProperty("头像地址头像地址")
    private String faceUrl;

    /**
     * user_email 用户邮箱
     */
    @ApiModelProperty("用户邮箱")
    private String userEmail;

    /**
     * website 网址
     */
    @ApiModelProperty("网址")
    private String website;

    /**
     * cooperate_scope 业务合作范围
     */
    @ApiModelProperty("业务合作范围")
    private String cooperateScope;

    /**
     * create_time 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * is_default 是否默认
     */
    @ApiModelProperty("是否默认")
    private String isDefault;

    /**
     * is_open 是否公开
     */
    @ApiModelProperty("是否公开")
    private String isOpen;

}
