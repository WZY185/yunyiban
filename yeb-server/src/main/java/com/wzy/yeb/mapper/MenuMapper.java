package com.wzy.yeb.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzy.yeb.pojo.Menu;

import java.util.List;

/**
* @author 吴真有
* @description 针对表【t_menu】的数据库操作Mapper
* @createDate 2024-01-17 18:35:10
* @Entity com.wzy.yebserver.pojo.Menu
*/
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     * 根据用户id查询菜单列表
     * @return
     */
    List<Menu> getMenuByAdminId(Integer id);

    /**
     * 通过角色获取菜单列表
     *
     * @return
     */
    List<Menu> getAllMenusWithRole();

    /**
     * 获取所有菜单
     * @return
     */
    List<Menu> getAllMenus();
}




