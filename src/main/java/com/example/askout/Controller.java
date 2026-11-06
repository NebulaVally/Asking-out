package com.example.askout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AskOutController {

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/yes")
    public String yesPage() {
        return "celebrate";
    }

    @GetMapping("/no")
    public String noPage() {
        return "no";
    }

    @GetMapping("/final-no")
    public String finalNoPage() {
        return "final-no"; // Serves src/main/resources/templates/final-no.html
    }
}