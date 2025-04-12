package org.eternity;

import org.eternity.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop desk1 = context.getBean("desktop",Desktop.class);
        desk1.compile();

        Desktop desk2 = context.getBean("desktop",Desktop.class);
        desk2.compile();

        Programmer obj = context.getBean("programmer",Programmer.class);
        System.out.println(obj.getAge());
        obj.code();

    }
}
