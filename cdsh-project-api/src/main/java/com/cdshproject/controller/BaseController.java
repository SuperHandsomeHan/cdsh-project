package com.cdshproject.controller;

import com.cdshproject.controller.vo.ResponseVO;
import org.springframework.http.HttpStatus;

import java.io.File;

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
//    public UserVO conventUserVO(Users userResult){
//        //  生成用户token，存入redis会话
//        //REDIS会话
//        String uniqueToken = UUID.randomUUID().toString().trim();
//        redisOperator.set(REDIS_USER_TOKEN+":"+""+userResult.getId(),uniqueToken);
//        UserVO userVO = new UserVO();
//        BeanUtils.copyProperties(userResult,userVO);
//        userVO.setUserUniqueToken(uniqueToken);
//        return  userVO;
//    }
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
}
