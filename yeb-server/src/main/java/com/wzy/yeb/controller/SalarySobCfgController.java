package com.wzy.yeb.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.wzy.yeb.pojo.Employee;
import com.wzy.yeb.pojo.RespBean;
import com.wzy.yeb.pojo.RespPageBean;
import com.wzy.yeb.pojo.Salary;
import com.wzy.yeb.service.EmployeeService;
import com.wzy.yeb.service.SalaryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 员工账套
 * @author wzy
 * @since 1.0.0
 */
@Api(tags = "SalarySobCfgController")
@RestController
@RequestMapping("/salary/sobcfg")
public class SalarySobCfgController {

    @Autowired
    private SalaryService salaryService;

    @Autowired
    private EmployeeService employeeService;

    @ApiOperation(value = "获取所有员工账套")
    @GetMapping("/")
    public RespPageBean getEmployeeWithSalary(@RequestParam(defaultValue = "1")
                                                      Integer currentPage,
                                              @RequestParam(defaultValue = "10")
                                                      Integer size) {
        return employeeService.getEmployeeWithSalary(currentPage, size);
    }

    @ApiOperation(value = "获取所有工资账套")
    @GetMapping("/salaries")
    public List<Salary> getAllSalaries() {
        return salaryService.list();
    }

    @ApiOperation(value = "更新员工账套")
    @PutMapping("/")
    public RespBean updateEmployeeSalary(Integer eid, Integer sid) {
        if (employeeService.update(new UpdateWrapper<Employee>().set("salaryId", sid).eq("id", eid))) {
            return RespBean.success("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
}