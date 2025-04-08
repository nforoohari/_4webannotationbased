package ir.digixo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/")
public class C02SendDataFromControllerToUi {

    @RequestMapping(value = "/m0", method = RequestMethod.GET)
    String m0(HttpServletRequest request) {
        request.setAttribute("name", "bita");
        return "home2";
    }

    @GetMapping("/m1")
    ModelAndView m1(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "borna");
        modelAndView.setViewName("home2");
        return modelAndView;
    }

    @GetMapping("/m2")
    String m2(HttpServletRequest request, Model model) {
        model.addAttribute("name", "bardia");
        return "home2";
    }

    @GetMapping("/m3")
    String m3(HttpServletRequest request, ModelMap model) {
        model.addAttribute("name", "nima");
        return "home2";
    }
}