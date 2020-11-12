package com.cdshproject.service.impl;

import bimda.cdshproject.mapper.UserInfoMapper;
import bimda.cdshproject.pojo.UserInfo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cdshproject.service.IUserInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * user_info 会员信息表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-11
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
