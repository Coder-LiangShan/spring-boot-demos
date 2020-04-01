package pers.liangshan.globalexceptionhandler.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.liangshan.globalexceptionhandler.dto.ApiResponse;
import pers.liangshan.globalexceptionhandler.dto.Customer;
import pers.liangshan.globalexceptionhandler.exception.BizException;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @PostMapping("/customer")
    public ApiResponse<String> insert(@RequestBody Customer customer) {

        if(StringUtils.isEmpty(customer.getCustomerName())){
            //参数不符合规范，抛出异常，由统一异常处理
            throw  new BizException("客户姓名不能为空！");
        }
        //只做演示，不做业务处理
        return ApiResponse.success(null);
    }

    @GetMapping("/customer")
    public ApiResponse<String> getCustomer(@RequestBody Customer customer) {
        //制造一个异常
        String id = null;
        id.length();
        //只做演示，不做业务处理
        return  ApiResponse.success(null);
    }

}
