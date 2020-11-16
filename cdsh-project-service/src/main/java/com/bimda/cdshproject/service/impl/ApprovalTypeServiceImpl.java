package com.bimda.cdshproject.service.impl;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.service.impl
 * @NAME: ApprovalTypeServiceImpl
 * @USER: Han
 * @DATE: 2020/11/16
 * @TIME: 10:41
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.ApprovalTypeMapper;
import com.bimda.cdshproject.pojo.ApprovalType;
import com.bimda.cdshproject.service.IApprovalTypeService;
import org.springframework.stereotype.Service;

@Service("approvalTypeService")
public class ApprovalTypeServiceImpl extends ServiceImpl<ApprovalTypeMapper, ApprovalType> implements IApprovalTypeService {
}
