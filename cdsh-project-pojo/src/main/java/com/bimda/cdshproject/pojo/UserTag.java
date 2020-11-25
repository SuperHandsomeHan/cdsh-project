package com.bimda.cdshproject.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * user_tag 用户标签表
 * </p>
 *
 * @PACKAGE_NAME: com.bimda.cdshproject.pojo
 * @NAME: UserTag
 * @USER: Han
 * @DATE: 2020/11/25
 * @TIME: 14:51
 * @DAY_NAME_SHORT: 周三
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_tag")
@EqualsAndHashCode(callSuper = false)
public class UserTag {

    private static final long serialVersionUID = 1L;

    /**
     * user_id 用户编号
     */
    @ApiModelProperty("用户编号")
    private String userId;

    /**
     * type_id 类型编号
     */
    @ApiModelProperty("类型编号")
    private String typeId;
}
