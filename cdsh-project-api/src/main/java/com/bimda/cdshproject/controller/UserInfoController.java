package com.bimda.cdshproject.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * user_info 会员信息表 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-11-11
 */
@RestController
@RequestMapping("/bimda/user-info")
@Api(value = "会员信息表接口", tags = "会员信息表模块接口")
public class UserInfoController extends BaseController {

}
