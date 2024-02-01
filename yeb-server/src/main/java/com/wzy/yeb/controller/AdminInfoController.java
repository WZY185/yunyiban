package com.wzy.yeb.controller;

import com.wzy.yeb.pojo.Admin;
import com.wzy.yeb.pojo.RespBean;
import com.wzy.yeb.pojo.Role;
import com.wzy.yeb.service.AdminService;
import com.wzy.yeb.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 个人中心
 * @author wzy173
 * @create 2024-01-2024/1/17 20:07
 */
@Api(tags = "AdminInfoController")
@RestController
public class AdminInfoController {

    @Autowired
    private AdminService adminService;

    @ApiOperation(value = "更新当前用户信息")
    @PutMapping("/admin/info")
    public RespBean updateHr(@RequestBody Admin admin, Authentication authentication) {
        //更新成功，重新构建Authentication对象
        if (adminService.updateById(admin)) {

            SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(
                    admin, //1.用户对象
                    authentication.getCredentials(), //2.凭证（密码）
                    authentication.getAuthorities())); // 3.用户角色
            return RespBean.success("更新成功!");
        }
        return RespBean.error("更新失败!");
    }

    @ApiOperation(value = "更新用户密码")
    @PutMapping("/admin/pass")
    public RespBean updateHrPassword(@RequestBody Map<String,Object> info){
        String oldPass = (String) info.get("oldPass");
        String pass = (String) info.get("pass");
        Integer adminId = (Integer) info.get("adminId");
        return adminService.updatePassword(oldPass,pass,adminId);
    }
}

