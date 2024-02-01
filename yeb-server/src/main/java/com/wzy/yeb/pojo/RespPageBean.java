package com.wzy.yeb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

/**
 * 通用分页返回结果对象
 * @author WZY
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespPageBean {

    private Long total;
    private List<?> data;
}
