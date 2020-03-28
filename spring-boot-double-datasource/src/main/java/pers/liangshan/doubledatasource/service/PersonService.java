package pers.liangshan.doubledatasource.service;

import pers.liangshan.doubledatasource.entity.Person;
import java.util.List;

/**
 * 人员信息表(Person)表服务接口
 *
 * @author makejava
 * @since 2020-03-28 13:08:26
 */
public interface PersonService {

    /**
     * 通过ID查询单条数据
     *
     * @param personId 主键
     * @return 实例对象
     */
    Person queryById(Integer personId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Person> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param person 实例对象
     * @return 实例对象
     */
    Person insert(Person person);

    /**
     * 修改数据
     *
     * @param person 实例对象
     * @return 实例对象
     */
    Person update(Person person);

    /**
     * 通过主键删除数据
     *
     * @param personId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer personId);

}