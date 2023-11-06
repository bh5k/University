package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class UniversityApplication {

	public static void main(String[] args) {

		//SpringApplication.run(UniversityApplication.class, args);

		//ApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Student s1 = context.getBean("ana", Student.class);
		System.out.println(s1.getName());
		System.out.println(s1.getUniversity().getName());

		Student s2 = context.getBean("lewis", Student.class);
		System.out.println(s2.getName());

		Student s3 = context.getBean("diandra", Student.class);
		System.out.println(s3.getName());

	}

}
