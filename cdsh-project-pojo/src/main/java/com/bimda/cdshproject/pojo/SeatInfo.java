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
 * activity_info 座位信息表
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "seat_info")
@EqualsAndHashCode(callSuper = false)
public class SeatInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * seat_id 座位编号
     */
    @TableId(value = "seat_id")
    @ApiModelProperty("座位编号")
    private String seatId;

    /**
     * seat_name 座位编号
     */
    @ApiModelProperty("座位编号")
    private String seatName;

    /**
     * activity_id 活动编号
     */
    @ApiModelProperty("活动编号")
    private String activityId;

    /**
     * people_num 人数
     */
    @ApiModelProperty("人数")
    private Integer peopleNum;

    /**
     * is_use 是否使用
     */
    @ApiModelProperty("是否使用")
    private String isUse;

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
