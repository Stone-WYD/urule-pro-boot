package com.bstek.demo.urule.dao;

import com.bstek.demo.urule.entity.Weather;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Weather)表数据库访问层
 *
 * @author makejava
 * @since 2023-05-15 10:29:53
 */
public interface WeatherDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Weather queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param weather 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Weather> queryAllByLimit(Weather weather, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param weather 查询条件
     * @return 总行数
     */
    long count(Weather weather);

    /**
     * 新增数据
     *
     * @param weather 实例对象
     * @return 影响行数
     */
    int insert(Weather weather);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Weather> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Weather> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Weather> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Weather> entities);

    /**
     * 修改数据
     *
     * @param weather 实例对象
     * @return 影响行数
     */
    int update(Weather weather);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

