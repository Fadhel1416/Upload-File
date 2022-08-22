package com.example.demo;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.CommandLineRunner;

import com.example.service.*;

@SpringBootApplication(scanBasePackages={
		"com.example.demo", "com.example.controller","com.example.exception","com.example.message","com.example.model","com.example.service"})
public class UploadFileApplication implements CommandLineRunner {
	
	  @Resource
	  FilesStorageService storageService;
	public static void main(String[] args) {
		SpringApplication.run(UploadFileApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		  storageService.deleteAll();
		   storageService.init();
	}
	
	
}
