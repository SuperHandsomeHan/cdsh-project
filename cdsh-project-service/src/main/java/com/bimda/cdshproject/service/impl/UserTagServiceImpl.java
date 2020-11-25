package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.UserTagMapper;
import com.bimda.cdshproject.pojo.UserTag;
import com.bimda.cdshproject.service.IUserTagService;
import org.springframework.stereotype.Service;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.service.impl
 * @NAME: UserTagServiceImpl
 * @USER: Han
 * @DATE: 2020/11/25
 * @TIME: 15:24
 * @DAY_NAME_SHORT: 周三
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Service("userTagService")
public class UserTagServiceImpl extends ServiceImpl<UserTagMapper, UserTag> implements IUserTagService {
}
