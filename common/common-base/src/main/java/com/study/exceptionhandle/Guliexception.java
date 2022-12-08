package com.study.exceptionhandle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: xiaocai
 * @since: 2022/12/08/22:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guliexception extends RuntimeException {
    private Integer code;//状态码
    private String msg;//异常信息
}
