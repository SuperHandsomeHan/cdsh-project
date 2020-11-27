package com.bimda.cdshproject.interceptor;

import com.bimda.cdshproject.BaseController;
import com.bimda.cdshproject.controller.vo.ResponseVO;
import com.bimda.cdshproject.utils.JsonUtils;
import com.bimda.cdshproject.utils.RedisOperator;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @PACKAGE_NAME: com.imooc.controller.interceptor
 * @NAME: UserTokenInterceptor
 * @USER: code.rookie
 * @DATE: 2020/7/2
 * @TIME: 4:40 下午
 * @DAY_NAME_SHORT: 周四
 * @PROJECT_NAME: foodie-dev
 * @Desc:
 */
public class UserTokenInterceptor extends BaseController implements HandlerInterceptor{
    public static final String REDIS_USER_TOKEN = "redis_user_token";
    @Autowired
    private RedisOperator redisOperator;
    /**
     * 拦截请求在访问调用之前
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

//        System.out.println("进入到拦截器，被拦截。。。");

        String userId = request.getHeader("headerUserId");
        String userToken = request.getHeader("headerUserToken");

        if (StringUtils.isNotBlank(userId) && StringUtils.isNotBlank(userToken)) {
            String uniqueToken = redisOperator.get(REDIS_USER_TOKEN + ":" + userId);
            if (StringUtils.isBlank(uniqueToken)) {
//                System.out.println("请登录...");
                returnErrorResponse(response, fail(500,"请登录..."));
                return false;
            } else {
                if (!uniqueToken.equals(userToken)) {
//                    System.out.println("账号在异地登录...");
                    returnErrorResponse(response, fail(500,"账号在异地登录..."));
                    return false;
                }
            }
        } else {
//            System.out.println("请登录...");
            returnErrorResponse(response, fail(500,"请登录..."));
            return false;
        }


        /**
         * false: 请求被拦截，被驳回，验证出现问题
         * true: 请求在经过验证校验以后，是OK的，是可以放行的
         */
        return true;
    }
    public void returnErrorResponse(HttpServletResponse response,
                                    ResponseVO result) {
        OutputStream out = null;
        try {
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/json");
            out = response.getOutputStream();
            out.write(JsonUtils.objectToJson(result).getBytes("utf-8"));
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    /**
     * 请求访问之后，渲染之前
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * 请求访问之后，渲染之后
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
