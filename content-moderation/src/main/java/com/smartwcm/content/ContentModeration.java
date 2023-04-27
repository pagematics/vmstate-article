package com.smartwcm.content;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
@AutoConfiguration
@SpringBootApplication
@ComponentScan("com.smartwcm.content")
public class ContentModeration extends SpringBootServletInitializer
{
	 public static void main(String[] args) 
	 {
        SpringApplication.run(ContentModeration.class, args);
    }
}

