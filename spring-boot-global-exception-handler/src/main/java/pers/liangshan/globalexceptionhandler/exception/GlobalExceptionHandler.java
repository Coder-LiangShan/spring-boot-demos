package pers.liangshan.globalexceptionhandler.exception;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.liangshan.globalexceptionhandler.constant.Status;
import pers.liangshan.globalexceptionhandler.dto.ApiResponse;

/**
 * 功能描述: 全局统一异常处理类
 *
 * @auther: LiangShan
 * @date: 2020/3/31 23:35
 *
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ApiResponse<String> exceptionHandler(Exception e) {
        log.error("未知异常:{}",e);
        return new ApiResponse<>(Status.SERVER_ERROR,null);
    }


    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public ApiResponse<String> bizException(Exception e) {

        if(StringUtils.isNotBlank(e.getMessage())) {
            return new ApiResponse<>(Status.BIZ_EXCEPTION.getRspCode(),e.getMessage(),null);
        }else {
            return new ApiResponse<>(Status.BIZ_EXCEPTION,null);
        }
    }

}
