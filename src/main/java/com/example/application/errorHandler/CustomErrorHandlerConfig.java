package com.example.application.errorHandler;

import com.example.application.config.CustomErrorHandler;
import com.vaadin.flow.server.VaadinServiceInitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class CustomErrorHandlerConfig {

    @Bean
    public VaadinServiceInitListener vaadinServiceInitListener() {
        return event -> event.getSource().addSessionInitListener(
                e -> e.getSession().setErrorHandler(new CustomErrorHandler())
        );
    }
}