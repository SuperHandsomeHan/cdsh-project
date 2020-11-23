package com.bimda.cdshproject.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * role_info 角色信息表
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "role_info")
@EqualsAndHashCode(callSuper = false)
public class RoleInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * role_id 角色编号
     */
    @TableId(value = "role_id", type = IdType.AUTO)
    @ApiModelProperty("角色编号")
    private Integer roleId;

    /**
     * role_name 角色名称
     */
    @ApiModelProperty("角色名称")
    private String roleName;

    /**
     * remark 角色备注
     */
    @ApiModelProperty("角色备注")
    private String remark;

    /**
     * is_use 是否使用
     */
    @ApiModelProperty("是否使用")
    private String isUse;

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
