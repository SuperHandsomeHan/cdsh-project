package com.bimda.cdshproject.pojo.bo;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.pojo.bo
 * @NAME: BusinessCardBO
 * @USER: code.rookie
 * @DATE: 2020/11/16
 * @TIME: 10:01 上午
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: cdsh-project
 * @Desc:接收用户返回的消息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessCardUpdateStateBO {
    /** user_id;用户编号 */
    @ApiModelProperty("用户编号")
    private String userId ;
    /**
     * card_id 卡片编号
     */
    @TableId(value = "card_id")
    @ApiModelProperty("卡片编号")
    private String cardId;
    /**
     * is_default 是否默认
     */
    @ApiModelProperty("是否默认")
    private String isDefault;

    /**
     * is_open 是否公开
     */
    @ApiModelProperty("是否公开")
    private String isOpen;
}
