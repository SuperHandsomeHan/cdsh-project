package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.UserRoleMapper;
import com.bimda.cdshproject.pojo.UserRole;
import com.bimda.cdshproject.service.IUserRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * admin_role 用户角色表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Service("userRoleService")
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
