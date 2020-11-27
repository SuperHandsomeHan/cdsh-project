package com.bimda.cdshproject.resoures;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.resoures
 * @NAME: WeChatAppletloca
 * @USER: code.rookie
 * @DATE: 2020/11/26
 * @TIME: 2:42 下午
 * @DAY_NAME_SHORT: 周四
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Component
@ConfigurationProperties(prefix = "wechat")
@Data
public class GetWeChatAppletCredentials {
    private String appId;
    private String secretKey;
}
