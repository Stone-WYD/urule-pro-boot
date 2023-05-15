package com.bstek.demo.urule.service.impl;

import com.bstek.demo.urule.entity.Customer;
import com.bstek.demo.urule.dao.CustomerDao;
import com.bstek.demo.urule.service.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Customer)表服务实现类
 *
 * @author makejava
 * @since 2023-05-15 10:17:44
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerDao customerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Customer queryById(Long id) {
        return this.customerDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param customer 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Customer> queryByPage(Customer customer, PageRequest pageRequest) {
        long total = this.customerDao.count(customer);
        return new PageImpl<>(this.customerDao.queryAllByLimit(customer, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    @Override
    public Customer insert(Customer customer) {
        this.customerDao.insert(customer);
        return customer;
    }

    /**
     * 修改数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    @Override
    public Customer update(Customer customer) {
        this.customerDao.update(customer);
        return this.queryById(customer.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.customerDao.deleteById(id) > 0;
    }
}
