package com.bimda.cdshproject.service.impl;

import com.bimda.cdshproject.mapper.RoleInfoMapper;
import com.bimda.cdshproject.mapper.UserRoleMapper;
import com.bimda.cdshproject.pojo.RoleInfo;
import com.bimda.cdshproject.pojo.UserRole;
import com.bimda.cdshproject.pojo.bo.UserRoleBO;
import com.bimda.cdshproject.pojo.vo.UserRoleVO;
import com.bimda.cdshproject.service.IAssignRolesService;
import com.bimda.cdshproject.service.exception.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.service.impl
 * @NAME: AssignRolesServiceImpl
 * @USER: Han
 * @DATE: 2020/11/27
 * @TIME: 9:46
 * @DAY_NAME_SHORT: 周五
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Transactional(rollbackFor=Exception.class)
@Service("assignRolesService")
public class AssignRolesServiceImpl implements IAssignRolesService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private RoleInfoMapper roleInfoMapper;

    /**
     * 分配角色
     * @param bo 角色角色
     * @return
     */
    @Override
    public List<UserRoleVO> assignRoles(UserRoleBO bo) {
        List<UserRoleVO> list = new ArrayList<>();
        Integer[] roleIds = bo.getRoleIds();
        String userId = bo.getUserId();
        try {
            if(roleIds == null || roleIds.length == 0){
                throw new ApiException("角色不存在");
            }
            if(userId == null || userId.equals("")){
                throw new ApiException("用户不存在！");
            }
            Map map = new HashMap();
            map.put("user_id", userId);
            userRoleMapper.deleteByMap(map);
            for (Integer roleId : roleIds){
                RoleInfo roleInfo = new RoleInfo();
                //获取角色信息
                roleInfo = roleInfoMapper.selectById(roleId);
                if(roleInfo != null){
                    //设置用户角色
                    UserRole userRole = new UserRole();
                    userRole.setUserId(userId);
                    userRole.setRoleId(roleId);
                    userRoleMapper.insert(userRole);
                    //转换角色信息
                    UserRoleVO vo = new UserRoleVO();
                    vo.setUserId(userId);
                    vo.setRoleId(roleInfo.getRoleId());
                    vo.setRoleName(roleInfo.getRoleName());
                    list.add(vo);
                }
            }

        }catch (Exception e){
            throw new ApiException(e);
        }
        return list;
    }
}
