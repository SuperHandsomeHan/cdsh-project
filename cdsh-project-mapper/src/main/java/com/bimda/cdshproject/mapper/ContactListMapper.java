package com.bimda.cdshproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.mapper.Mapper;
import com.bimda.cdshproject.pojo.UserContactInfo;
import com.bimda.cdshproject.pojo.UserInfo;
import com.bimda.cdshproject.pojo.vo.ContactInfoVO;

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
public interface ContactListMapper{

    /**
     * 根据类型编号查询所有联系人信息
     * @param typeId 类型编号
     * @return
     */
    List<ContactInfoVO> listContactInfoByType(Integer ... typeId);

    /**
     * 根据类型编号查询所有联系人信息
     * @param typeId 类型编号
     * @return
     */
    List<UserInfo> listUserInfoByType(Integer ... typeId);

    /**
     * 查询所有联系人信息
     * @return
     */
    List<ContactInfoVO> listContactInfo();
}
