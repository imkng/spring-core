package org.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("/ref.xml");
        A a = (A)context.getBean("a");
        System.out.println(a);
    }

}
