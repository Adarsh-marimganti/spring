package org.adarsh.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Employee e = context.getBean("emp", Employee.class);
    	System.out.println(e);
    }
}
