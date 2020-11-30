package com.bimda.cdshproject.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bimda.cdshproject.BaseController;
import com.bimda.cdshproject.controller.vo.ResponseVO;
import com.bimda.cdshproject.pojo.UserRelation;
import com.bimda.cdshproject.pojo.UserRole;
import com.bimda.cdshproject.pojo.vo.WeChatAppletVO;
import com.bimda.cdshproject.resoures.GetWeChatAppletCredentials;
import com.bimda.cdshproject.service.IUserRelationService;
import com.bimda.cdshproject.service.IUserRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.controller
 * @NAME: LogController
 * @USER: code.rookie
 * @DATE: 2020/11/26
 * @TIME: 2:37 下午
 * @DAY_NAME_SHORT: 周四
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@RestController
@RequestMapping("/userLogin")
@Api(value = "登陆模块", tags = "登陆模块接口")
public class UserCenterController extends BaseController {
    @Autowired
    private IUserRelationService userRelationService;
    @Autowired
    private GetWeChatAppletCredentials getWeChatAppletCredentials;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private IUserRoleService userRoleService;
    @ApiOperation(value = "用户第一次登陆", notes = "用户第一次解密", httpMethod = "POST")
    @PostMapping("/login")
    public ResponseVO login(@RequestParam String code) {
        //微信小程序解密接口
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid={appid}&secret={secret}&js_code={code}&grant_type=authorization_code";
        //创建请求接口的参数
        Map<String, String> requestMap = new HashMap<>();
        //小程序的apid
        requestMap.put("appid", getWeChatAppletCredentials.getAppId());
        //小程序的密码
        requestMap.put("secret", getWeChatAppletCredentials.getSecretKey());
        //用户的code
        requestMap.put("code", code);
        //发送https请求
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class,requestMap);
        //把返回的值转换为JSONObject
        JSONObject jsonObject= JSONObject.parseObject(responseEntity.getBody());
        //获取返回的openId
        String openId=jsonObject.getString("openid");
        //获取微信接口返回的
//        String session_key=jsonObject.getString("session_key");
        //生成用户tocen
        WeChatAppletVO weChatAppletVO = loginRedis(openId);
        return success(200,weChatAppletVO);
    }
    @ApiOperation(value = "授权手机", notes = "授权手机", httpMethod = "POST")
    @PostMapping("/hasAuthUser")
    public ResponseVO hasAuthUser(@RequestParam String code) {
        //微信小程序解密接口
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid={appid}&secret={secret}&js_code={code}&grant_type=authorization_code";
        //创建请求接口的参数
        Map<String, String> requestMap = new HashMap<>();
        //小程序的apid
        requestMap.put("appid", getWeChatAppletCredentials.getAppId());
        //小程序的密码
        requestMap.put("secret", getWeChatAppletCredentials.getSecretKey());
        //用户的code
        requestMap.put("code", code);
        //发送https请求
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class,requestMap);
        //把返回的值转换为JSONObject
        JSONObject jsonObject= JSONObject.parseObject(responseEntity.getBody());
        //获取返回的openId
        String purePhoneNumber=jsonObject.getString("purePhoneNumber");
        QueryWrapper<UserRelation> userRelationQueryWrapper = new QueryWrapper<>();
        userRelationQueryWrapper.eq("user_tel",purePhoneNumber);
        UserRelation userRelation = userRelationService.getOne(userRelationQueryWrapper);
        QueryWrapper<UserRole> roleQueryWrapper = new QueryWrapper<>();
        roleQueryWrapper.eq("user_id",userRelation.getUserId());
        UserRole userRole = userRoleService.getOne(roleQueryWrapper);
        WeChatAppletVO weChatAppletVO = new WeChatAppletVO();
        weChatAppletVO.setHasAuthPhone(1);
        if (userRole.getRoleId() == 2){

            weChatAppletVO.setIsMember(1);
        } else {
            weChatAppletVO.setIsMember(0);
        }
       return success(200,weChatAppletVO);
    }
}
