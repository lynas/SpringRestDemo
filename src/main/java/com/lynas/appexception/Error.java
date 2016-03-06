package com.lynas.appexception;

/**
 * Created by LynAs on 06-Mar-16
 */
public class Error {
    private double code;
    private String message;
    public Error(double code, String message) {
        this.code = code;
        this.message = message;
    }
    public double getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
}
