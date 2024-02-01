package com.wzy.yeb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzy.yeb.pojo.Menu;
import java.util.List;

/**
* @author 吴真有
* @description 针对表【t_menu】的数据库操作Service
* @createDate 2024-01-17 18:35:10
*/
public interface MenuService extends IService<Menu> {
    /**
     * 根据用户id查询菜单列表
     * @return
     */
    List<Menu> getMenuByAdminId();

    /**
     * 通过角色获取菜单列表
     * @return
     */
    List<Menu> getAllMenusWithRole();

    /**
     * 获取所有菜单
     * @return
     */
    List<Menu> getAllMenus();
}
