package com.bimda.cdshproject.service;

import com.bimda.cdshproject.pojo.vo.ContactInfoVO;

import java.util.List;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.service
 * @NAME: IContactListService
 * @USER: Han
 * @DATE: 2020/11/16
 * @TIME: 13:36
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
public interface IContactListService {

    /**
     * 根据角色编号编号查询所有联系人
     * @param roleIds 所有角色编号
     * @return
     */
    List<ContactInfoVO> listContactInfoByRoleId(Integer ... roleIds);

    /**
     * 查询所有联系人
     * @return
     */
    List<ContactInfoVO> listContactInfo();

    /**
     * 根据条件查询所有联系人
     * @param condition 条件
     * @param roleIds 角色编号
     * @return
     */
    List<ContactInfoVO> listContactInfoByCondition(String condition, Integer[] roleIds);
}
