package ir.digixo.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/8")
public class C08Headers {

    //http://localhost:8080/7/matrix/leila;x=122222222
    @GetMapping("/m1")
    String m1(@RequestHeader("User-Agent") String name1)
    {

        System.out.println(name1);
        return "home";
    }
    @GetMapping("/m2")
    String m2(@RequestHeader String accept)
    {

        System.out.println(accept);
        return "home";
    }

    @GetMapping("/m3")
    String m3(@RequestHeader HttpHeaders headers, Model model)
    {

        model.addAttribute("p", headers);
        return "home";
    }




}
