package com.wzy.yeb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzy.yeb.pojo.MenuRole;
import org.apache.ibatis.annotations.Param;

/**
* @author 吴真有
* @description 针对表【t_menu_role】的数据库操作Mapper
* @createDate 2024-01-17 18:35:10
* @Entity com.wzy.yebserver.pojo.MenuRole
*/
public interface MenuRoleMapper extends BaseMapper<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    Integer insertRecord(@Param("rid") Integer rid, @Param("mids") Integer[] mids);

}




