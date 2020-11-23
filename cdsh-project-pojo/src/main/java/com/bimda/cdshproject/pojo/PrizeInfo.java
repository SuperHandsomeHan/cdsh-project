package com.bimda.cdshproject.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * prize_info 活动奖品信息表
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "prize_info")
@EqualsAndHashCode(callSuper = false)
public class PrizeInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * prize_id 奖品编号
     */
    @TableId(value = "prize_id", type = IdType.AUTO)
    @ApiModelProperty("奖品编号")
    private Integer prizeId;

    /**
     * prize_name 奖品名称
     */
    @ApiModelProperty("奖品名称")
    private String prizeName;

    /**
     * prize_mark 奖品备注
     */
    @ApiModelProperty("奖品备注")
    private String prizeMark;

    /**
     * prize_num 奖品数量
     */
    @ApiModelProperty("奖品数量")
    private Integer prizeNum;

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
