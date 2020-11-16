package com.bimda.cdshproject.pojo.bo;

import com.bimda.cdshproject.pojo.UserContactInfo;
import com.bimda.cdshproject.pojo.UserInfo;
import lombok.Data;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.pojo.vo
 * @NAME: UserVO
 * @USER: Han
 * @DATE: 2020/11/12
 * @TIME: 17:10
 * @DAY_NAME_SHORT: 周四
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */

/**
 * 用户信息输入
 */
@Data
public class UserBO {

    /**
     * 用户信息
     */
    private UserInfo userInfo;

    /**
     * 通讯列表信息
     */
    private UserContactInfo contactList;
}
