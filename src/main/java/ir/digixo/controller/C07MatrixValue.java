package ir.digixo.controller;

import ir.digixo.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/7")
public class C07MatrixValue {

    //http://localhost:8080/7/matrix/leila;x=122222222
    @GetMapping("/matrix/{name}")
    String m1(@PathVariable(name = "name") String name, @MatrixVariable(name = "x",pathVar = "name") int x)
    {

        System.out.println(x);
        return "home";
    }




}
