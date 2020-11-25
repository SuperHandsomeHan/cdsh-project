package com.bimda.cdshproject.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

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

    /**
     * face_url 用户头像
     */
    @ApiModelProperty("用户头像")
    private String faceUrl;

    /**
     * user_native 用户籍贯
     */
    @ApiModelProperty("用户籍贯")
    private String userNative;

    /**
     * user_position 用户职位标识码
     */
    @ApiModelProperty("用户职位标识码")
    private String userPosition;

    /**
     * create_time 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * create_user 创建人员
     */
    @ApiModelProperty("创建人员")
    private String createUser;


}
