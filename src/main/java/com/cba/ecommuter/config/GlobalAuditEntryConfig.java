package com.cba.ecommuter.config;

import com.cba.ecommuter.util.CustomAuditAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

@Configuration
public class GlobalAuditEntryConfig {

    @Bean
    public AuditorAware<String> auditorAware(){
        return new CustomAuditAware();
    }
}
