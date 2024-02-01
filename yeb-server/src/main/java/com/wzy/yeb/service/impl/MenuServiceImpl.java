package com.wzy.yeb.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzy.yeb.mapper.MenuMapper;
import com.wzy.yeb.pojo.Admin;
import com.wzy.yeb.pojo.Menu;
import com.wzy.yeb.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 吴真有
* @description 针对表【t_menu】的数据库操作Service实现
* @createDate 2024-01-17 18:35:10
*/
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu>
    implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    /**
     * 根据用户id查询菜单列表
     * @return
     */
    @Override
    public List<Menu> getMenuByAdminId() {
        return menuMapper.getMenuByAdminId(((Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    /**
     * 通过角色获取菜单列表
     *
     * @return
     */
    @Override
    public List<Menu> getAllMenusWithRole() {
        return menuMapper.getAllMenusWithRole();
    }

    /**
     * 获取所有菜单
     * @return
     */
    @Override
    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }

}




