package com.taskforge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // disable CSRF for development
                .authorizeHttpRequests()
                .anyRequest().permitAll() // allow all requests without authentication
                .and()
                .formLogin().disable() // disable form login
                .httpBasic().disable(); // disable basic auth

        return http.build();
    }
}
