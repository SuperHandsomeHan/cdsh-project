package com.bimda.cdshproject.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.pojo.vo
 * @NAME: WeChatApplet
 * @USER: code.rookie
 * @DATE: 2020/11/27
 * @TIME: 9:40 上午
 * @DAY_NAME_SHORT: 周五
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeChatAppletVO {
    private String headerOpenId;
    private String headerUserToken;
}
