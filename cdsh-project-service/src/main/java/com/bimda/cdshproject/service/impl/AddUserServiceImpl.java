package com.bimda.cdshproject.service.impl;

import com.bimda.cdshproject.mapper.ContactListMapper;
import com.bimda.cdshproject.mapper.UserInfoMapper;
import com.bimda.cdshproject.pojo.UserInfo;
import com.bimda.cdshproject.pojo.bo.UserBO;
import com.bimda.cdshproject.pojo.vo.UserVO;
import com.bimda.cdshproject.service.AddUserService;
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
public class AddUserServiceImpl implements AddUserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private ContactListMapper contactListMapper;

    /**
     * 添加用户
     * @param bo
     * @return
     */
    @Override
    public UserVO addUser(UserBO bo) {
        try {
            String userId = TimeStampUtil.getCurrentTimeMillisName();
            bo.getUserInfo().setUId(userId);
            userInfoMapper.insert(bo.getUserInfo());
            bo.getContactList().setCId(TimeStampUtil.getCurrentTimeMillisName());
            bo.getContactList().setUId(userId);
            contactListMapper.insert(bo.getContactList());
        }catch (Exception e){
            throw new ApiException(e);
        }
    }
}
