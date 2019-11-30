package com.example.demo;

import com.example.demo.domain.LanguageMongo;
import com.example.demo.domain.LanguageMySQL;
import com.example.demo.repo.LanguageMongoRepo;
import com.example.demo.repo.LanguageMySQLRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ServletComponentScan // говорим спринг бут ищи сервлети - бини !!!
@EnableScheduling
//@EnableJms // аннотация что позволяет использовать JMS !!!
@EnableAsync
public class DoubleDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoubleDbApplication.class, args);
    }

    @Bean
    public CommandLineRunner preload(LanguageMySQLRepo mySQLRepo, LanguageMongoRepo mongoRepo){
        return args -> {
            mySQLRepo.save(new LanguageMySQL("Java","Gosling","imperative"));
            mySQLRepo.save(new LanguageMySQL("elixir","Valim","actor model"));
            mySQLRepo.save(new LanguageMySQL("scala","oderski","funktional"));
            mySQLRepo.save(new LanguageMySQL("clojure","hitch","lisp"));

            mongoRepo.save(new LanguageMongo("Java","Gosling","imperative"));
            mongoRepo.save(new LanguageMongo("elixir","Valim","actor model"));
            mongoRepo.save(new LanguageMongo("scala","oderski","funktional"));
            mongoRepo.save(new LanguageMongo("clojure","hitch","lisp"));
        };
    }

}
