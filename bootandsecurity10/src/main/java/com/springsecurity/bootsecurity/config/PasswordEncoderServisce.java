package com.springsecurity.bootsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoderServisce {
    @Bean
        public BCryptPasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }
}
