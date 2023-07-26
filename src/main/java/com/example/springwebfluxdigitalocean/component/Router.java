package com.example.springwebfluxdigitalocean.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.*;
@Configuration
public class Router {
    @Autowired
    Handler handler;
    @Bean
    public RouterFunction<ServerResponse> handleRouter() {
        return RouterFunctions.route().GET("/helloapi",handler::handleResponse).build();
    }
}
