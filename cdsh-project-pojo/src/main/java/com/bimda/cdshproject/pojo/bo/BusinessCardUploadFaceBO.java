package com.bimda.cdshproject.pojo.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.pojo.bo
 * @NAME: UploadFace
 * @USER: code.rookie
 * @DATE: 2020/11/16
 * @TIME: 10:56 上午
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusinessCardUploadFaceBO {
    /**
     * card_id 卡片编号
     */
    @ApiModelProperty("卡片编号")
    private String cardId;

    /** user_id;用户编号 */
    @ApiModelProperty("用户编号")
    private String userId ;
    /**
     * u_face 头像
     */
    @ApiModelProperty("头像")
    private MultipartFile fileFace;
}
