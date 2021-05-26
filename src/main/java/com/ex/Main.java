package com.ex;

import com.to.SomeBO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
        SomeBO bo = ap.getBean("proxy", SomeBO.class);
        bo.Validate();

        try {
            bo.Validate(17);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
