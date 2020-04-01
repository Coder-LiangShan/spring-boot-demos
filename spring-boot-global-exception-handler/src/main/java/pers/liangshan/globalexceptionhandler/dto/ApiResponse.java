package pers.liangshan.globalexceptionhandler.dto;

import lombok.Data;
import pers.liangshan.globalexceptionhandler.constant.Status;
@Data
public class ApiResponse<T> {

    private String rspCode;
    private String rspMsg;
    private T result;

    public ApiResponse(T result) {
    }

    public ApiResponse(String errorCode,String errorMsg, T result) {
        this.rspCode = errorCode;
        this.rspMsg = errorMsg;
        this.result = result;
    }

    public ApiResponse(Status status, T result) {
        this.rspCode = status.getRspCode();
        this.rspMsg = status.getRspMsg();
        this.result = result;
    }

    public static <T> ApiResponse<T> success(T result){
        return new ApiResponse<>(Status.SUCCESS,result);
    }

    public static <T> ApiResponse<T> error(Status status,T result){
        return new ApiResponse<>(status,result);
    }

}
