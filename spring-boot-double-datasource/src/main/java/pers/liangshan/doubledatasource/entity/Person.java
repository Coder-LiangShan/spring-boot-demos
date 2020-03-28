package pers.liangshan.doubledatasource.entity;

import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 人员信息表(Person)实体类
 *
 * @author makejava
 * @since 2020-03-28 13:08:26
 */
@ToString
public class Person implements Serializable {
    private static final long serialVersionUID = -38491362855781322L;
    /**
    * 自增主键id
    */
    private Integer personId;
    /**
    * 人员姓名
    */
    private String personName;
    /**
    * 人员龄
    */
    private String personAge;
    /**
    * 插入时间
    */
    private Date insertTime;
    /**
    * 更新时间
    */
    private Date updateTime;


    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAge() {
        return personAge;
    }

    public void setPersonAge(String personAge) {
        this.personAge = personAge;
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