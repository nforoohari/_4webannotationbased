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

    //http://localhost:8080/7/matrix/leila;x=122222222
    @GetMapping("/m1")
    String m1(@CookieValue("JSESSIONID") String name1)
    {

        System.out.println(name1);
        return "home";
    }
    @GetMapping("/m2")
    String m2(HttpServletResponse httpServletResponse)
    {

        httpServletResponse.addCookie(new Cookie("my","sdfsdf"));
        return "home";
    }





}
