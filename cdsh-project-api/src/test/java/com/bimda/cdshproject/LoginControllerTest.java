package com.bimda.cdshproject;

import com.alibaba.fastjson.JSONObject;
import com.bimda.cdshproject.controller.LoginController;
import com.bimda.cdshproject.pojo.vo.WeChatAppletVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject
 * @NAME: LoginControllerTest
 * @USER: code.rookie
 * @DATE: 2020/11/26
 * @TIME: 3:03 下午
 * @DAY_NAME_SHORT: 周四
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@SpringBootTest()
@RunWith(SpringRunner.class)
public class LoginControllerTest extends BaseController{
    @Autowired
    private RestTemplate restTemplate;
    @Test
    public void login()  {
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid={appid}&secret={secret}&js_code={code}&grant_type=authorization_code";
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("appid", "wx2f140e23ed3eb974");
        requestMap.put("secret", "248854f0e23a84ce1774d45244fd1db0");
        requestMap.put("code", "071s7F0w3S0hoV2ywQ1w3q0dQ14s7F0p");
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class,requestMap);
        JSONObject jsonObject=JSONObject.parseObject(responseEntity.getBody());
        String openId=jsonObject.getString("openid");
        String session_key=jsonObject.getString("session_key");
        WeChatAppletVO weChatAppletVO = loginRedis(openId);
        System.out.println(openId);
        System.out.println(session_key);
    }
}
