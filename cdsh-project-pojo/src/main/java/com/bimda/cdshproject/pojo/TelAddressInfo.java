package com.bimda.cdshproject.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * tel_address_info 电话地址信息表
 * </p>
 *
 * @PACKAGE_NAME: com.bimda.cdshproject.pojo
 * @NAME: TelAddressInfo
 * @USER: Han
 * @DATE: 2020/11/25
 * @TIME: 14:59
 * @DAY_NAME_SHORT: 周三
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tel_address_info")
@EqualsAndHashCode(callSuper = false)
public class TelAddressInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * address_id 地址编号
     */
    @TableId(value = "address_id")
    @ApiModelProperty("地址编号")
    private String addressId;

    /**
     * address_tel 手机/电话号
     */
    @ApiModelProperty("手机/电话号")
    private String addressTel;

    /**
     * address_semicolon 电话分号
     */
    @ApiModelProperty("电话分号")
    private String addressSemicolon;

    /**
     * contant_type 联系地址类型
     */
    @ApiModelProperty("联系地址类型")
    private String contantType;

    /**
     * user_id 用户编号
     */
    @ApiModelProperty("用户编号")
    private String userId;

    /**
     * create_time 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;
}
