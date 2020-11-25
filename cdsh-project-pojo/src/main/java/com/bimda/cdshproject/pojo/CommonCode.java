package com.bimda.cdshproject.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.pojo
 * @NAME: CommonCode
 * @USER: Han
 * @DATE: 2020/11/24
 * @TIME: 9:59
 * @DAY_NAME_SHORT: 周二
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "common_code")
@EqualsAndHashCode(callSuper = false)
public class CommonCode implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * code_num 标识代码
     */
    @ApiModelProperty("标识代码")
    private String codeNum;

    /**
     * code_type 代码类型
     */
    @ApiModelProperty("代码类型")
    private String codeType;

    /**
     * common_remark 备注
     */
    @ApiModelProperty("备注")
    private String commonRemark;

    /**
     * code_meaning 代码含义
     */
    @ApiModelProperty("代码含义")
    private String codeMeaning;
}
