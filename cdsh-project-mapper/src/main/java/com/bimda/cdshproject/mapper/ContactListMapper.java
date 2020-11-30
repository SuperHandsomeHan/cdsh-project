package com.bimda.cdshproject.mapper;

import com.bimda.cdshproject.pojo.UserInfo;
import com.bimda.cdshproject.pojo.vo.ContactInfoVO;
import com.bimda.cdshproject.pojo.vo.UserInfoVO;

import java.util.List;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.mapper
 * @NAME: ContactListMapper
 * @USER: Han
 * @DATE: 2020/11/16
 * @TIME: 13:50
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
public interface ContactListMapper {

    /**
     * 根据类型编号查询所有联系人信息
     * @param roleId 类型编号
     * @return
     */
    List<UserInfoVO> listContactInfoByRoleId(Integer ... roleId);

    /**
     * 根据条件以及类型编号查询所有联系人信息
     * @param roleId 类型编号
     * @return
     */
    List<UserInfoVO> listContactInfoByRoleIdAndCondition(String condition, Integer ... roleId);

    /**
     * 查询所有联系人信息
     * @return
     */
    List<UserInfoVO> listContactInfo();
}
