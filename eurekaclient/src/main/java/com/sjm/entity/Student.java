package com.sjm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author sjm5858
 * @date 2021/4/27 15:41
 */
@Data
@AllArgsConstructor
public class Student {
    private long id;
    private String name;
    private int age;
}
