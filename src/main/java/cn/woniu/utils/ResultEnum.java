package cn.woniu.utils;

public enum ResultEnum {
    SUCCESS(200, "登录成功"),
    FAIL(2000, "登录失败"),
    NO_LOGIN(2001, "尚未登录,请先登录"),
    NO_AUTHORITY(2002, "没有权限,请先充值"),
    LOGOUT(2003, "退出成功"),
    FAILURE(2004, "失败");

    private Integer code;

    private String msg;

    ResultEnum() {
    }

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
