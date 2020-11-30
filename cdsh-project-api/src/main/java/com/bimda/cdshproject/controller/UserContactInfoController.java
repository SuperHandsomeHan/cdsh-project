package com.bimda.cdshproject.controller;


import com.bimda.cdshproject.BaseController;
import com.bimda.cdshproject.controller.vo.ResponseVO;
import com.bimda.cdshproject.pojo.vo.ContactInfoVO;
import com.bimda.cdshproject.service.IContactListService;
import com.bimda.cdshproject.service.IUserContactInfoService;
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
 * contact_list 通讯录 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-11-11
 */
@RestController
@RequestMapping("/bimda/contact-list")
@Api(value = "通讯录接口", tags = "通讯录模块接口")
public class UserContactInfoController extends BaseController {

    @Autowired
    private IContactListService contactListService;

    @GetMapping("/contacts/role")
    @ApiOperation(value = "根据角色编号查询用户通讯录", notes = "根据角色编号查询用户通讯录，返回的是ContactInfoVO集合",
            httpMethod = "get")
    @ApiImplicitParams({
            @ApiImplicitParam( name = "roleIds",value = "角色编号数组",required = true),
    })
    @CrossOrigin(origins = "*", methods = {RequestMethod.GET})
    public ResponseVO contactListByRoleId(Integer[] roleIds){
        List<ContactInfoVO> list = new ArrayList<>();
        list = contactListService.listContactInfoByRoleId(roleIds);
        return success(list);
    }

    @GetMapping("/contacts/role/condition")
    @ApiOperation(value = "根据条件和角色编号查询用户通讯录", notes = "根据条件和角色编号查询用户通讯录，返回的是ContactInfoVO集合",
            httpMethod = "get")
    @ApiImplicitParams({
            @ApiImplicitParam( name = "condition",value = "条件",required = true),
            @ApiImplicitParam( name = "roleIds",value = "角色编号数组",required = true)
    })
    @CrossOrigin(origins = "*", methods = {RequestMethod.GET})
    public ResponseVO contactListByRoleIdAndCondition(String condition, Integer[] roleIds){
        List<ContactInfoVO> list = new ArrayList<>();
        list = contactListService.listContactInfoByCondition(condition, roleIds);
        return success(list);
    }

    @GetMapping("/contacts")
    @ApiOperation(value = "用户通讯录查询", notes = "用户通讯录查询，返回的是ContactInfoVO集合",
            httpMethod = "get")
    @CrossOrigin(origins = "*", methods = {RequestMethod.GET})
    public ResponseVO contactList(){
        List<ContactInfoVO> list = new ArrayList<>();
        list = contactListService.listContactInfo();
        return success(list);
    }

}
