package com.xiangcm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @ClassName: HelloWordController
 * @Description: controller
 * @Author: DELL
 * @Date: 2021/1/22 23:26
 **/
@Controller
public class HelloWordController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello word!";
    }

}
