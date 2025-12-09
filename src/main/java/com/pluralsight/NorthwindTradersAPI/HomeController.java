package com.pluralsight.NorthwindTradersAPI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String homepage(@RequestParam(required = false) String name) {
        if (name != null && !name.isEmpty()) {
            return "Hello " + name;
        }
        return "Hello World";
    }
}

