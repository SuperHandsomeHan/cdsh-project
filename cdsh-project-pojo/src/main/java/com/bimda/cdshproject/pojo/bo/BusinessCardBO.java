package com.bimda.cdshproject.pojo.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.pojo.bo
 * @NAME: BusinessCardBO
 * @USER: code.rookie
 * @DATE: 2020/11/16
 * @TIME: 10:01 上午
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: cdsh-project
 * @Desc:接收用户返回的消息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessCardBO {


    /** user_id;用户编号 */
    @ApiModelProperty("用户编号")
    private String userId ;

    /** user_position;职位标码值 */
    @ApiModelProperty("职位标码值")
    private String userPosition ;

    /** company;公司 */
    @ApiModelProperty("公司")
    private String company ;

    /** user_tel;手机号 */
    @ApiModelProperty("手机号")
    private String userTel ;

    /** user_region;地区号 */
    @ApiModelProperty("地区号")
    private String userRegion ;


    /** face_url;头像地址 */
    @ApiModelProperty("头像地址")
    private MultipartFile fileFace;

    /** user_email;用户邮箱 */
    @ApiModelProperty("用户邮箱")
    private String userEmail ;

    /** website;网址 */
    @ApiModelProperty("网址")
    private String website ;

    /**
     * is_open 是否公开
     */
    @ApiModelProperty("是否公开")
    private String isOpen;
}
