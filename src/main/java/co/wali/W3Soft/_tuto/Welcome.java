package co.wali.W3Soft._tuto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping
    public String welcomeFn() {
        String str = "Welcome to Spring Boot by W3Soft..";
        System.out.println(str);
        return str;
    }

}
