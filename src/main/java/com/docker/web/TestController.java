package com.docker.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李文
 * @create 2016-11-25 14:34
 **/
@RestController
public class TestController
{

    @GetMapping("/t")
    public String getTest()
    {
        return "hehe";
    }

}
