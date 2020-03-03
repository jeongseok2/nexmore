package com.nexmore.service;

import lombok.CustomLog;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//@Component("schedulerMapper")
@Mapper
//@MapperScan(basePackages = "com.nexmore.SchedulerMapper")
public interface SchedulerMapper {

    String selectPrkHistData() throws Exception;
}
