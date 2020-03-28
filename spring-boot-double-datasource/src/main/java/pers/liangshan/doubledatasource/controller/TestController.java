package pers.liangshan.doubledatasource.controller;

import pers.liangshan.doubledatasource.entity.Person;
import pers.liangshan.doubledatasource.service.CustomerService;
import pers.liangshan.doubledatasource.service.PersonService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 测试双数据源的配置
 *
 * @author makejava
 * @since 2020-03-28 13:10:26
 */
@RestController
public class TestController {

    //数据源1对应的表的customerService
    @Resource
    private CustomerService customerService;

    //数据源2对应的表的personService
    @Resource
    private PersonService personService;


    /**
     * 功能描述: 测试查询结果
     *
     * @auther: LiangShan
     * @date: 2020/3/28 13:17
     */
    @GetMapping("test")
    public String test() {
        //打印数据源1的查询结果
        System.out.println("数据源1：\t" + customerService.queryById(1).toString());
        //打印数据源2的查询结果1
        System.out.println("数据源2：\t" + personService.queryById(1).toString());

        return "数据源1：" + customerService.queryById(1).toString()+"<br/>"+
                "数据源2：" + personService.queryById(1).toString();


    }

}