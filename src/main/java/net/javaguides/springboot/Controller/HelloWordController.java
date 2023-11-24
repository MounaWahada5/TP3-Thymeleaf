package net.javaguides.springboot.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
class HelloWorldController {
    @GetMapping("/hello")
    public String hello(Model model) { model.addAttribute("message", "Hello World!");
        return "hello-world";
    }
}