package hello.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
    @GetMapping("/hello")
    public String getHello(
            @RequestParam(name = "name") String name,
            Model model
    ) {
        model.addAttribute("name", name);
        return "hello";
    }
}
