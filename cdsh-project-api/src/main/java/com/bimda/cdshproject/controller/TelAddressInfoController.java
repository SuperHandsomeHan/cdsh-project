package com.bimda.cdshproject.controller;

import com.bimda.cdshproject.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.controller
 * @NAME: TelAddressInfoController
 * @USER: Han
 * @DATE: 2020/11/26
 * @TIME: 9:47
 * @DAY_NAME_SHORT: 周四
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@RestController
@RequestMapping("/tel_address_info")
@Api(value = "电话地址信息表接口", tags = "电话地址信息表模块接口")
public class TelAddressInfoController extends BaseController {
}
