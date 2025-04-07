package ir.digixo.controller;

import ir.digixo.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class C06HtmlForm {
    //http://localhost:8080/4/m1/12/iphone
    @GetMapping("product")
    String  m()
    {
        return "product";
    }
    @GetMapping("createProduct")
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
