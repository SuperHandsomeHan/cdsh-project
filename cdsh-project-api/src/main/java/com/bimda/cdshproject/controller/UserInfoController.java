package com.bimda.cdshproject.controller;


import com.bimda.cdshproject.BaseController;
import com.bimda.cdshproject.controller.vo.ResponseVO;
import com.bimda.cdshproject.pojo.UserInfo;
import com.bimda.cdshproject.pojo.bo.UserBO;
import com.bimda.cdshproject.pojo.bo.UserRoleBO;
import com.bimda.cdshproject.pojo.vo.ContactInfoVO;
import com.bimda.cdshproject.service.IAddUserService;
import com.bimda.cdshproject.service.IContactListService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
@Api(value = "会员信息接口", tags = "会员信息模块接口")
public class UserInfoController extends BaseController {

    @Autowired
    private IAddUserService addUserService;

    @PostMapping("/add")
    @ApiOperation(value = "添加用户", notes = "添加用户，返回的是ContactInfoVO集合",
            httpMethod = "post")
    @ApiImplicitParams({
            @ApiImplicitParam( name = "bo",value = "用户信息",required = true),
    })
    @CrossOrigin(origins = "*", methods = {RequestMethod.POST})
    public ResponseVO addUser(UserBO bo){
        ContactInfoVO vo = new ContactInfoVO();
        vo = addUserService.addUser(bo);
        return success(vo);
    }
}
