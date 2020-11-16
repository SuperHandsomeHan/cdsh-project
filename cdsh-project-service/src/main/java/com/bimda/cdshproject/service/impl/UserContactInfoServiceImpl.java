package com.bimda.cdshproject.service.impl;

import com.bimda.cdshproject.mapper.UserContactInfoMapper;
import com.bimda.cdshproject.pojo.UserContactInfo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.service.IUserContactInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * contact_list 通讯录 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-11
 */
@Service("userContactInfoService")
public class UserContactInfoServiceImpl extends ServiceImpl<UserContactInfoMapper, UserContactInfo> implements IUserContactInfoService {

}
