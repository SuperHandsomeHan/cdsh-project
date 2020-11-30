package com.bimda.cdshproject.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bimda.cdshproject.BaseController;
import com.bimda.cdshproject.controller.vo.ResponseVO;
import com.bimda.cdshproject.pojo.BusinessCard;
import com.bimda.cdshproject.pojo.UserContactInfo;
import com.bimda.cdshproject.pojo.bo.BusinessCardBO;
import com.bimda.cdshproject.pojo.bo.BusinessCardUpdateStateBO;
import com.bimda.cdshproject.pojo.bo.BusinessCardUploadFaceBO;
import com.bimda.cdshproject.resoures.FileUpload;
import com.bimda.cdshproject.service.IBusinessCardService;
import com.bimda.cdshproject.service.IUserContactInfoService;
import com.bimda.cdshproject.utils.DateUtil;
import com.bimda.cdshproject.utils.TimeStampUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * business_card 电子名片 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-11-11
 */
@RestController
@RequestMapping("/bimda/business-card")
@Api(value = "电子名片接口", tags = "电子名片模块接口")
public class BusinessCardController extends BaseController {
    @Autowired
    private IUserContactInfoService userContactInfoService;
    @Autowired
    private IBusinessCardService businessCardService;
    @Autowired
    private FileUpload fileUpload;
    @ApiOperation(value = "用户名片头像修改", notes = "用户名片头像修改", httpMethod = "POST")
    @PostMapping("uploadFace")
    public ResponseVO uploadFace(
            @ApiParam(name = "businessCardUploadFaceBO", value = "BusinessCardUploadFaceBO", required = true)
            @RequestBody BusinessCardUploadFaceBO businessCardUploadFaceBO) {

        // .sh .php
        //创建BusinessCard对象进行修改
        BusinessCard businessCard = new BusinessCard();
        // 定义头像保存的地址
        // String fileSpace = IMAGE_USER_FACE_LOCATION;
        String fileSpace = fileUpload.getImageUserFaceLocation();
        // 在路径上为每一个用户增加一个userid，用于区分不同用户上传
        String uploadPathPrefix = File.separator + businessCardUploadFaceBO.getUserId();
        System.out.println(businessCardUploadFaceBO.getFileFace());
        // 开始文件上传
        if (businessCardUploadFaceBO.getFileFace() != null) {
            FileOutputStream fileOutputStream = null;
            try {
                // 获得文件上传的文件名称
                String fileName = businessCardUploadFaceBO.getFileFace().getOriginalFilename();

                if (StringUtils.isNotBlank(fileName)) {

                    // 文件重命名  imooc-face.png -> ["imooc-face", "png"]
                    String fileNameArr[] = fileName.split("\\.");

                    // 获取文件的后缀名
                    String suffix = fileNameArr[fileNameArr.length - 1];

                    if (!suffix.equalsIgnoreCase("png") &&
                            !suffix.equalsIgnoreCase("jpg") &&
                            !suffix.equalsIgnoreCase("jpeg") ) {
                        return fail(500,"不支持该图片");
                    }

                    // face-{userid}.png
                    // 文件名称重组 覆盖式上传，增量式：额外拼接当前时间
                    String newFileName = "face-" + businessCardUploadFaceBO.getUserId()+"-"+businessCardUploadFaceBO.getCardId() + "." + suffix;

                    // 上传的头像最终保存的位置
                    String finalFacePath = fileSpace + uploadPathPrefix + File.separator + newFileName;
                    //加入businessCard对象
                    businessCard.setFaceUrl(finalFacePath);
                    // 用于提供给web服务访问的地址
                    uploadPathPrefix += ("/" + newFileName);

                    File outFile = new File(finalFacePath);
                    if (outFile.getParentFile() != null) {
                        // 创建文件夹
                        outFile.getParentFile().mkdirs();
                    }

                    // 文件输出保存到目录
                    fileOutputStream = new FileOutputStream(outFile);
                    InputStream inputStream = businessCardUploadFaceBO.getFileFace().getInputStream();
                    IOUtils.copy(inputStream, fileOutputStream);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fileOutputStream != null) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } else {
            return fail(500,"文件不能为空！");
        }

        // 获取图片服务地址
        String imageServerUrl = fileUpload.getImageServerUrl();

        // 由于浏览器可能存在缓存的情况，所以在这里，我们需要加上时间戳来保证更新后的图片可以及时刷新
        String finalUserFaceUrl = imageServerUrl + uploadPathPrefix
                + "?t=" + DateUtil.getCurrentDateString(DateUtil.DATE_PATTERN);
        QueryWrapper<BusinessCard> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("card_id",businessCardUploadFaceBO.getCardId());
        businessCardService.update(businessCard,queryWrapper);
        // 更新用户头像到数据库
        //  后续要改，增加令牌token，会整合进redis，分布式会话
//        Users userResult = userService.updateUserFace(userId, finalUserFaceUrl);
//        UserVO userVO = conventUserVO(userResult);
////        userResult = setNullProperty(userResult);
//        CookieUtils.setCookie(request, response, "user",
//                JsonUtils.objectToJson(userVO), true);



        return success(200,imageServerUrl);
    }
    @ApiOperation(value = "电子名片添加", notes = "电子名片添加", httpMethod = "POST")
    @PostMapping("insertBusinessCard")
    public ResponseVO insertBusinessCard(
            @ApiParam(name = "businessCardBO", value = "电子名片信息", required = true)
            @RequestBody BusinessCardBO businessCardBO
    ){

        // .sh .php

        // 定义头像保存的地址
        // String fileSpace = IMAGE_USER_FACE_LOCATION;
        String fileSpace = fileUpload.getImageUserFaceLocation();
        BusinessCard newBusinessCard  = new BusinessCard();
        // 在路径上为每一个用户增加一个userid，用于区分不同用户上传
        String uploadPathPrefix = File.separator + businessCardBO.getUserId();
        System.out.println(businessCardBO.getFileFace());
        // 开始文件上传
        if (businessCardBO.getFileFace() != null) {
            FileOutputStream fileOutputStream = null;
            try {
                // 获得文件上传的文件名称
                String fileName = businessCardBO.getFileFace().getOriginalFilename();

                if (StringUtils.isNotBlank(fileName)) {

                    // 文件重命名  imooc-face.png -> ["imooc-face", "png"]
                    String fileNameArr[] = fileName.split("\\.");

                    // 获取文件的后缀名
                    String suffix = fileNameArr[fileNameArr.length - 1];

                    if (!suffix.equalsIgnoreCase("png") &&
                            !suffix.equalsIgnoreCase("jpg") &&
                            !suffix.equalsIgnoreCase("jpeg") ) {
                        return fail(500,"不支持该图片");
                    }
                    //创建电子名片的实体类

                    //把前端传回的数据赋予给电子名片对象
                    BeanUtils.copyProperties(businessCardBO, newBusinessCard);
                    //生成电子名片的的id
                    newBusinessCard.setCardId(TimeStampUtil.getCurrentTimeMillisName());
                    // face-{userid}.png
                    // 文件名称重组 覆盖式上传，增量式：额外拼接当前时间
                    String newFileName = "face-" + businessCardBO.getFileFace()+"-"+newBusinessCard.getCardId() + "." + suffix;

                    // 上传的头像最终保存的位置
                    String finalFacePath = fileSpace + uploadPathPrefix + File.separator + newFileName;
                    newBusinessCard.setFaceUrl(finalFacePath);
                    // 用于提供给web服务访问的地址
                    uploadPathPrefix += ("/" + newFileName);

                    File outFile = new File(finalFacePath);
                    if (outFile.getParentFile() != null) {
                        // 创建文件夹
                        outFile.getParentFile().mkdirs();
                    }

                    // 文件输出保存到目录
                    fileOutputStream = new FileOutputStream(outFile);
                    InputStream inputStream = businessCardBO.getFileFace().getInputStream();
                    IOUtils.copy(inputStream, fileOutputStream);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fileOutputStream != null) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } else {
            return fail(500,"文件不能为空！");
        }

        // 获取图片服务地址
        String imageServerUrl = fileUpload.getImageServerUrl();

        // 由于浏览器可能存在缓存的情况，所以在这里，我们需要加上时间戳来保证更新后的图片可以及时刷新
        String finalUserFaceUrl = imageServerUrl + uploadPathPrefix
                + "?t=" + DateUtil.getCurrentDateString(DateUtil.DATE_PATTERN);
        QueryWrapper<BusinessCard> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id",newBusinessCard.getUserId());
        List<BusinessCard> list = businessCardService.list(queryWrapper);
        if (list!=null){
            newBusinessCard.setIsDefault("0");
        } else {
            newBusinessCard.setIsDefault("1");
        }
        // 更新用户头像到数据库
        //  后续要改，增加令牌token，会整合进redis，分布式会话
//        Users userResult = userService.updateUserFace(userId, finalUserFaceUrl);
//        UserVO userVO = conventUserVO(userResult);
////        userResult = setNullProperty(userResult);
//        CookieUtils.setCookie(request, response, "user",
//                JsonUtils.objectToJson(userVO), true);
        businessCardService.save(newBusinessCard);
        return success(200);
    }
    @ApiOperation(value = "删除用户名片", notes = "删除用户名片", httpMethod = "POST")
    @PostMapping("delBusinessCard")
    public ResponseVO delBusinessCard(
            @ApiParam(name = "cardId", value = "名片id", required = true)
            @RequestBody String cardId) {
        Map<String,Object> delMap = new HashMap<>();
        delMap.put("card_id",cardId);
        businessCardService.removeByMap(delMap);
        return success(200);

    }
    @ApiOperation(value = "修改名片", notes = "修改名片", httpMethod = "POST")
    @PostMapping("updateBusinessCard")
    public ResponseVO updateBusinessCard(
            @ApiParam(name = "cardId", value = "名片id", required = true)
            @RequestBody BusinessCard BusinessCard) {
        businessCardService.updateById(BusinessCard);
        return success(200);

    }
    @ApiOperation(value = "查询用户所有名片", notes = "查询用户所有名片", httpMethod = "GET")
    @GetMapping("GetBusinessCardById")
    public ResponseVO GetBusinessCardById(
            @ApiParam(name = "userId", value = "用户id", required = true)
            @RequestParam String userId) {
        Map<String,Object>  idMap= new HashMap<>();
        idMap.put("user_id",userId);
        List<BusinessCard> list = (List<BusinessCard>) businessCardService.listByMap(idMap);
        return success(200,list);
    }
    @ApiOperation(value = "修改用户名片状态", notes = "修改用户名片状态", httpMethod = "GET")
    @GetMapping("updateState")
    public ResponseVO updateState(
            @ApiParam(name = "BusinessCardUpdateStateBO", value = "BusinessCardUpdateStateBO", required = true)
            @RequestBody BusinessCardUpdateStateBO businessCardUpdateStateBO) {
        BusinessCard businessCard = new BusinessCard();
        businessCard.setIsDefault(businessCardUpdateStateBO.getIsDefault());
        businessCard.setIsOpen(businessCardUpdateStateBO.getIsOpen());
        QueryWrapper<BusinessCard> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("card_id",businessCardUpdateStateBO.getCardId());
        if (businessCardUpdateStateBO.getIsDefault().equals("1")){
            userContactInfoService.update();
        }
        queryWrapper.eq("card_id",businessCardUpdateStateBO.getCardId());
        businessCardService.update(businessCard,queryWrapper);
        return success(200);
    }
}
