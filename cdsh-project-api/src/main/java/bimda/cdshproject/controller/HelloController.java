package bimda.cdshproject.controller;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME: bimda.cdshproject.controller
 * @NAME: HelloController
 * @USER: code.rookie
 * @DATE: 2020/11/10
 * @TIME: 11:05 上午
 * @DAY_NAME_SHORT: 周二
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello World";
    }
}
