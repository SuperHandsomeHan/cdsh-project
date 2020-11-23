package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.RoleInfoMapper;
import com.bimda.cdshproject.pojo.RoleInfo;
import com.bimda.cdshproject.service.IRoleInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * role_info 角色信息表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Service("roleInfoService")
public class RoleInfoServiceImpl extends ServiceImpl<RoleInfoMapper, RoleInfo> implements IRoleInfoService {

}
