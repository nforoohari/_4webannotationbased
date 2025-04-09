package ir.digixo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ir.digixo.entity.Product;

@Controller
@RequestMapping("/5")
public class C05ModelAttribute {

    //http://localhost:8080/5/m1/12/iphone
    @GetMapping("/m1/{id}/{name}")
    ModelAndView m1(@ModelAttribute Product p) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home3");
        modelAndView.addObject("my_product", p);
        return modelAndView;
    }

    //http://localhost:8080/5/m2?id=3&name=samsung
    @GetMapping("/m2")
    ModelAndView m2(@ModelAttribute Product p) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home3");
        modelAndView.addObject("my_product", p);
        return modelAndView;
    }

}
