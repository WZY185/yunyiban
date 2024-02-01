package com.wzy.yeb.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;

/**
 * 
 * @TableName t_admin_role
 */
@TableName(value ="t_admin_role")
@Data
@ApiModel(value = "AdminRole对象",description = "")
public class AdminRole implements Serializable {

    @ApiModelProperty(value = "id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户id")
    private Integer adminId;

    @ApiModelProperty(value = "权限id")
    private Integer rid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}