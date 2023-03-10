package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.TodoValidator;

@Configuration
public class TodoConfig {
    /**
     * Tạo ra Bean TodoValidator để sử dụng sau này
     * @return
     */
    @Bean
    public TodoValidator validator() {
        return new TodoValidator();
    }
}
