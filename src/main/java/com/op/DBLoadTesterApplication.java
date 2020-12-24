package com.op;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
public class DBLoadTesterApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(DBLoadTesterApplication.class, args);
    }

    /*@Configuration
    @EnableSwagger2
    public class SwaggerConfiguration{
        @Bean
        public Docket documentation(){
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                    .paths(PathSelectors.any())
                    .build();
        }
    }*/

}