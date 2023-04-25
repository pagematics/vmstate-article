package content;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
@AutoConfiguration
@SpringBootApplication
@ComponentScan("content")
public class ContentVerification extends SpringBootServletInitializer
{
	 public static void main(String[] args) 
	 {
        SpringApplication.run(ContentVerification.class, args);
    }
}

