package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.PhyAddressInfoMapper;
import com.bimda.cdshproject.pojo.PhyAddressInfo;
import com.bimda.cdshproject.service.IPhyAddressInfoService;
import org.springframework.stereotype.Service;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.service.impl
 * @NAME: PhyAddressInfoServcie
 * @USER: Han
 * @DATE: 2020/11/26
 * @TIME: 9:45
 * @DAY_NAME_SHORT: 周四
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Service("phyAddressInfoService")
public class PhyAddressInfoServiceImpl extends ServiceImpl<PhyAddressInfoMapper, PhyAddressInfo> implements IPhyAddressInfoService {
}
