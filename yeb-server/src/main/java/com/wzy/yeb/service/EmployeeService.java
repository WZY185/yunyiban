package com.wzy.yeb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzy.yeb.pojo.Employee;
import com.wzy.yeb.pojo.RespBean;
import com.wzy.yeb.pojo.RespPageBean;

import java.time.LocalDate;
import java.util.List;

/**
* @author 吴真有
* @description 针对表【t_employee】的数据库操作Service
* @createDate 2024-01-17 18:35:10
*/
public interface EmployeeService extends IService<Employee> {

    /**
     * 获取所有员工(分页)
     * @param currentPage
     * @param size
     * @param employee
     * @param beginDateScope
     * @return
     */
    RespPageBean getEmployeeByPage(Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope);

    /**
     * 获取工号
     * @return
     */
    RespBean maxWorkId();

    /**
     * 添加员工
     * @param employee
     * @return
     */
    RespBean insertEmployee(Employee employee);

    /**
     * 查询员工
     * @param id
     * @return
     */
    List<Employee> getEmployee(Integer id);

    /**
     * 获取所有员工账套
     *
     * @param currentPage
     * @param size
     * @return
     */
    RespPageBean getEmployeeWithSalary(Integer currentPage, Integer size);

}
