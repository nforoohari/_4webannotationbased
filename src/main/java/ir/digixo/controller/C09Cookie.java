package ir.digixo.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/9")
public class C09Cookie {

    @GetMapping("/m1")
    String m1(HttpServletResponse httpServletResponse){
        httpServletResponse.addCookie(new Cookie("my_cookie","my_cookie_value"));
        return "home";
    }

    @GetMapping("/m2")
    String m2(@CookieValue("my_cookie") String cookie_value,Model model)//Idea-98957374  JSESSIONID
    {
        model.addAttribute("name",cookie_value);
        return "home2";
    }

    @GetMapping("/m3")
    String m3(@RequestHeader HttpHeaders headers, Model model)
    {
        model.addAttribute("name", headers);
        return "home2";
    }
}
