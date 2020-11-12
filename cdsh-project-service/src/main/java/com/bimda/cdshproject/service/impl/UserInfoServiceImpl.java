package com.bimda.cdshproject.service.impl;

import com.bimda.cdshproject.mapper.UserInfoMapper;
import com.bimda.cdshproject.pojo.UserInfo;
import com.bimda.cdshproject.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
