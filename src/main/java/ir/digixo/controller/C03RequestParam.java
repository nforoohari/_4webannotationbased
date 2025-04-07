package ir.digixo.controller;

import ir.digixo.entity.Product;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/3")
public class C03RequestParam {
    //http://localhost:8080/3/m1?id=12&name=iphone
    @GetMapping("/m1")
    ModelAndView m1(HttpServletRequest request)
    {

        // request.setAttribute("name","leila");

        String id = request.getParameter("id");
        String name = request.getParameter("name");

        Product p=new Product(Long.parseLong(id),name);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("p",p);
        return modelAndView;
    }
    @GetMapping("/m2")
    ModelAndView m2(@RequestParam(value = "id") Long id,@RequestParam(value = "name",required = false,defaultValue = "sib") String name)
    {

        // request.setAttribute("name","leila");

       /* String id = request.getParameter("id");
        String name = request.getParameter("name");*/

        Product p=new Product(id,name);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("p",p);
        return modelAndView;
    }


}
