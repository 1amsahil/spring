package org.eternity.config;

import org.eternity.Computer;
import org.eternity.Desktop;
import org.eternity.Laptop;
import org.eternity.Programmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig
{
    @Bean(name = {"programmer"})
    public Programmer obj(@Autowired Computer com) // @Qualifier("laptop")
    {
        Programmer obj = new Programmer();
        obj.setAge(24);
        obj.setCom(com);
        return obj;
    }

    @Bean(name = {"desktop", "desk"} )
    @Scope("prototype")
    public Desktop desk()
    {
        return new Desktop();
    }

    @Bean(name = {"lap","laptop"})
    @Primary
    public Laptop lap()
    {
        return new Laptop();
    }
}
