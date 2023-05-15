package com.bstek.demo.urule.entity;

import java.io.Serializable;

/**
 * (Customer)实体类
 *
 * @author makejava
 * @since 2023-05-15 10:17:44
 */
public class Customer implements Serializable {
    private static final long serialVersionUID = 157864538076374351L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 出行方式
     */
    private String travelMode;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(String travelMode) {
        this.travelMode = travelMode;
    }

}

