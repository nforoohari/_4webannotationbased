package ir.digixo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ir.digixo.entity.Product;

@Controller
@RequestMapping("/4")
public class C04PathParam {

    //http://localhost:8080/4/m1/12/iphone
    @GetMapping("/m1/{id}/{name}")
    ModelAndView m1(@PathVariable(value = "id") Long id, @PathVariable(value = "name") String name) {

        Product myProduct = new Product(id, name);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home3");
        modelAndView.addObject("my_product", myProduct);
        return modelAndView;
    }

}
