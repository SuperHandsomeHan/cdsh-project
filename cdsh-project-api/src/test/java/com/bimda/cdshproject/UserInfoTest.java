package com.bimda.cdshproject;

import com.bimda.cdshproject.pojo.UserContactInfo;
import com.bimda.cdshproject.pojo.UserInfo;
import com.bimda.cdshproject.pojo.bo.UserBO;
import com.bimda.cdshproject.pojo.bo.UserRoleBO;
import com.bimda.cdshproject.pojo.vo.ContactInfoVO;
import com.bimda.cdshproject.pojo.vo.UserRoleVO;
import com.bimda.cdshproject.service.IAddUserService;
import com.bimda.cdshproject.service.IAssignRolesService;
import com.bimda.cdshproject.service.IContactListService;
import com.bimda.cdshproject.service.IUserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject
 * @NAME: UserInfoTest
 * @USER: Han
 * @DATE: 2020/11/12
 * @TIME: 15:18
 * @DAY_NAME_SHORT: 周四
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
@Slf4j
public class UserInfoTest {
    @Autowired
    private IUserInfoService service;

    @Autowired
    private IAddUserService addUserService;

    @Autowired
    private IAssignRolesService assignRolesService;

    @Autowired
    private IContactListService contactListService;


    @Test
    public void test(){
        UserInfo userInfo = service.selectUserById("1");
        if (userInfo == null){
            System.out.println(1);
        }
    }

    @Test
    public void addUser(){
        UserBO bo = new UserBO();
        bo.setFaceUrl("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1099335495,2353408217&fm=26&gp=0.jpg");
        bo.setCompany("毕梦达科技有限公司");
        bo.setCooperateScope("智慧软件");
        //userInfo.setOpenId("0");
        bo.setCompanyAddress("白蕉镇白蕉路522号");
        bo.setUserName("周德发");
        bo.setUserNative("广东珠海");
        bo.setUserPosition("老板");
        bo.setCompanyArea("0");
        bo.setUserTel("13523262541");
        bo.setCreateTime(new Date());
        bo.setCreateUser("");
        bo.setUserAli("wsaagl");
        bo.setUserEmail("13523262541@qq.com");
        bo.setUserFax("0756-5979611");
        bo.setUserFixedTel("0756-5979611");
        bo.setUserQq("7594421489");
        bo.setUserWechat("zhoudf");
        bo.setWebsite("https://www.baidu.com");
        ContactInfoVO vo = addUserService.addUser(bo);
        System.out.println("userInfo - userId = " + vo.getUserId());
    }

    @Test
    public void listUser(){
        List<ContactInfoVO> list = contactListService.listContactInfoByRoleId(2);
        for (ContactInfoVO vo : list){
            System.out.println("userInfo " + vo.getUserId() + " ----------------");
            System.out.println("company = " + vo.getCompany());
            System.out.println("faceUrl = " + vo.getFaceUrl());
            //System.out.println("openId = " + userInfo.getOpenId());
            System.out.println("userAddress = " + vo.getCompanyAddress());
            System.out.println("userId = " + vo.getUserId());
            System.out.println("cooperateScope = " + vo.getCooperateScope());
            System.out.println("userName = " + vo.getUserName());
            System.out.println("userNative = " + vo.getUserNative());
            System.out.println("userPosition = " + vo.getUserPosition());
            System.out.println("userRegion = " + vo.getCompanyArea());
            System.out.println("userTel = " + vo.getUserTel());
            System.out.println("contactInfo ----------------");
            System.out.println("userAli = " + vo.getUserAli());
            System.out.println("userEmail = " + vo.getUserEmail());
            System.out.println("userFax = " + vo.getUserFax());
            System.out.println("userFixedTel = " + vo.getUserFixedTel());
            System.out.println("userQq = " + vo.getUserQq());
            System.out.println("userWechat = " + vo.getUserWechat());
            System.out.println("website = " + vo.getWebsite());
        }
    }

    @Test
    public void assignRoles(){
        UserRoleBO bo = new UserRoleBO();
        bo.setUserId("SH20201127094012");
        Integer[] roleIds = {2, 3};
        bo.setRoleIds(roleIds);
        List<UserRoleVO> list = assignRolesService.assignRoles(bo);
        for (UserRoleVO vo : list){
            System.out.println("roleId = " + vo.getRoleId());
            System.out.println("roleNae = " + vo.getRoleName());
        }
    }
}
