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
 * user_contact_info 用户联系信息表
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_contact_info")
@EqualsAndHashCode(callSuper = false)
public class UserContactInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * user_id 用户编号
     */
    @TableId(value = "user_id")
    @ApiModelProperty("用户编号")
    private String userId;

    /**
     * cooperate_scope 业务合作范围
     */
    @ApiModelProperty("业务合作范围")
    private String cooperateScope;

}
