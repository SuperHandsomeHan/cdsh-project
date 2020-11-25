package com.bimda.cdshproject.controller;

import com.bimda.cdshproject.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.controller
 * @NAME: NetAddressInfoController
 * @USER: Han
 * @DATE: 2020/11/25
 * @TIME: 15:27
 * @DAY_NAME_SHORT: 周三
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@RestController
@RequestMapping("/net-address-info")
@Api(value = "互联网地址信息接口", tags = "互联网地址信息模块接口")
public class NetAddressInfoController extends BaseController {
}
