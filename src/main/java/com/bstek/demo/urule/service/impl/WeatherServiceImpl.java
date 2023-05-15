package com.bstek.demo.urule.service.impl;

import com.bstek.demo.urule.entity.Weather;
import com.bstek.demo.urule.dao.WeatherDao;
import com.bstek.demo.urule.service.WeatherService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Weather)表服务实现类
 *
 * @author makejava
 * @since 2023-05-15 10:30:00
 */
@Service("weatherService")
public class WeatherServiceImpl implements WeatherService {
    @Resource
    private WeatherDao weatherDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Weather queryById(Integer id) {
        return this.weatherDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param weather 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Weather> queryByPage(Weather weather, PageRequest pageRequest) {
        long total = this.weatherDao.count(weather);
        return new PageImpl<>(this.weatherDao.queryAllByLimit(weather, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param weather 实例对象
     * @return 实例对象
     */
    @Override
    public Weather insert(Weather weather) {
        this.weatherDao.insert(weather);
        return weather;
    }

    /**
     * 修改数据
     *
     * @param weather 实例对象
     * @return 实例对象
     */
    @Override
    public Weather update(Weather weather) {
        this.weatherDao.update(weather);
        return this.queryById(weather.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.weatherDao.deleteById(id) > 0;
    }
}
