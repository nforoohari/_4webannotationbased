package ir.digixo.controller;

import ir.digixo.entity.Product;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/5")
public class C05ModelAttribute {
    //http://localhost:8080/4/m1/12/iphone

    @GetMapping("/m1/{id}/{name}")
    ModelAndView m1(@ModelAttribute Product p)
    {

        // request.setAttribute("name","leila");

       /* String id = request.getParameter("id");
        String name = request.getParameter("name");

        Product p=new Product(Long.parseLong(id),name);*/

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("p",p);
        return modelAndView;
    }




}
