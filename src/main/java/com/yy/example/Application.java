package com.yy.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import static org.springframework.boot.SpringApplication.run;

import org.springframework.boot.SpringApplication;

/**
 * Created by yangyibo on 17/1/17.
 */

@ComponentScan(basePackages ="com.yy.example")
@SpringBootApplication
public class Application extends SpringBootServletInitializer{
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
    public static void main(String[] args) {
    	SpringApplication.run(Application.class, args);
    }

}
