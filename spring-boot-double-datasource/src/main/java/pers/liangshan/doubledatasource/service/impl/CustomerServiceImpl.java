package pers.liangshan.doubledatasource.service.impl;

import pers.liangshan.doubledatasource.entity.Customer;
import pers.liangshan.doubledatasource.dao.ds1.CustomerDao;
import pers.liangshan.doubledatasource.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户信息表(Customer)表服务实现类
 *
 * @author makejava
 * @since 2020-03-28 12:58:02
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerDao customerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param customerId 主键
     * @return 实例对象
     */
    @Override
    public Customer queryById(Integer customerId) {
        return this.customerDao.queryById(customerId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Customer> queryAllByLimit(int offset, int limit) {
        return this.customerDao.queryAllByLimit(offset, limit);
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
        return this.queryById(customer.getCustomerId());
    }

    /**
     * 通过主键删除数据
     *
     * @param customerId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer customerId) {
        return this.customerDao.deleteById(customerId) > 0;
    }
}