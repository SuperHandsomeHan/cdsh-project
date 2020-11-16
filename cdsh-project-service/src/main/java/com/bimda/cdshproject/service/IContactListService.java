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
     * 根据会员类型编号查询所有联系人
     * @param typeId 类型编号
     * @return
     */
    List<ContactInfoVO> listContactInfoByType(Integer ... typeId);

    /**
     * 查询所有联系人
     * @return
     */
    List<ContactInfoVO> listContactInfo();
}
