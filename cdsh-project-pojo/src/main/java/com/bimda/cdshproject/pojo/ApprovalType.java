package com.bimda.cdshproject.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.pojo
 * @NAME: ApprovalType
 * @USER: Han
 * @DATE: 2020/11/16
 * @TIME: 10:23
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "approval_type")
public class ApprovalType {

    private static final long serialVersionUID = 1L;

    /** type_id;审批类型编号 */
    @Id
    @ApiModelProperty("审批类型编号")
    private Integer typeId ;

    /** type_name;审批类型名称 */

    @ApiModelProperty("审批类型名称")
    private String typeName ;
}
