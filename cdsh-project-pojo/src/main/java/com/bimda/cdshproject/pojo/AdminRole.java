package com.bimda.cdshproject.pojo;

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
 * admin_role 管理员角色表
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "admin_role")
@EqualsAndHashCode(callSuper = false)
public class AdminRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * admin_id 管理员编号
     */
    @ApiModelProperty("管理员编号")
    private String adminId;

    /**
     * role_id 角色编号
     */
    @ApiModelProperty("角色编号")
    private Integer roleId;


}
