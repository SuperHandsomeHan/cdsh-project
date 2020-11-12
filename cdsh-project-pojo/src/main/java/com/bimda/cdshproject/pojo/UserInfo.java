package com.bimda.cdshproject.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * <p>
 * user_info 会员信息表
 * </p>
 *
 * @author jobob
 * @since 2020-11-11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_info")
public class UserInfo {

    private static final long serialVersionUID = 1L;

    /**
     * u_id 用户编号
     */
    @TableId
    @ApiModelProperty("用户编号")
    private String uId;

    /**
     * u_name 用户名称
     */
    @ApiModelProperty("用户名称")
    private String uName;

    /**
     * u_sex 性别
     */
    @ApiModelProperty("性别")
    private String uSex;

    /**
     * u_birthday 生日
     */
    @ApiModelProperty("生日")
    private LocalDate uBirthday;

    /**
     * u_native 籍贯
     */
    @ApiModelProperty("籍贯")
    private String uNative;

    /**
     * u_face 头像
     */
    @ApiModelProperty("头像")
    private String uFace;

}
