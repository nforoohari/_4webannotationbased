package ir.digixo.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//servlet  ===> servlet  ===
//@Component
@Controller
@RequestMapping("/home")
public class MyController {

    @RequestMapping(value = "/service1",method = RequestMethod.GET)
    String  m()
    {

        //logic  ===> service()
        return "home";
    }

    void m2(HttpServletRequest request, HttpServletResponse response)
    {
        String s="dfdfdf";
        request.setAttribute("myname",s);//obj
        request.getParameter("name");//text http://localhost:8080/2?name=leila
        request.getAttribute("products");


    }

}
