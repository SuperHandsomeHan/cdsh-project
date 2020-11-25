package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.NetAddressInfoMapper;
import com.bimda.cdshproject.pojo.NetAddressInfo;
import com.bimda.cdshproject.service.INetAddressInfoService;
import org.springframework.stereotype.Service;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.service.impl
 * @NAME: NetAddressInfoServiceImpl
 * @USER: Han
 * @DATE: 2020/11/25
 * @TIME: 15:26
 * @DAY_NAME_SHORT: 周三
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Service("netAddressInfoService")
public class NetAddressInfoServiceImpl extends ServiceImpl<NetAddressInfoMapper, NetAddressInfo> implements INetAddressInfoService {
}
