package com.bstek.demo.urule.entity;

import java.io.Serializable;

/**
 * (Weather)实体类
 *
 * @author makejava
 * @since 2023-05-15 10:29:53
 */
public class Weather implements Serializable {
    private static final long serialVersionUID = -98448438880893064L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 天气类型
     */
    private String type;
    /**
     * 温度
     */
    private Integer temperature;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

}

