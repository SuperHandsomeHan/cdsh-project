package com.bimda.cdshproject.controller;

import com.bimda.cdshproject.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.controller
 * @NAME: OperationLogController
 * @USER: Han
 * @DATE: 2020/11/16
 * @TIME: 10:46
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@RestController
@RequestMapping("/bimda/operation-log")
@Api(value = "操作日志接口", tags = "操作日志模块接口")
public class OperationLogController extends BaseController {
}
