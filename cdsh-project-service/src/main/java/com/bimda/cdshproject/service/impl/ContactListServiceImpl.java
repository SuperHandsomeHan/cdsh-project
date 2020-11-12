package com.bimda.cdshproject.service.impl;

import com.bimda.cdshproject.mapper.ContactListMapper;
import com.bimda.cdshproject.pojo.ContactList;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.service.IContactListService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * contact_list 通讯录 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-11
 */
@Service
public class ContactListServiceImpl extends ServiceImpl<ContactListMapper, ContactList> implements IContactListService {

}
