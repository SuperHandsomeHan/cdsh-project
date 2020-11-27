package com.bimda.cdshproject;

import com.bimda.cdshproject.controller.vo.ResponseVO;
import com.bimda.cdshproject.pojo.UserInfo;
import com.bimda.cdshproject.pojo.vo.UserInfoVO;
import com.bimda.cdshproject.pojo.vo.WeChatAppletVO;
import com.bimda.cdshproject.utils.RedisOperator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import java.io.File;
import java.util.UUID;

/**
 * @PACKAGE_NAME: bimda.cdshproject.controller
 * @NAME: BaseController
 * @USER: code.rookie
 * @DATE: 2020/11/11
 * @TIME: 1:30 下午
 * @DAY_NAME_SHORT: 周三
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
public class BaseController<T> {
    public static final String REDIS_USER_TOKEN = "redis_user_token";
//    public static final String REDIS_USER_TOKEN = "redis_user_token";
    @Autowired
    private RedisOperator redisOperator;

    /**
     * 管理员token
     * @param openId
     * @return
     */
//    public AdminVO conventAdminVO(AdminInfo adminInfo){
//        //  生成用户token，存入redis会话
//        //REDIS会话
//        String uniqueToken = UUID.randomUUID().toString().trim();
//        redisOperator.set(REDIS_USER_TOKEN+":"+""+adminInfo.getAdminId(), uniqueToken);
//        AdminVO vo = new AdminVO();
//        BeanUtils.copyProperties(adminInfo, vo);
//        vo.setSetAdminUniqueToken(uniqueToken);
//        return vo;
//    }

    /**
     * 用户登陆返回的userid
     * @param openId
     * @return
     */
    public WeChatAppletVO loginRedis(String openId){
        //  生成用户token，存入redis会话
        //REDIS会话
        String uniqueToken = UUID.randomUUID().toString().trim();
        redisOperator.set(REDIS_USER_TOKEN+":"+""+openId,uniqueToken);
        WeChatAppletVO weChatAppletVO = new WeChatAppletVO();
        weChatAppletVO.setHeaderOpenId(openId);
        weChatAppletVO.setHeaderUserToken(REDIS_USER_TOKEN+":"+""+openId);
        return  weChatAppletVO;
    }
    public static  final File FILEPATH = new File("export" + File.separator);
    protected ResponseVO fail(Integer code, Object message){
        ResponseVO vo=new ResponseVO();
        vo.setCode(code);
        vo.setMessage(message);
        return vo;
    }

    protected ResponseVO fail(Integer code){
        ResponseVO vo=new ResponseVO();
        vo.setCode(code);
        return vo;
    }

    protected <T> ResponseVO<T> success(T data){
        ResponseVO<T> vo=new ResponseVO();
        vo.setCode(HttpStatus.OK.value());
        vo.setData(data);
        return vo;
    }

    protected ResponseVO success(Integer code,T data){
        ResponseVO vo=new ResponseVO();
        vo.setCode(code);
        vo.setData(data);
        return vo;
    }

    protected ResponseVO success(Integer code){
        ResponseVO vo=new ResponseVO();
        vo.setCode(code);
        return vo;
    }
}
