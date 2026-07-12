package com.cognizant.spring_learn_country;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/country")
    public Country getContry(){
        return new Country("IN","India");
    }

    @GetMapping("/country/{code}")
    public Country getContryByCode(@PathVariable String code){
        return new Country("IN","India");
    }
}
