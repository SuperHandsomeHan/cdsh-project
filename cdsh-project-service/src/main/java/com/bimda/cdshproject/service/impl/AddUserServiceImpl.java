package com.bimda.cdshproject.service.impl;

import com.bimda.cdshproject.mapper.UserContactInfoMapper;
import com.bimda.cdshproject.mapper.UserInfoMapper;
import com.bimda.cdshproject.pojo.bo.UserBO;
import com.bimda.cdshproject.pojo.vo.UserVO;
import com.bimda.cdshproject.service.IAddUserService;
import com.bimda.cdshproject.service.exception.ApiException;
import com.bimda.cdshproject.utils.TimeStampUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.service.impl
 * @NAME: AddUserServiceImpl
 * @USER: Han
 * @DATE: 2020/11/12
 * @TIME: 17:14
 * @DAY_NAME_SHORT: 周四
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Service("addUserService")
public class AddUserServiceImpl implements IAddUserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserContactInfoMapper contactListMapper;

    /**
     * 添加用户
     * @param bo
     * @return
     */
    @Override
    public UserVO addUser(UserBO bo) {
        try {
            //设置用户编号
            String userId = "SH" + TimeStampUtil.getCurrentTimeMillisName();
            /*bo.getUserInfo().setUId(userId);
            //添加用户信息
            userInfoMapper.insert(bo.getUserInfo());
            //设置用户编号以及通讯录编号
            bo.getContactList().setCId(TimeStampUtil.getCurrentTimeMillisName());
            bo.getContactList().setUId(userId);*/
            //添加通讯录信息
            contactListMapper.insert(bo.getContactList());
            //设置返回对象
            UserVO vo = new UserVO();
            vo.setUserInfo(bo.getUserInfo());
            vo.setContactList(bo.getContactList());
            return vo;
        }catch (Exception e){
            throw new ApiException(e);
        }
    }
}
