package org.eternity.config;

import org.eternity.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig
{
    @Bean(name = {"desktop", "desk"} )
    @Scope("prototype")
    public Desktop desk()
    {
        return new Desktop();
    }
}
