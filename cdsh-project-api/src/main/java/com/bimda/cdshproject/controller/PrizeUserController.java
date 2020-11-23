package com.bimda.cdshproject.controller;


import com.bimda.cdshproject.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * prize_user 获奖用户表 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@RestController
@RequestMapping("/prize-user")
@Api(value = "获奖用户表接口", tags = "获奖用户表模块接口")
public class PrizeUserController extends BaseController {

}
