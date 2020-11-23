package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.RoleMenuMapper;
import com.bimda.cdshproject.pojo.RoleMenu;
import com.bimda.cdshproject.service.IRoleMenuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * role_menu 角色权限表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Service("roleMenuService")
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenu> implements IRoleMenuService {

}
