package com.wzy.yeb.controller;

import com.wzy.yeb.pojo.Joblevel;
import com.wzy.yeb.pojo.RespBean;
import com.wzy.yeb.service.JoblevelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * 职称
 * @author wzy173
 * @create 2024-01-2024/1/17 20:07
 */
@Api(tags = "JoblevelController")
@RestController
@RequestMapping("/system/basic/joblevel")
public class JoblevelController {

    @Autowired
    private JoblevelService joblevelService;

    @ApiOperation(value = "获取所有职称")
    @GetMapping
    public List<Joblevel> getAllJobLevels(){
        return joblevelService.list();
    }

    @ApiOperation(value = "添加职称")
    @PostMapping
    public RespBean addJobLevel(@RequestBody Joblevel jobLevel){
        jobLevel.setCreateDate(LocalDateTime.now());
        if (joblevelService.save(jobLevel)){
            return RespBean.success("添加成功!");
        }
        return RespBean.error("添加失败!");
    }

    @ApiOperation(value = "更新职称")
    @PutMapping
    public RespBean updateJobLevel(@RequestBody Joblevel jobLevel){
        if (joblevelService.updateById(jobLevel)){
            return RespBean.success("更新成功!");
        }
        return RespBean.error("更新失败!");
    }

    @ApiOperation(value = "删除职称")
    @DeleteMapping("{id}")
    public RespBean deleteJobLevel(@PathVariable Integer id){
        if (joblevelService.removeById(id)){
            return RespBean.success("删除成功!");
        }
        return RespBean.error("删除失败!");
    }

    @ApiOperation(value = "批量删除职称")
    @DeleteMapping
    public RespBean deleteJobLevelByIds(Integer[] ids){
        if (joblevelService.removeByIds(Arrays.asList(ids))){
            return RespBean.success("删除成功!");
        }
        return RespBean.error("删除失败!");
    }

}
