package com.example.demo.emailService;

import com.example.demo.filter.LogginFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class AppConfig {

//    @Bean
//    public JavaMailSender getJavaMailSender() {
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//        mailSender.setHost("smtp.gmail.com");
//        mailSender.setPort(587);
//
//        mailSender.setUsername("malozhonvlad@gmail.com");
//        mailSender.setPassword("Dkflbrbtd123");
//
//        Properties props = mailSender.getJavaMailProperties();
//        props.put("mail.transport.protocol", "smtp");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.debug", "true");
//
//        return mailSender;
//    }

    @Bean
    public FilterRegistrationBean<LogginFilter> filterRegistrationBean(){
        FilterRegistrationBean<LogginFilter> filterFilterRegistrationBean = new FilterRegistrationBean();

        filterFilterRegistrationBean.setFilter(new LogginFilter());
        filterFilterRegistrationBean.addUrlPatterns("/index");
        return filterFilterRegistrationBean;
    }

}
