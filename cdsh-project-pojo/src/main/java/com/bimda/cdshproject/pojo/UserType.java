package com.bimda.cdshproject.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * user_type 会员类型表
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_type")
@EqualsAndHashCode(callSuper = false)
public class UserType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * type_id 类型编号
     */
    @TableId(value = "type_id", type = IdType.AUTO)
    @ApiModelProperty("类型编号")
    private Integer typeId;

    /**
     * type_name 类型名称
     */
    @ApiModelProperty("类型名称")
    private String typeName;


}
