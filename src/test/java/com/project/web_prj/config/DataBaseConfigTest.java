package com.project.web_prj.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class DataBaseConfigTest {

    @Autowired
    DataBaseConfig config;
    @Test
    void propTest(){
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(DataBaseConfig.class);

        Object bean = context.getBean(config.getUsername());
        Object bean1 = context.getBean(config.getPassword());
        System.out.println(bean);

    }

}