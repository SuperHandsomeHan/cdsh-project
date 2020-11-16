package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.ApprovalInfoMapper;
import com.bimda.cdshproject.pojo.ApprovalInfo;
import com.bimda.cdshproject.service.IApprovalInfoService;
import org.springframework.stereotype.Service;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.service.impl
 * @NAME: IApprovalInfoServiceImpl
 * @USER: Han
 * @DATE: 2020/11/16
 * @TIME: 10:39
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Service("approvalInfoService")
public class ApprovalInfoServiceImpl extends ServiceImpl<ApprovalInfoMapper, ApprovalInfo> implements IApprovalInfoService {
}
