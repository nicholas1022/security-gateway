package com.demo.gateway.config;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudGatewayRouting {

    @Bean
    public RouteLocator configureRoute(RouteLocatorBuilder builder) {
        return builder.routes()
            .route(r -> r.path("/auth/**")
                .uri("http://localhost:8081/"))

            .route(r -> r.path("/ope/**")
                .uri("http://localhost:8082/"))
            .build();
    }
}
