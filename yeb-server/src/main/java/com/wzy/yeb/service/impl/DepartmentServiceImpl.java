package com.wzy.yeb.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzy.yeb.mapper.DepartmentMapper;
import com.wzy.yeb.pojo.Department;
import com.wzy.yeb.pojo.RespBean;
import com.wzy.yeb.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 吴真有
* @description 针对表【t_department】的数据库操作Service实现
* @createDate 2024-01-17 18:35:10
*/
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
    implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * 获取所有部门
     * @return
     */
    @Override
    public List<Department> getAllDepartments() {
        return departmentMapper.getAllDepartmentsByParentId(-1);
    }

    /**
     * 添加部门
     * @param dep
     * @return
     */
    @Override
    public RespBean addDep(Department dep) {
        dep.setEnabled(true);
        departmentMapper.addDep(dep);
        if (1==dep.getResult()){
            return RespBean.success("添加成功!",dep);
        }
        return RespBean.error("添加失败!");
    }

    /**
     * 删除部门
     * @param id
     * @return
     */
    @Override
    public RespBean deleteDep(Integer id) {
        Department dep = new Department();
        dep.setId(id);
        departmentMapper.deleteDep(dep);
        if (-2==dep.getResult()){
            return RespBean.error("该部门下有子部门，删除失败！");
        }
        if (-1==dep.getResult()){
            return RespBean.error("该部门下有员工，删除失败！");
        }
        if (1==dep.getResult()){
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

}




