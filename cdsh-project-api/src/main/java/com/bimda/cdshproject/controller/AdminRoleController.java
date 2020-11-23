package com.bimda.cdshproject.controller;


import com.bimda.cdshproject.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * admin_role 管理员角色表 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@RestController
@RequestMapping("/admin-role")
@Api(value = "管理员角色表接口", tags = "管理员角色表模块接口")
public class AdminRoleController extends BaseController {

}
