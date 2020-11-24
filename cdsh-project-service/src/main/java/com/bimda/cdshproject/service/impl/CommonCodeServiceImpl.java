package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.CommonCodeMapper;
import com.bimda.cdshproject.pojo.CommonCode;
import com.bimda.cdshproject.service.ICommonCodeService;
import org.springframework.stereotype.Service;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.service.impl
 * @NAME: CommonCodeServiceImpl
 * @USER: Han
 * @DATE: 2020/11/24
 * @TIME: 10:06
 * @DAY_NAME_SHORT: 周二
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Service("commonCodeService")
public class CommonCodeServiceImpl extends ServiceImpl<CommonCodeMapper, CommonCode> implements ICommonCodeService {
}
