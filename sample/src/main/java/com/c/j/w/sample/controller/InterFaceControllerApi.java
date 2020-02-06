package com.c.j.w.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName InterFaceController
 * @Description TODO
 * @Author 梁臣
 * @Date 2020/2/6 13:21
 * @Version 1.0
 **/
@RequestMapping("/interface")
public interface InterFaceControllerApi {

    @RequestMapping("/testApi")
    String testControllerApi();

}
