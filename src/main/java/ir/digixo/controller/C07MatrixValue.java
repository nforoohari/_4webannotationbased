package ir.digixo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/7")
public class C07MatrixValue {

    //http://localhost:8080/7/matrix/nima;cc=417
    @GetMapping("/matrix/{name}")
    ModelAndView m1(@PathVariable(value = "name") String name, @MatrixVariable(pathVar = "name", value = "cc") int cc) {

        System.out.println("Company Code: " + cc);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home2");
        modelAndView.addObject("name", name);
        return modelAndView;
    }

}