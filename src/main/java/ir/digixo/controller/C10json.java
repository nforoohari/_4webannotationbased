/*
package ir.digixo.controller;

import ir.digixo.entity.Product;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/10")
public class C10json {

    @GetMapping("/m1")
    @ResponseBody
    public String m1()
    {
        return "Hello Http Body";
    }
    @GetMapping("/m2")
    @ResponseBody
    public HttpEntity<String> m2(HttpEntity<String> request)
    {
        System.out.println(request.getBody());
        System.out.println(request.getHeaders());

        HttpEntity<String> httpEntity=new HttpEntity<>("Hello Http Body");
        return httpEntity;
    }
    @GetMapping(value = "/m3",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HttpEntity<String> m3(@RequestBody String body)
    {

        System.out.println(body);//json text convert obj java //jackson gson

        HttpEntity<String> httpEntity=new HttpEntity<>("Hello Http Body");
        return httpEntity;
    }
    @GetMapping(value = "/m4",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HttpEntity<Product> m4(@RequestBody Product product)
    {

        System.out.println(product);

        HttpEntity<Product> httpEntity=new HttpEntity<>(product);
        return httpEntity;
    }
    @GetMapping(value = "/m4",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Product> m5(@RequestBody Product product)
    {
        return ResponseEntity.ok(product);
    }





}
*/
