package com.example.springbootajaxproje.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/index1")
    public String Index() {
        //Bilerek hata oluşturuyoruz 500 hata sayfasına düşmesi için
        int i=1/0;
        return "index";
    }
}
