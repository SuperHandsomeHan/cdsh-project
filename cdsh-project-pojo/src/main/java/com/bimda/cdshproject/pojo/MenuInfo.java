package com.bimda.cdshproject.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * menu_info 权限信息表
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "menu_id")
@EqualsAndHashCode(callSuper = false)
public class MenuInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * menu_id 权限编号
     */
    @TableId(value = "menu_id", type = IdType.AUTO)
    @ApiModelProperty("权限编号")
    private Integer menuId;

    /**
     * parent_id 上级编号
     */
    @ApiModelProperty("上级编号")
    private Integer parentId;

    /**
     * menu_name 权限名称
     */
    @ApiModelProperty("权限名称")
    private String menuName;

    /**
     * url 接口路径
     */
    @ApiModelProperty("接口路径")
    private String url;

    /**
     * order_num 菜单顺序号
     */
    @ApiModelProperty("菜单顺序号")
    private Integer orderNum;

    /**
     * is_use 是否使用
     */
    @ApiModelProperty("是否使用")
    private String isUse;

    /**
     * create_time 创建时间
     */
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    /**
     * create_admin 创建人
     */
    @ApiModelProperty("创建人")
    private String createAdmin;


}
