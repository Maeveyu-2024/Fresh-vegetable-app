package cn.woniu.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult<T> {
    private Integer code;
    private String msg;
    private T data;

    public static final ResponseResult<Void> SUCCESS = new ResponseResult<>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMsg());
    public static final ResponseResult<Void> FAIL = new ResponseResult<>(ResultEnum.FAIL.getCode(), ResultEnum.FAIL.getMsg());
    public static final ResponseResult<Void> NO_LOGIN = new ResponseResult<>(ResultEnum.NO_LOGIN.getCode(), ResultEnum.NO_LOGIN.getMsg());
    public static final ResponseResult<Void> NO_AUTHORITY = new ResponseResult<>(ResultEnum.NO_AUTHORITY.getCode(), ResultEnum.NO_AUTHORITY.getMsg());
    public static final ResponseResult<Void> LOGOUT = new ResponseResult<>(ResultEnum.LOGOUT.getCode(), ResultEnum.LOGOUT.getMsg());
    public static final ResponseResult<Void> FAILURE = new ResponseResult<>(ResultEnum.FAILURE.getCode(), ResultEnum.FAILURE.getMsg());


    public ResponseResult<T> ok(T data) {
        return new ResponseResult<T>(200, data);
    }

    public ResponseResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseResult(Integer code, T data) {
        this.code = code;
        this.data = data;
    }
}
