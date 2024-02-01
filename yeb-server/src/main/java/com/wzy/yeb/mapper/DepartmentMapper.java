package com.wzy.yeb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzy.yeb.pojo.Department;
import java.util.List;

/**
* @author 吴真有
* @description 针对表【t_department】的数据库操作Mapper
* @createDate 2024-01-17 18:35:10
* @Entity com.wzy.yebserver.pojo.Department
*/
public interface DepartmentMapper extends BaseMapper<Department> {

    /**
     * 获取所有部门
     * @param parentId
     * @return
     */
    List<Department> getAllDepartmentsByParentId(Integer parentId);


    /**
     * 添加部门
     * @param dep
     */
    void addDep(Department dep);


    /**
     * 删除部门
     * @param dep
     */
    void deleteDep(Department dep);

}




