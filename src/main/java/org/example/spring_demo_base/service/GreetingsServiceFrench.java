package org.example.spring_demo_base.service;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("salutations")
@Profile("FR")
public class GreetingsServiceFrench implements GreetingsService{
    @Override
    public String sayHello() {
        return "Bonjour le monde !!!";
    }
}
