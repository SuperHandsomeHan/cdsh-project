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
 * activity_participation 活动报名表
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "activity_participation")
@EqualsAndHashCode(callSuper = false)
public class ActivityParticipation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * participation_id 报名编号
     */
    @TableId(value = "participation_id")
    @ApiModelProperty("报名编号")
    private String participationId;

    /**
     * user_id 用户编号
     */
    @ApiModelProperty("用户编号")
    private String userId;

    /**
     * registration_time 报名时间
     */
    @ApiModelProperty("报名时间")
    private LocalDateTime registrationTime;

    /**
     * end_time 结束时间
     */
    @ApiModelProperty("结束时间")
    private LocalDateTime endTime;

    /**
     * seat_id 座位编号
     */
    @ApiModelProperty("座位编号")
    private String seatId;

    /**
     * activity_id 活动编号
     */
    @ApiModelProperty("活动编号")
    private String activityId;

    /**
     * create_time 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * create_admin 创建人
     */
    @ApiModelProperty("创建人")
    private String createAdmin;


}
