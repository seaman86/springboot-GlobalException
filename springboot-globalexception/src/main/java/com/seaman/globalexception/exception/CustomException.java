package com.seaman.globalexception.exception;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-01-24 10:41
 * 功能描述:
 * 修改历史:
 */
public class CustomException extends RuntimeException {

    private int code;
    private String message;

    public CustomException() {
        super();
    }

    public CustomException(int code, String message) {
        super(message);
        this.setMessage(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
