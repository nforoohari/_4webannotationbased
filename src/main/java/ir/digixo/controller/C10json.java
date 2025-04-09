package ir.digixo.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ir.digixo.entity.Product;

@Controller
@RestController
@RequestMapping("/10")
public class C10json {

    @GetMapping("/m1")
    @ResponseBody
    public String m1() {
        return "Simple Hello Http Body";
    }

    @GetMapping("/m2")
    @ResponseBody
    public HttpEntity<String> m2(HttpEntity<String> req) {
        System.out.println("Request Header : " + req.getHeaders());
        System.out.println("Request Body   : " + req.getBody());
        HttpEntity<String> res = new HttpEntity<>("HttpEntity<String> Hello Http Body");
        return res;
    }

//    @PostMapping(value = "/m3", consumes = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "/m3",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HttpEntity<String> m3(@RequestBody String body) {
        System.out.println("body : " + body);
        return new HttpEntity<>(body);
    }

//    @PostMapping(value = "/m4", consumes = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "/m4",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HttpEntity<Product> m4(@RequestBody Product product) {

        System.out.println("product : " + product);
        product.setName("new name");
        return new HttpEntity<>(product);
    }

//    @PostMapping(value = "/m5", consumes = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "/m5", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Product> m5(@RequestBody Product product) {
        product.setName("new ok name");
        return ResponseEntity.ok(product);
    }

}