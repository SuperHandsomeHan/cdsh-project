package com.bimda.cdshproject.controller;


import com.bimda.cdshproject.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * user_role 用户角色表 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@RestController
@RequestMapping("/user-role")
@Api(value = "用户角色表接口", tags = "用户角色表模块接口")
public class UserRoleController extends BaseController {

}
