package com.bimda.cdshproject.pojo.bo;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.pojo.bo
 * @NAME: UserRoleBO
 * @USER: Han
 * @DATE: 2020/11/27
 * @TIME: 9:44
 * @DAY_NAME_SHORT: 周五
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Data
public class UserRoleBO {

    /**
     * user_id 用户编号
     */
    @TableId(value = "user_id")
    @ApiModelProperty("用户编号")
    private String userId;

    /**
     * role_id 角色编号
     */
    @ApiModelProperty("角色编号")
    private Integer[] roleIds;
}
