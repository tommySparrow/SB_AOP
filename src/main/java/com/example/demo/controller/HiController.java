package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2018/7/10
 * @ Description：
 * @ throws
 */

@RestController
@RequestMapping
@ResponseBody
public class HiController {

    @RequestMapping("/sayHi")
    public String sayHi() {
        return "ok";
    }
}
