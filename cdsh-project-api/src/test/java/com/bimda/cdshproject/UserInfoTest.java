package com.bimda.cdshproject;

import com.bimda.cdshproject.pojo.UserContactInfo;
import com.bimda.cdshproject.pojo.UserInfo;
import com.bimda.cdshproject.pojo.bo.UserBO;
import com.bimda.cdshproject.pojo.vo.ContactInfoVO;
import com.bimda.cdshproject.service.IAddUserService;
import com.bimda.cdshproject.service.IContactListService;
import com.bimda.cdshproject.service.IUserInfoService;
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
public class UserInfoTest {
    @Autowired
    private IUserInfoService service;

    @Autowired
    private IAddUserService addUserService;

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
    public void test2(){
        UserBO bo = new UserBO();
        UserInfo userInfo = new UserInfo();
        userInfo.setFaceUrl("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1099335495,2353408217&fm=26&gp=0.jpg");
        userInfo.setCompany("毕梦达科技有限公司");
        userInfo.setCooperateScope("智慧软件");
        //userInfo.setOpenId("0");
        userInfo.setUserAddress("白蕉镇白蕉路522号");
        userInfo.setUserName("陈冠希");
        userInfo.setUserNative("广东珠海");
        userInfo.setUserPosition("0");
        userInfo.setUserRegion("0");
        userInfo.setUserTel("13723262578");
        userInfo.setUserType(1);
        userInfo.setCreateTime(new Date());
        userInfo.setCreateAdmin("");
        bo.setUserInfo(userInfo);
        UserContactInfo contactInfo = new UserContactInfo();
        contactInfo.setUserAli("wanglili");
        contactInfo.setUserEmail("13723262578@qq.com");
        contactInfo.setUserFax("0756-5779632");
        contactInfo.setUserFixedTel("0756-5779632");
        contactInfo.setUserQq("3594421121");
        contactInfo.setUserWechat("chengx");
        contactInfo.setWebsite("https://www.baidu.com");
        bo.setContactList(contactInfo);
        ContactInfoVO vo = addUserService.addUser(bo);
        System.out.println("userInfo - userId = " + vo.getUserInfo().getUserId());
        System.out.println("contactInfo - userId = " + vo.getContactInfo().getUserId());
    }

    @Test
    public void test3(){
        List<ContactInfoVO> list = contactListService.listContactInfoByType(1);
        for (ContactInfoVO vo : list){
            UserInfo userInfo = vo.getUserInfo();
            System.out.println("userInfo ----------------");
            System.out.println("userId = " + userInfo.getUserId());
            System.out.println("company = " + userInfo.getCompany());
            System.out.println("faceUrl = " + userInfo.getFaceUrl());
            //System.out.println("openId = " + userInfo.getOpenId());
            System.out.println("userAddress = " + userInfo.getUserAddress());
            System.out.println("userId = " + userInfo.getUserId());
            System.out.println("cooperateScope = " + userInfo.getCooperateScope());
            System.out.println("userName = " + userInfo.getUserName());
            System.out.println("userNative = " + userInfo.getUserNative());
            System.out.println("userPosition = " + userInfo.getUserPosition());
            System.out.println("userRegion = " + userInfo.getUserRegion());
            System.out.println("userTel = " + userInfo.getUserTel());
            System.out.println("userType = " + userInfo.getUserType());
            System.out.println("contactInfo ----------------");
            UserContactInfo contactInfo = vo.getContactInfo();
            System.out.println("userId = " + contactInfo.getUserId());
            System.out.println("userAli = " + contactInfo.getUserAli());
            System.out.println("userEmail = " + contactInfo.getUserEmail());
            System.out.println("userFax = " + contactInfo.getUserFax());
            System.out.println("userFixedTel = " + contactInfo.getUserFixedTel());
            System.out.println("userQq = " + contactInfo.getUserQq());
            System.out.println("userId = " + contactInfo.getUserWechat());
            System.out.println("website = " + contactInfo.getWebsite());
        }
    }
}
