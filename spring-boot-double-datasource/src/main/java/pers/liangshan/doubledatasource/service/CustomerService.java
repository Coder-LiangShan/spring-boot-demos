package pers.liangshan.doubledatasource.service;

import pers.liangshan.doubledatasource.entity.Customer;
import java.util.List;

/**
 * 客户信息表(Customer)表服务接口
 *
 * @author makejava
 * @since 2020-03-28 12:58:00
 */
public interface CustomerService {

    /**
     * 通过ID查询单条数据
     *
     * @param customerId 主键
     * @return 实例对象
     */
    Customer queryById(Integer customerId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Customer> queryAllByLimit(int offset, int limit);

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
     * @param customerId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer customerId);

}