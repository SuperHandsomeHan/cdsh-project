package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.AdminInfoMapper;
import com.bimda.cdshproject.pojo.AdminInfo;
import com.bimda.cdshproject.service.IAdminInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * admin_info 管理员信息表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Service("adminInfoService")
public class AdminInfoServiceImpl extends ServiceImpl<AdminInfoMapper, AdminInfo> implements IAdminInfoService {

}
