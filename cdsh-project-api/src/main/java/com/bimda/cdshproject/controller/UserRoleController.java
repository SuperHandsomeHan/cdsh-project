package com.bimda.cdshproject.controller;


import com.bimda.cdshproject.BaseController;
import com.bimda.cdshproject.controller.vo.ResponseVO;
import com.bimda.cdshproject.pojo.UserRole;
import com.bimda.cdshproject.pojo.bo.UserBO;
import com.bimda.cdshproject.pojo.bo.UserRoleBO;
import com.bimda.cdshproject.pojo.vo.ContactInfoVO;
import com.bimda.cdshproject.pojo.vo.UserRoleVO;
import com.bimda.cdshproject.service.IAssignRolesService;
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

    @Autowired
    private IAssignRolesService assignRolesService;

    @PostMapping("/assign")
    @ApiOperation(value = "分配角色", notes = "分配角色，返回的是UserRoleVO集合",
            httpMethod = "post")
    @ApiImplicitParams({
            @ApiImplicitParam( name = "bo",value = "用户角色信息",required = true),
    })
    @CrossOrigin(origins = "*", methods = {RequestMethod.POST})
    public ResponseVO assignRoles(UserRoleBO bo){
        List<UserRoleVO> list = new ArrayList<>();
        list = assignRolesService.assignRoles(bo);
        return success(list);
    }
}
