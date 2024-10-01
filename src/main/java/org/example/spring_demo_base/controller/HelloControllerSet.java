package org.example.spring_demo_base.controller;


import org.example.spring_demo_base.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControllerSet {
    // Injection de dépendances
    private final GreetingsService greetingsService;


   // @Autowired
   // public HelloControllerSet(@Qualifier("salutations") GreetingsService greetingsService){
    public HelloControllerSet(GreetingsService greetingsService){
        this.greetingsService = greetingsService;
    }

    @RequestMapping("/hello-set")
    public String sayHello(){
        System.out.println(greetingsService.sayHello());
        return "hello";
    }
}
