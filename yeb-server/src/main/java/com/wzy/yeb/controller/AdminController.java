package com.wzy.yeb.controller;

import com.wzy.yeb.pojo.Admin;
import com.wzy.yeb.pojo.Position;
import com.wzy.yeb.pojo.RespBean;
import com.wzy.yeb.pojo.Role;
import com.wzy.yeb.service.AdminService;
import com.wzy.yeb.service.PositionService;
import com.wzy.yeb.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * @author wzy173
 * @create 2024-01-2024/1/17 20:07
 */
@Api(tags = "AdminController")
@RestController
@RequestMapping("/system/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private RoleService roleService;

    @ApiOperation(value = "获取所有操作员")
    @GetMapping("/")
    public List<Admin> getAllHrs(String keywords){
        return adminService.getAllAdmins(keywords);
    }

    @ApiOperation(value = "更新操作员")
    @PutMapping("/")
    public RespBean updateHr(@RequestBody Admin admin){
        if (adminService.updateById(admin)){
            return RespBean.success("更新成功!");
        }
        return RespBean.error("更新失败");
    }

    @ApiOperation(value = "删除操作员")
    @DeleteMapping("/{id}")
    public RespBean deleteHr(@PathVariable Integer id){
        if (adminService.removeById(id)){
            return RespBean.success("删除成功!");
        }
        return RespBean.error("删除失败");
    }


    @ApiOperation(value = "获取所有角色")
    @GetMapping("/roles")
    public List<Role> getAllRoles(){
        return roleService.list();
    }

    @ApiOperation(value = "更新操作员角色")
    @PutMapping("/role")
    public RespBean updateHrRole(Integer adminId,Integer[] rids){
        return adminService.updateAdminRole(adminId,rids);
    }

}

