package com.bimda.cdshproject.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.pojo
 * @NAME: ApprovalInfo
 * @USER: Han
 * @DATE: 2020/11/16
 * @TIME: 10:19
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "approval_info")
public class ApprovalInfo {

    private static final long serialVersionUID = 1L;

    /** approveal_id;审批编号 */
    @Id
    @ApiModelProperty("审批编号")
    private String approvealId ;

    /** type_id;审批类型编号 */
    @ApiModelProperty("审批类型编号")
    private String typeId ;

    /** approveal_content;审批内容 */
    @ApiModelProperty("审批内容")
    private String approvealContent ;

    /** approveal_time;审批时间 */
    @ApiModelProperty("审批时间")
    private String approvealTime ;

    /** approveal_result;审批结果 */
    @ApiModelProperty("审批结果")
    private String approvealResult ;

}
