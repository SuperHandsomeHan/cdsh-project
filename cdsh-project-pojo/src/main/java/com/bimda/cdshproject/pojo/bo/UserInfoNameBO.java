package com.bimda.cdshproject.pojo.bo;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.multipart.MultipartFile;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.pojo.bo
 * @NAME: UserInfoNameBO
 * @USER: code.rookie
 * @DATE: 2020/11/25
 * @TIME: 4:52 下午
 * @DAY_NAME_SHORT: 周三
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
public class UserInfoNameBO {
    /**
     * user_id 用户编号
     */
    @TableId(value = "user_id")
    @ApiModelProperty("用户编号")
    private String userId;

    /**
     * user_name 用户名称
     */
    @ApiModelProperty("用户名称")
    private String userName;
}
