package com.wzy.yeb.controller;

import com.wzy.yeb.pojo.Menu;
import com.wzy.yeb.service.AdminService;
import com.wzy.yeb.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 菜单
 * @author wzy173
 * @create 2024-01-2024/1/17 20:07
 */
@Api(tags = "MenuController")
@RestController
@RequestMapping("/system/config")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @ApiOperation(value = "通过用户id查询菜单列表")
    @GetMapping("/menu")
    public List<Menu> getMenuByAdminId(){
        return menuService.getMenuByAdminId();
    }


}
