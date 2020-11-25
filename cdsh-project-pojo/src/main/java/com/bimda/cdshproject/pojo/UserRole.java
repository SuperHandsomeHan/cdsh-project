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
 * user_role 用户角色表
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_role")
@EqualsAndHashCode(callSuper = false)
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * user_id 用户编号
     */
    @ApiModelProperty("用户编号")
    private String userId;

    /**
     * role_id 角色编号
     */
    @ApiModelProperty("角色编号")
    private Integer roleId;


}
