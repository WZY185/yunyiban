package com.wzy.yeb.utils;

import com.wzy.yeb.pojo.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author wzy173
 * @create 2024-01-2024/1/28 14:30
 * 操作员工具类
 */
public class AdminUtils {
    /**
     * 获取当前登录操作员
     */
    public static Admin getCurrentAdmin(){
        return (Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
