package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan
//@SpringBootApplication
//@Controller
@EnableWebMvc
@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {

//	@RequestMapping("/")
////	@ResponseBody
//	String home(Model model) {
//		return "hello";
//	}
//
//	@Autowired
//	private ErrorAttributes errorAttributes;
//
//	@Bean
//	public AppErrorController appErrorController(){return new AppErrorController(errorAttributes);}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
