package com.wzy.yeb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzy.yeb.pojo.Admin;
import com.wzy.yeb.pojo.RespBean;
import com.wzy.yeb.pojo.Role;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author 吴真有
* @description 针对表【t_admin】的数据库操作Service
* @createDate 2024-01-17 18:35:10
*/
public interface AdminService extends IService<Admin> {
    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param code
     * @param request
     * @return
     */
    RespBean login(String username, String password, String code, HttpServletRequest request);

    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    Admin getAdminByUserName(String username);


    /**
     * 根据用户id查询权限列表
     *
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);

    /**
     * 获取所有操作员
     * @param keywords
     * @return
     */
    List<Admin> getAllAdmins(String keywords);

    /**
     * 更新操作员角色
     * @param adminId
     * @param rids
     * @return
     */
    RespBean updateAdminRole(Integer adminId, Integer[] rids);

    /**
     * 更新用户密码
     * @param oldPass
     * @param pass
     * @param adminId
     * @return
     */
    RespBean updatePassword(String oldPass, String pass, Integer adminId);
}
