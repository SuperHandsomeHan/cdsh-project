package com.bimda.cdshproject.controller;


import com.bimda.cdshproject.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * user_relation 用户关联表 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@RestController
@RequestMapping("/user-relation")
@Api(value = "用户关联表接口", tags = "用户关联表模块接口")
public class UserRelationController extends BaseController {

}
