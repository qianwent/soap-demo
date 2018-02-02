package com.qwt.webservice.server.exception;

/**
 * Created by Wentao Qian on 2/2/2018.
 */
public class UserException extends Exception{

    public UserException() {
        super();
    }

    public UserException(String message) {
        super(message);
    }

    public UserException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserException(Throwable cause) {
        super(cause);
    }

}
