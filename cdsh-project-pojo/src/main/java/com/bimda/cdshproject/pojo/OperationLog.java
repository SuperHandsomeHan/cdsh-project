package com.bimda.cdshproject.pojo;

import java.time.LocalDate;
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
 * operation_log 操作日志表
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "operation_log")
@EqualsAndHashCode(callSuper = false)
public class OperationLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * operation_id 操作编号
     */
    @TableId(value = "operation_id")
    @ApiModelProperty("操作编号")
    private String operationId;

    /**
     * operation_content 操作内容
     */
    @ApiModelProperty("操作内容")
    private String operationContent;

    /**
     * operation_time 操作时间
     */
    @ApiModelProperty("操作时间")
    private LocalDate operationTime;

    /**
     * operation_admin 操作人编号
     */
    @ApiModelProperty("操作人编号")
    private String operationAdmin;


}
