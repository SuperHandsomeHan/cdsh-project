package com.bimda.cdshproject.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_relation")
@EqualsAndHashCode(callSuper = false)
public class UserRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * open_id 微信唯一标识
     */
    @TableId(value = "open_id")
    @ApiModelProperty("类型编号")
    private String openId;

    /**
     * user_id 用户编号
     */
    @ApiModelProperty("用户编号")
    private String userId;

    /**
     * user_tel 用户手机号
     */
    @ApiModelProperty("用户手机号")
    private String userTel;


}
