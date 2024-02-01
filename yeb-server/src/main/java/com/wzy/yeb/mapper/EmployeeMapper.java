package com.wzy.yeb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wzy.yeb.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

/**
* @author 吴真有
* @description 针对表【t_employee】的数据库操作Mapper
* @createDate 2024-01-17 18:35:10
* @Entity com.wzy.yeb.pojo.Employee
*/
public interface EmployeeMapper extends BaseMapper<Employee> {

    /**
     * 获取所有员工(分页)
     * @param page
     * @param employee
     * @param beginDateScope
     */
    IPage<Employee> getEmployeeByPage(Page<Employee> page,
                                      @Param("employee") Employee employee,
                                      @Param("beginDateScope") LocalDate[] beginDateScope);


    /**
     * 查询员工
     * @param id
     * @return
     */
    List<Employee> getEmployee(Integer id);

    /**
     * 获取所有员工账套
     *
     * @param page
     * @return
     */
    IPage<Employee> getEmployeeWithSalary(Page<Employee> page);

}




