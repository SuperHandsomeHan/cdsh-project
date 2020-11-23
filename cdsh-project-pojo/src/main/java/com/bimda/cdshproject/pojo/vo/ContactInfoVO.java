package com.bimda.cdshproject.pojo.vo;

import com.bimda.cdshproject.pojo.UserContactInfo;
import com.bimda.cdshproject.pojo.UserInfo;
import lombok.Data;

import java.util.List;

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
 * 用户信息视图
 */
@Data
public class ContactInfoVO {

    /**
     * 用户信息
     */
    private UserInfo userInfo;

    /**
     * 通讯列表信息
     */
    private UserContactInfo contactInfo;
}
