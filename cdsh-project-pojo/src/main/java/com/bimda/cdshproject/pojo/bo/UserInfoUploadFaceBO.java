package com.bimda.cdshproject.pojo.bo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * user_info 会员信息表
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_info")
@EqualsAndHashCode(callSuper = false)
public class UserInfoUploadFaceBO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * user_id 用户编号
     */
    @TableId(value = "user_id")
    @ApiModelProperty("用户编号")
    private String userId;

    /**
     * face_url 用户头像
     */
    @ApiModelProperty("用户头像")
    private MultipartFile faceUrl;

}
