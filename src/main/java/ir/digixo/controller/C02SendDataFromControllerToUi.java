package ir.digixo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class C02SendDataFromControllerToUi {
    //@RequestMapping(value = "/service1",method = RequestMethod.GET)
    @GetMapping("/m1")
    ModelAndView m(HttpServletRequest request)
    {

       // request.setAttribute("name","leila");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("name","leila");
        return modelAndView;
    }
    @GetMapping("/m2")
    String m2(HttpServletRequest request,Model model)
    {

        // request.setAttribute("name","leila");

       // ModelAndView modelAndView = new ModelAndView();
        //modelAndView.setViewName("home");
        //modelAndView.addObject("name","leila");
        model.addAttribute("name","leila");
        return "home";
    }
    @GetMapping("/m3")
    String m3(HttpServletRequest request, ModelMap model)
    {

        // request.setAttribute("name","leila");

        // ModelAndView modelAndView = new ModelAndView();
        //modelAndView.setViewName("home");
        //modelAndView.addObject("name","leila");
        model.addAttribute("name","leila");
        return "home";
    }
}
