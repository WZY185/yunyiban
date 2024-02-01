package com.wzy.yeb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzy.yeb.pojo.Role;

import java.util.List;

/**
* @author 吴真有
* @description 针对表【t_role】的数据库操作Mapper
* @createDate 2024-01-17 18:35:10
* @Entity com.wzy.yeb.pojo.Role
*/
public interface RoleMapper extends BaseMapper<Role> {


    /**
     * 根据用户id获取权限列表
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);
}




