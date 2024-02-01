package com.wzy.yeb.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wzy.yeb.pojo.Department;
import com.wzy.yeb.pojo.RespBean;

import java.util.List;

/**
* @author 吴真有
* @description 针对表【t_department】的数据库操作Service
* @createDate 2024-01-17 18:35:10
*/
public interface DepartmentService extends IService<Department> {

    /**
     * 获取所有部门
     * @return
     */
    List<Department> getAllDepartments();
    /**
     * 添加部门
     * @param dep
     * @return
     */
    RespBean addDep(Department dep);
    /**
     * 删除部门
     * @param id
     * @return
     */
    RespBean deleteDep(Integer id);

}
