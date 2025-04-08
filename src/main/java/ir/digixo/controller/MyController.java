package ir.digixo.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class MyController {

    @RequestMapping(value = "/service1", method = RequestMethod.GET)
    String m() {
        return "home";
    }

    @RequestMapping(value = "/service2", method = RequestMethod.GET)
    void m2(HttpServletRequest request, HttpServletResponse response) {
        String my_name = "nima";
        request.setAttribute("my_name", my_name);//object
        System.out.println("getAttribute my_name: " + request.getAttribute("my_name"));
        System.out.println("getParameter name: " + request.getParameter("name"));//text http://localhost:8080/home/service2?name=leila
    }

}