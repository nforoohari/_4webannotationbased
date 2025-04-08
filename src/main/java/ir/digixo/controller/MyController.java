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
    String m1() {
        return "home";
    }

    @RequestMapping(value = "/service2", method = RequestMethod.GET)
    String m2(HttpServletRequest request, HttpServletResponse response) {
        String myName = "nima";
        request.setAttribute("my_name", myName);//object
        System.out.println("getParameter name: " + request.getParameter("name"));//text http://localhost:8080/home/service2?name=leila
        return "home1";
    }

}