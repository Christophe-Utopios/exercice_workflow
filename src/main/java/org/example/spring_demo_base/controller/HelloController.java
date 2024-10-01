package org.example.spring_demo_base.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String sayHello(){
        System.out.println("je passe dans la methode sayHello !!!");
        return "hello";
    }

    @RequestMapping("/coucou")
    // Conversion automatique de la valeur de retour en format json
    @ResponseBody
    public List<String> getPersons(){
        return List.of("Toto","Tata","Titi");
    }

    @RequestMapping("/home/person")
    public String persoName(Model model){
        model.addAttribute("firstname","Toto");
        model.addAttribute("lastname","Titi");
        List<String> persons = List.of("Toto","Tata","Titi");
        model.addAttribute("persons",persons);
        return "person/details";
    }

}
