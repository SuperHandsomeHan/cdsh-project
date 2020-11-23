package com.bimda.cdshproject.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * prize_user 获奖用户表
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "prize_user")
@EqualsAndHashCode(callSuper = false)
public class PrizeUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * prize_id 奖品编号
     */
    @ApiModelProperty("奖品编号")
    private Integer prizeId;

    /**
     * user_id 用户编号
     */
    @ApiModelProperty("用户编号")
    private String userId;

    /**
     * activity_id 活动编号
     */
    @ApiModelProperty("活动编号")
    private String activityId;


}
