package net.meloli.gateway;

import net.meloli.gateway.config.SpringHolder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableCircuitBreaker
@SpringCloudApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringHolder.applicationContext = SpringApplication.run(GatewayApplication.class, args);
    }
}
