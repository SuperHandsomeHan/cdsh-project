package com.bimda.cdshproject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
public class UserCenterControllerTest {
    /*@Autowired
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
    }*/

    @Test
    public void test(){
        System.out.println(1);
    }
}
