package ir.digixo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ir.digixo.entity.Product;

@Controller
@RequestMapping("/3")
public class C03RequestParam {

    //http://localhost:8080/3/m1?id=12&name=iphone
    @GetMapping("/m1")
    ModelAndView m1(HttpServletRequest request) {

        String id = request.getParameter("id");
        String name = request.getParameter("name");

        Product myProduct = new Product(Long.parseLong(id), name);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home3");
        modelAndView.addObject("my_product", myProduct);
        return modelAndView;
    }

    //http://localhost:8080/3/m2?id=3&name=samsung
    @GetMapping("/m2")
    ModelAndView m2(@RequestParam(value = "id") Long id, @RequestParam(value = "name", required = false, defaultValue = "nothing") String name) {

        Product myProduct = new Product(id, name);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home3");
        modelAndView.addObject("my_product", myProduct);
        return modelAndView;
    }

}
