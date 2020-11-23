package com.bimda.cdshproject.controller;


import com.bimda.cdshproject.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * prize_info 活动奖品信息表 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@RestController
@RequestMapping("/prize-info")
@Api(value = "活动奖品信息表接口", tags = "活动奖品信息表模块接口")
public class PrizeInfoController extends BaseController {

}
