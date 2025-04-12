package org.eternity.config;

import org.eternity.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean(name = {"desktop", "desk"})
    public Desktop desk()
    {
        return new Desktop();
    }
}
