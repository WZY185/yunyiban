package com.wzy.yeb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzy.yeb.pojo.Admin;
import com.wzy.yeb.pojo.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 吴真有
* @description 针对表【t_admin】的数据库操作Mapper
* @createDate 2024-01-17 18:35:10
* @Entity com.wzy.yeb.pojo.Admin
*/
public interface AdminMapper extends BaseMapper<Admin> {

        /**
         * 获取所有操作员
         * @param id
         * @param keywords
         * @return
         */
        List<Admin> getAllAdmins(@Param("id") Integer id, @Param("keywords") String keywords);

}




