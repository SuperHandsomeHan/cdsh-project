package com.bimda.cdshproject.pojo.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.pojo.bo
 * @NAME: ActivityInfoBO
 * @USER: code.rookie
 * @DATE: 2020/11/24
 * @TIME: 10:56 上午
 * @DAY_NAME_SHORT: 周二
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityParticipationBO {
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
