package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.UserTypeMapper;
import com.bimda.cdshproject.pojo.UserType;
import com.bimda.cdshproject.service.IUserTypeService;
import org.springframework.stereotype.Service;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.service.impl
 * @NAME: UserTypeServiceImpl
 * @USER: Han
 * @DATE: 2020/11/16
 * @TIME: 11:55
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Service("userTypeService")
public class UserTypeServiceImpl extends ServiceImpl<UserTypeMapper, UserType> implements IUserTypeService {
}
