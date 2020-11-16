package com.bimda.cdshproject.service;

import com.bimda.cdshproject.pojo.bo.UserBO;
import com.bimda.cdshproject.pojo.vo.ContactInfoVO;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.service
 * @NAME: AddUserService
 * @USER: Han
 * @DATE: 2020/11/12
 * @TIME: 17:09
 * @DAY_NAME_SHORT: 周四
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
public interface IAddUserService {

    /**
     * 添加用户
     * @param bo
     * @return
     */
    ContactInfoVO addUser(UserBO bo);
}
