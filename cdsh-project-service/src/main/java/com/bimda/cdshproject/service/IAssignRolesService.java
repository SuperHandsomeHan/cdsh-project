package com.bimda.cdshproject.service;

import com.bimda.cdshproject.pojo.bo.UserRoleBO;
import com.bimda.cdshproject.pojo.vo.UserRoleVO;

import java.util.List;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.service
 * @NAME: ISetUserRole
 * @USER: Han
 * @DATE: 2020/11/27
 * @TIME: 9:43
 * @DAY_NAME_SHORT: 周五
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
public interface IAssignRolesService {

    /**
     * 分配角色
     * @param bo 用户角色
     * @return
     */
    List<UserRoleVO> assignRoles(UserRoleBO bo);
}
