package com.example.demo.controller;

import com.example.demo.domain.LanguageMongo;
import com.example.demo.domain.LanguageMySQL;
import com.example.demo.repo.LanguageMongoRepo;
import com.example.demo.repo.LanguageMySQLRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.emailService.EmailService;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_XML_VALUE)
public class HomeController {

    private LanguageMongoRepo mongoRepo;
    private LanguageMySQLRepo mySQLRepo;
//    private EmailService emailService;

    @Autowired
    public HomeController(LanguageMongoRepo mongoRepo, LanguageMySQLRepo mySQLRepo) {// , EmailService emailService
        this.mongoRepo = mongoRepo;
        this.mySQLRepo = mySQLRepo;
        //this.emailService = emailService;
    }

    @GetMapping(value = "/nosql",produces = "application/json")
    public Iterable<LanguageMongo> getAllLenguagesByMongo() {
        return mongoRepo.findAll();
    }

    @GetMapping(value = {"/", "/sql"})// будет откликатся на 2 урла !!!!
    public Iterable<LanguageMySQL> getAllLenguagesByMySQL() {
        System.out.println(mySQLRepo.moiObject());
        return mySQLRepo.findAll();
    }

    @GetMapping("/email/{subject}")
    public String sendEmail(@PathVariable("subject") String subject) {
//        emailService.sendSimpleMessage(subject,"test from boot");
        return "send";
    }


}
