package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.AdminRoleMapper;
import com.bimda.cdshproject.pojo.AdminRole;
import com.bimda.cdshproject.service.IAdminRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * admin_role 管理员角色表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Service("adminRoleService")
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleMapper, AdminRole> implements IAdminRoleService {

}
