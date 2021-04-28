package com.sjm.feign.impl;

import com.sjm.entity.Student;
import com.sjm.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author sjm5858
 * @date 2021/4/28 16:29
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中.....";
    }
}
