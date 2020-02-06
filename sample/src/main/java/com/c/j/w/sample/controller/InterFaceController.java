package com.c.j.w.sample.controller;

import com.c.j.w.xcheck.support.annotation.Check;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName InterFaceController
 * @Description TODO
 * @Author 梁臣
 * @Date 2020/2/6 13:24
 * @Version 1.0
 **/
@RestController
public class InterFaceController implements InterFaceControllerApi {

    @Check("[a,b]")
    @Override
    public String testControllerApi() {
        return "pass test!";
    }
}
