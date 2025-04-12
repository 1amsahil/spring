package org.eternity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("Above Object Created By ApplicationContext \n");

        Programmer obj1 = (Programmer) context.getBean("programmer");
        System.out.println("Age : "+obj1.getAge());

        Programmer obj2 = (Programmer) context.getBean("programmer");
        obj2.code();

        Computer com = context.getBean(Computer.class);
    }
}

