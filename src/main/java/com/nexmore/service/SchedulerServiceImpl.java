package com.nexmore.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchedulerServiceImpl implements SchedulerService {


    @Autowired
    private static SchedulerMapper schedulerMapper;

    @Override
   public  String selectPrkHistData() {
        try {
            String test = schedulerMapper.selectPrkHistData();
            System.out.println("sctionid = "+ test);
        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("serviceimpl in!!!");

        return "test";
    }
}
