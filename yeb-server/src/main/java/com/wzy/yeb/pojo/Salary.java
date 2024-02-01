package com.wzy.yeb.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 
 * @TableName t_salary
 */
@TableName(value ="t_salary")
@Data
@ApiModel(value = "Salary对象",description = "")
public class Salary implements Serializable {

    @ApiModelProperty(value = "id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "基本工资")
    private Integer basicSalary;

    @ApiModelProperty(value = "奖金")
    private Integer bonus;

    @ApiModelProperty(value = "午餐补助")
    private Integer lunchSalary;

    @ApiModelProperty(value = "交通补助")
    private Integer trafficSalary;

    @ApiModelProperty(value = "应发工资")
    private Integer allSalary;

    @ApiModelProperty(value = "养老基金数")
    private Integer pensionBase;

    @ApiModelProperty(value = "养老金比率")
    private Double pensionPer;

    @ApiModelProperty(value = "启用时间")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "医疗基数")
    private Integer medicalBase;

    @ApiModelProperty(value = "医疗保险比率")
    private Double medicalPer;

    @ApiModelProperty(value = "公积金基数")
    private Integer accumulationFundBase;

    @ApiModelProperty(value = "公积金比率")
    private Double accumulationFundPer;

    @ApiModelProperty(value = "名称")
    private String name;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}