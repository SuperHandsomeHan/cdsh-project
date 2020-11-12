package com.bimda.cdshproject.service.impl;

import com.bimda.cdshproject.mapper.UserInfoMapper;
import com.bimda.cdshproject.pojo.UserInfo;
import com.bimda.cdshproject.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.service.exception.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * user_info 会员信息表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-11
 */
@Service("userInfoService")
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

    @Autowired
    private UserInfoMapper mapper;

    /**
     * 根据用户编号查询用户
     * @param uId 用户编号
     * @return
     */
    @Override
    public UserInfo selectUserById(String uId) {
        try {
            UserInfo userInfo = mapper.selectById(uId);
            return userInfo;
        }catch (Exception e){
            throw new ApiException(e);
        }
    }
}
