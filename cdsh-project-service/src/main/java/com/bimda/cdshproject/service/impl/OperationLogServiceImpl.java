package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.OperationLogMapper;
import com.bimda.cdshproject.pojo.OperationLog;
import com.bimda.cdshproject.service.IOperationLogService;
import org.springframework.stereotype.Service;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.service.impl
 * @NAME: OperationLogServiceImpl
 * @USER: Han
 * @DATE: 2020/11/16
 * @TIME: 10:43
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Service("operationLogService")
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog> implements IOperationLogService {
}
