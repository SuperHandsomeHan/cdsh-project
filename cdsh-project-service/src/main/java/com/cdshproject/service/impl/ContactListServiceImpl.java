package com.cdshproject.service.impl;

import com.cdshproject.mapper.ContactListMapper;
import com.cdshproject.pojo.ContactList;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cdshproject.service.IContactListService;
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
