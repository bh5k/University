package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="unversity")
    public University getUni() {
        University university = new University("Harvard");
        return university;
    }

    @Bean(name="ana")
    public Student getAna() {
        Student ana = new Student();
        ana.setName("Ana");
        ana.setId(1001);
        ana.setUniversity(getUni());
        return ana;
    }

    @Bean(name="lewis")
    public Student getLewis() {
        Student lewis = new Student();
        lewis.setName("Lewis");
        lewis.setId(1002);
        return lewis;
    }

    @Bean(name="diandra")
    public Student getDiandra() {
        Student diandra = new Student("Diandra", 1003);
        return diandra;
    }
}
