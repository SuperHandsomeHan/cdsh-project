package com.bimda.cdshproject.advice;

import com.bimda.cdshproject.controller.vo.ResponseVO;
import com.bimda.cdshproject.service.exception.ApiException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Achine
 * @date 2019/11/14
 */
@ControllerAdvice({"com.bimda.cdshproject.controller"})
public class ControllerAspect {

    @ExceptionHandler(ApiException.class)
    @ResponseBody
    public ResponseVO apiException(ApiException e){
        ResponseVO vo = new ResponseVO();
        vo.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        vo.setMessage(e.getMessage());
        return vo;
    }

}
