package com.bimda.cdshproject;

import com.bimda.cdshproject.pojo.UserInfo;
import com.bimda.cdshproject.service.IUserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

    @Test
    public void test(){
        UserInfo userInfo = service.selectUserById("1");
        if (userInfo == null){
            System.out.println(1);
        }
    }
}
