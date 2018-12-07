package com.matao.common;

/**
 * Created by matao on 2018-12-07.
 */
public class InvalidParameterException extends RuntimeException{

    public InvalidParameterException() {
    }

    public InvalidParameterException(String message) {
        super(message);
    }
}
