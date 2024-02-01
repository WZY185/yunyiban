package com.wzy.yeb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzy.yeb.pojo.MenuRole;
import com.wzy.yeb.pojo.RespBean;

/**
* @author 吴真有
* @description 针对表【t_menu_role】的数据库操作Service
* @createDate 2024-01-17 18:35:10
*/
public interface MenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
