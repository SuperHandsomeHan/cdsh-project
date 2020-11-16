package com.bimda.cdshproject.controller;

import com.bimda.cdshproject.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.controller
 * @NAME: ApprovalInfoController
 * @USER: Han
 * @DATE: 2020/11/16
 * @TIME: 10:45
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@RestController
@RequestMapping("/bimda/approval-info")
@Api(value = "审批信息接口", tags = "审批信息模块接口")
public class ApprovalInfoController extends BaseController {
}
