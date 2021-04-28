package com.sjm.feign;

import com.sjm.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author sjm5858
 * @date 2021/4/28 15:41
 */
@FeignClient(value = "provider")
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    Collection<Student> findAll();

    @GetMapping("/student/index")
    String index();
}
