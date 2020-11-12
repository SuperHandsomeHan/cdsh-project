package com.bimda.cdshproject.service;

import com.bimda.cdshproject.pojo.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * user_info 会员信息表 服务类
 * </p>
 *
 * @author jobob
 * @since 2020-11-11
 */
public interface IUserInfoService extends IService<UserInfo> {

    /**
     * 根据用户编号查询用户
     * @param uId 用户编号
     * @return
     */
    UserInfo selectUserById(String uId);
}
