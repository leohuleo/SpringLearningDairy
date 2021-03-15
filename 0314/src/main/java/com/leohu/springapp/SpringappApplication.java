package com.leohu.springapp;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//This adds:
//@Configuration: tags the class as a source of bean definitions for the application context
//@EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings,
//other beans, and various property settings
//@ComponentScan: Tells Spring to look for other components, configurations and services in the com.example package,
//letting it find other controllers
public class SpringappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringappApplication.class, args);
        //Used to launch the application
    }

    @Bean
    //Runs on startup and retrieve all beans created by the application
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args ->{
            System.out.println("Let's inspect the beans provided by Spring Boot:");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for(String beanName: beanNames){
                System.out.println(beanName);
            }
        };
    }

}
