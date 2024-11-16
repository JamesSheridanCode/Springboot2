package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String index() {

        return "Greetings from Spring Boot!";
    }
    @GetMapping("/search")
    public String search() {

        return "Greetings from Search Page!";
    }
    @GetMapping("/create")
    public String create() {

        return "CREATE PETITION Page!";
    }
    //test again
    @GetMapping("/viewall")
    public String viewall() {

        return "View All Petitions Page!";
    }
    //for testing
    @GetMapping("/viewpetition")
    public String viewpetionl() {

        return "View  Petitions Page!";
    }

}
