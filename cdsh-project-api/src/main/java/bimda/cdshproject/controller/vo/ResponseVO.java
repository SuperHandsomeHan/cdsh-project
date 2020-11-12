package bimda.cdshproject.controller.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lishun
 * @date 2020/6/5
 */
@Getter
@Setter
public class ResponseVO<T> {
    private Integer code;
    private Object message;
    private T data;
}
