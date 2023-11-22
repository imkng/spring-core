package org.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autoConfig.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee);
    }
}
