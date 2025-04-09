package ir.digixo.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/8")
public class C08Headers {

    @GetMapping("/m1")
    String m1(@RequestHeader("User-Agent") String ua)
    {
        System.out.println("User-Agent : " + ua);
        return "home";
    }

    @GetMapping("/m2")
    String m2(@RequestHeader("Accept") String accept)
    {
        System.out.println("Accept : " + accept);
        return "home";
    }

    @GetMapping("/m3")
    String m3(@RequestHeader HttpHeaders headers, Model model)
    {
        model.addAttribute("name", headers);
        return "home2";
    }

}
