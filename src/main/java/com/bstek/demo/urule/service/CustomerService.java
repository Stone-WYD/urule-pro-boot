package com.bstek.demo.urule.service;

import com.bstek.demo.urule.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Customer)表服务接口
 *
 * @author makejava
 * @since 2023-05-15 10:40:33
 */
public interface CustomerService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Customer queryById(Long id);

    /**
     * 分页查询
     *
     * @param customer 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Customer> queryByPage(Customer customer, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    Customer insert(Customer customer);

    /**
     * 修改数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    Customer update(Customer customer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
