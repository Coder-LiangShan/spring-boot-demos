package pers.liangshan.doubledatasource.entity;

import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 客户信息表(Customer)实体类
 *
 * @author makejava
 * @since 2020-03-28 12:57:59
 */
@ToString
public class Customer implements Serializable {
    private static final long serialVersionUID = 532909607489536430L;
    /**
    * 自增主键id
    */
    private Integer customerId;
    /**
    * 客户姓名
    */
    private String customerName;
    /**
    * 客户年龄
    */
    private String customerAge;
    /**
    * 插入时间
    */
    private Date insertTime;
    /**
    * 更新时间
    */
    private Date updateTime;


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(String customerAge) {
        this.customerAge = customerAge;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}