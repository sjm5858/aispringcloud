package com.sjm.contorller;

import com.sjm.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author sjm5858
 * @date 2021/4/28 14:58
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return restTemplate.getForObject("http://provider/student/findAll", Collection.class);
    }

    @GetMapping("/index")
    public String index() {
        return restTemplate.getForObject("http://provider/student/index", String.class);
    }
}
