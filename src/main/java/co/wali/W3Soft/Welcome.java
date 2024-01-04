package co.wali.W3Soft;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping
    private String welcomeFn(){
        return "Welcome to Spring Boot By W3Soft";
    }
}
