package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.TelAddressInfoMapper;
import com.bimda.cdshproject.pojo.TelAddressInfo;
import com.bimda.cdshproject.service.ITelAddressInfoService;
import org.springframework.stereotype.Service;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.service.impl
 * @NAME: TelAddressInfoServiceImpl
 * @USER: Han
 * @DATE: 2020/11/26
 * @TIME: 9:42
 * @DAY_NAME_SHORT: 周四
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Service("telAddressInfoService")
public class TelAddressInfoServiceImpl extends ServiceImpl<TelAddressInfoMapper, TelAddressInfo> implements ITelAddressInfoService {
}
