package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWorldApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloWorldApplication.class, args);
  }

  @Value("${NAME:World}")
  String name;

  @RestController
  class HelloWorldController {
    @GetMapping("/")
    String hello() {
      return "Hello " + name + " " + System.lineSeparator();
    }
  }

}
