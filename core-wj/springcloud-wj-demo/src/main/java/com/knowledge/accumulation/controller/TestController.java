package com.knowledge.accumulation.controller;

import com.knowledge.accumulation.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Api(value = "测试", description = "测试")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ApiOperation(value="测试", notes="测试")
    public void test(){
        testService.test();
    }
}
