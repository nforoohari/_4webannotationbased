package ir.digixo.controller;

import ir.digixo.entity.Product;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/4")
public class C04PathParam {
    //http://localhost:8080/4/m1/12/iphone

    @GetMapping("/m1/{id}/{name}")
    ModelAndView m2(@PathVariable(value = "id") Long id, @PathVariable(value = "name",required = false) String name)
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
    //localhost:8080/4/m3?id=12
    @GetMapping(value = "/m3",params = "name")
    ModelAndView m3(@RequestParam(value = "id") Long id/*, @PathVariable(value = "name",required = false) String name*/)
    {

        // request.setAttribute("name","leila");

       /* String id = request.getParameter("id");
        String name = request.getParameter("name");*/

        Product p=new Product(id,"name");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("p",p);
        return modelAndView;
    }




}
