package com.gomes.bootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gomeswang
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
