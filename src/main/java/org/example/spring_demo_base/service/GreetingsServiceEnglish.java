package org.example.spring_demo_base.service;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("greetings")
@Profile("EN")
//@Primary
public class GreetingsServiceEnglish implements GreetingsService{
    @Override
    public String sayHello() {
        return "Hello, World !!!";
    }
}
