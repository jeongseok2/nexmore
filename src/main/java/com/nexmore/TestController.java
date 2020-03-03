package com.nexmore;


import com.nexmore.service.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TestController {


    @Autowired
    SchedulerService schedulerService;

    @ResponseBody
    @RequestMapping(value = "/test1234")
    public String test() {

        System.out.println("controller in!!");

//        schedulerService.selectPrkHistData();


        return "test";
    }
}
