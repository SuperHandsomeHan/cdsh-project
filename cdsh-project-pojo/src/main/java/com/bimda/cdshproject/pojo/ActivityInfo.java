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
 * activity_info 活动信息表
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "activity_info")
@EqualsAndHashCode(callSuper = false)
public class ActivityInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * activity_id 活动编号
     */
    @TableId(value = "activity_id")
    @ApiModelProperty("活动编号")
    private String activityId;

    /**
     * activity_name 活动名称
     */
    @ApiModelProperty("活动名称")
    private String activityName;

    /**
     * activity_content 活动内容
     */
    @ApiModelProperty("活动内容")
    private String activityContent;

    /**
     * start_time 开始时间
     */
    @ApiModelProperty("开始时间")
    private LocalDateTime startTime;

    /**
     * end_time 结束时间
     */
    @ApiModelProperty("结束时间")
    private LocalDateTime endTime;

    /**
     * activity_host 活动主持人
     */
    @ApiModelProperty("活动主持人")
    private String activityHost;

    /**
     * activity_leader 活动负责人
     */
    @ApiModelProperty("活动负责人")
    private String activityLeader;

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
