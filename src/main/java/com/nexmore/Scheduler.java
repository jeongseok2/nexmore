package com.nexmore;


import com.nexmore.service.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


@Component
public class Scheduler {

    @Autowired
    SchedulerService schedulerService;

    @Scheduled(fixedDelay = 10000) // 1초에 한번씩 실행
    public void sendSMS() {
        System.out.println("1초에 한번씩 실행 됩니다.");
        try {
            String sctionId = schedulerService.selectPrkHistData();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }



}
