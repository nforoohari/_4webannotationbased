package ir.digixo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ir.digixo.entity.Product;

@Controller
@RequestMapping("/")
public class C06HtmlForm {

    //http://localhost:8080/product
    @GetMapping("/product")
    String m() {
        return "product";
    }

    @GetMapping("/createProduct")
//    @PostMapping("/createProduct")
    ModelAndView m1(@ModelAttribute Product p) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home3");
        modelAndView.addObject("my_product", p);
        return modelAndView;
    }

}
