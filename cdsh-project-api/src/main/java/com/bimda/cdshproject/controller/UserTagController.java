package com.bimda.cdshproject.controller;

import com.bimda.cdshproject.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.controller
 * @NAME: UserTagController
 * @USER: Han
 * @DATE: 2020/11/25
 * @TIME: 15:28
 * @DAY_NAME_SHORT: 周三
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@RestController
@RequestMapping("/user-tag")
@Api(value = "用户标签接口", tags = "用户标签模块接口")
public class UserTagController extends BaseController {
}
