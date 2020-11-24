package com.bimda.cdshproject.controller;

import com.bimda.cdshproject.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.controller
 * @NAME: CommonCodeController
 * @USER: Han
 * @DATE: 2020/11/24
 * @TIME: 10:09
 * @DAY_NAME_SHORT: 周二
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@RestController
@RequestMapping("/bimda/common-code")
@Api(value = "公共标码接口", tags = "公共标码模块接口")
public class CommonCodeController extends BaseController {
}
