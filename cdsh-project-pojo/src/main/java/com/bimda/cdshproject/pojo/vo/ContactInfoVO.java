package com.bimda.cdshproject.pojo.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.bimda.cdshproject.pojo.UserContactInfo;
import com.bimda.cdshproject.pojo.UserInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.pojo.vo
 * @NAME: UserVO
 * @USER: Han
 * @DATE: 2020/11/12
 * @TIME: 17:10
 * @DAY_NAME_SHORT: 周四
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */

/**
 * 用户信息视图
 */
@Data
public class ContactInfoVO {

    /**
     * user_id 用户编号
     */
    @TableId(value = "user_id")
    @ApiModelProperty("用户编号")
    private String userId;

    /**
     * user_name 用户名称
     */
    @ApiModelProperty("用户名称")
    private String userName;

    /**
     * face_url 用户头像
     */
    @ApiModelProperty("用户头像")
    private String faceUrl;

    /**
     * user_native 用户籍贯
     */
    @ApiModelProperty("用户籍贯")
    private String userNative;

    /**
     * user_position 用户职位标识码
     */
    @ApiModelProperty("用户职位标识码")
    private String userPosition;

    /**
     * company 公司
     */
    @ApiModelProperty("公司")
    private String company;

    /**
     * company_area 公司地址
     */
    @ApiModelProperty("公司地区号")
    private String companyArea;

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
