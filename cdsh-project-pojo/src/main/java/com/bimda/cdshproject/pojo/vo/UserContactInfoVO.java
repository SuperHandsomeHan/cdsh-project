package com.bimda.cdshproject.pojo.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.pojo.vo
 * @NAME: UserContactInfoVO
 * @USER: Han
 * @DATE: 2020/11/26
 * @TIME: 9:29
 * @DAY_NAME_SHORT: 周四
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Data
public class UserContactInfoVO {
    /**
     * user_id 用户编号
     */
    @TableId(value = "user_id")
    @ApiModelProperty("用户编号")
    private String userId;

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
     * user_tel 用户手机号
     */
    @ApiModelProperty("用户手机号")
    private String userTel;

    /**
     * user_fixed_tel 用户固话
     */
    @ApiModelProperty("用户固话")
    private String userFixedTel;

    /**
     * user_fax 用户传真
     */
    @ApiModelProperty("用户传真")
    private String userFax;

    /**
     * user_wechat 用户微信号
     */
    @ApiModelProperty("用户微信号")
    private String userWechat;

    /**
     * user_qq 用户QQ号
     */
    @ApiModelProperty("用户QQ号")
    private String userQq;

    /**
     * user_ali 用户阿里旺旺号
     */
    @ApiModelProperty("用户阿里旺旺号")
    private String userAli;

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
}
