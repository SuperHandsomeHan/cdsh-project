package com.bimda.cdshproject.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.pojo
 * @NAME: OperationLog
 * @USER: Han
 * @DATE: 2020/11/16
 * @TIME: 10:25
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "operation_log")
public class OperationLog {

    private static final long serialVersionUID = 1L;

    /** operation_id;操作编号 */
    @Id
    @ApiModelProperty("操作编号")
    private String operationId ;

    /** operation_content;操作内容 */
    @ApiModelProperty("操作内容")
    private String operationContent ;

    /** operation_time;操作时间 */
    @ApiModelProperty("操作时间")
    private Date operationTime ;

    /** operation_admin;操作人编号 */
    @ApiModelProperty("操作人编号")
    private String operationAdmin ;
}
