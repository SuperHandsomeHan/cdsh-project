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
 * user_info 会员信息表
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_info")
@EqualsAndHashCode(callSuper = false)
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

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
     * face_url 用户头像
     */
    @ApiModelProperty("用户头像")
    private String faceUrl;

    /**
     * company 公司
     */
    @ApiModelProperty("公司")
    private String company;

    /**
     * user_region 用户地区编号
     */
    @ApiModelProperty("用户地区编号")
    private String userRegion;

    /**
     * user_address 用户地址
     */
    @ApiModelProperty("用户地址")
    private String userAddress;

    /**
     * user_tel 用户手机号
     */
    @ApiModelProperty("用户手机号")
    private String userTel;

    /**
     * cooperate_scope 业务合作范围
     */
    @ApiModelProperty("业务合作范围")
    private String cooperateScope;

    /**
     * user_type 用户类型
     */
    @ApiModelProperty("用户类型")
    private Integer userType;

    /**
     * create_time 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * create_time 创建人员
     */
    @ApiModelProperty("创建人员")
    private String createAdmin;


}
