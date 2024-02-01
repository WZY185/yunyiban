package com.wzy.yeb.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzy.yeb.pojo.AdminRole;
import org.apache.ibatis.annotations.Param;

/**
* @author 吴真有
* @description 针对表【t_admin_role】的数据库操作Mapper
* @createDate 2024-01-17 18:35:10
* @Entity com.wzy.yeb.pojo.AdminRole
*/
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

    /**
     * 添加操作员角色
     * @param adminId
     * @param rids
     * @return
     */
    Integer addRole(@Param("adminId") Integer adminId, @Param("rids") Integer[] rids);

}




