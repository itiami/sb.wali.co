package co.wali.W3Soft;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Welcome {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "User");
        return "index"; // Name of your Thymeleaf template (without .html)
    }
}
