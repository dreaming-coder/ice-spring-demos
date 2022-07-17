package com.ice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "your reason")  // 传入该异常的返回码以及原因
public class XException extends RuntimeException {

    public XException(String msg) {
        super(msg);
    }
}
