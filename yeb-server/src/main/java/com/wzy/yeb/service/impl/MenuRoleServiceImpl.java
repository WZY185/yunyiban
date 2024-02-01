package com.wzy.yeb.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzy.yeb.mapper.MenuRoleMapper;
import com.wzy.yeb.pojo.MenuRole;
import com.wzy.yeb.pojo.RespBean;
import com.wzy.yeb.service.MenuRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @author 吴真有
* @description 针对表【t_menu_role】的数据库操作Service实现
* @createDate 2024-01-17 18:35:10
*/
@Service
public class MenuRoleServiceImpl extends ServiceImpl<MenuRoleMapper, MenuRole>
    implements MenuRoleService {

    @Autowired
    private MenuRoleMapper menuRoleMapper;

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    @Override
    @Transactional
    public RespBean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.delete(new QueryWrapper<MenuRole>().eq("rid",rid));
        if (null==mids||0==mids.length){
            return RespBean.success("更新成功！");
        }
        Integer result = menuRoleMapper.insertRecord(rid,mids);
        if (result == mids.length){
            return RespBean.success("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
}




