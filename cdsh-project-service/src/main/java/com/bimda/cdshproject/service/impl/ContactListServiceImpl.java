package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bimda.cdshproject.mapper.ContactListMapper;
import com.bimda.cdshproject.mapper.UserContactInfoMapper;
import com.bimda.cdshproject.mapper.UserInfoMapper;
import com.bimda.cdshproject.pojo.vo.ContactInfoVO;
import com.bimda.cdshproject.service.IContactListService;
import com.bimda.cdshproject.service.exception.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.service.impl
 * @NAME: ContactListServiceImpl
 * @USER: Han
 * @DATE: 2020/11/16
 * @TIME: 13:44
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Service("contactListService")
public class ContactListServiceImpl implements IContactListService {

    @Autowired
    private ContactListMapper contactListMapper;

    /**
     * 根据会员类型编号查询所有联系人
     * @param typeId 类型编号
     * @return
     */
    @Override
    public List<ContactInfoVO> listContactInfoByType(Integer ... typeId) {
        try {
            List<ContactInfoVO> list = new ArrayList<>();
            if(typeId ==  null || typeId.length == 0){
                throw new ApiException("请输入用户类型编号！");
            }
            list = contactListMapper.listContactInfoByType(typeId);
            return list;
        }catch (Exception e){
            throw new ApiException(e);
        }
    }

    /**
     * 查询所有联系人
     * @return
     */
    @Override
    public List<ContactInfoVO> listContactInfo() {
        try {
            List<ContactInfoVO> list = contactListMapper.listContactInfo();
            return list;
        }catch (Exception e){
            throw new ApiException(e);
        }
    }
}
