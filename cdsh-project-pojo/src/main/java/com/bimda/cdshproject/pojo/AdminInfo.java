package com.bimda.cdshproject.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * admin_info 管理员信息表
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "admin_info")
@EqualsAndHashCode(callSuper = false)
public class AdminInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * admin_id 管理员编号
     */
    @TableId(value = "admin_id")
    @ApiModelProperty("管理员编号")
    private String adminId;

    /**
     * admin_name 管理员名称
     */
    @ApiModelProperty("管理员名称")
    private String adminName;

    /**
     * passwork 管理员密码
     */
    @ApiModelProperty("管理员密码")
    private String passwork;

    /**
     * admin_tel 管理员手机号
     */
    @ApiModelProperty("管理员手机号")
    private String adminTel;

    /**
     * admin_email 管理员邮箱
     */
    @ApiModelProperty("管理员邮箱")
    private String adminEmail;

    /**
     * id_card_num 管理员身份证号码
     */
    @ApiModelProperty("管理员身份证号码")
    private String idCardNum;

    /**
     * create_time 创建时间
     */
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    /**
     * create_admin 创建人
     */
    @ApiModelProperty("创建人")
    private String createAdmin;


}
