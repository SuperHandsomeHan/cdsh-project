package com.bimda.cdshproject.controller;

import com.bimda.cdshproject.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.controller
 * @NAME: UserTypeController
 * @USER: Han
 * @DATE: 2020/11/16
 * @TIME: 11:56
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@RestController
@RequestMapping("/bimda/user-type")
@Api(value = "会员类型接口", tags = "会员类型模块接口")
public class UserTypeController extends BaseController {
}
