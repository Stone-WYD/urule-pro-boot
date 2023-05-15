package com.bstek.demo.urule.service;

import com.bstek.demo.urule.entity.Weather;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Weather)表服务接口
 *
 * @author makejava
 * @since 2023-05-15 10:30:00
 */
public interface WeatherService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Weather queryById(Integer id);

    /**
     * 分页查询
     *
     * @param weather 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Weather> queryByPage(Weather weather, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param weather 实例对象
     * @return 实例对象
     */
    Weather insert(Weather weather);

    /**
     * 修改数据
     *
     * @param weather 实例对象
     * @return 实例对象
     */
    Weather update(Weather weather);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
