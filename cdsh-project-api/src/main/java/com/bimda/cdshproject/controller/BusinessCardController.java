package com.bimda.cdshproject.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * business_card 电子名片 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-11-11
 */
@RestController
@RequestMapping("/bimda/business-card")
@Api(value = "电子名片接口", tags = "电子名片模块接口")
public class BusinessCardController extends BaseController {

}
