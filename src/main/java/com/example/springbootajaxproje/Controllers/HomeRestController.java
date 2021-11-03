package com.example.springbootajaxproje.Controllers;


import com.example.springbootajaxproje.AjaxResponseBody;
import com.example.springbootajaxproje.Kullanici;
import com.example.springbootajaxproje.Models.KullaniciForm;
import com.example.springbootajaxproje.Services.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

//Ajax istediğinden gelecek Rest isteğini yönetebileceğimiz Controllerimiz
@RestController
public class HomeRestController {
    private KullaniciService kullaniciService;

    @Autowired
    public void setKullaniciService(KullaniciService kullaniciService) {
        this.kullaniciService = kullaniciService;
    }

    @PostMapping("/kullanici")
    public ResponseEntity<?> getSearchResultViaAjax(@Valid @RequestBody KullaniciForm kullaniciForm, Errors hata) {

        AjaxResponseBody result = new AjaxResponseBody();

        List<Kullanici> kullaniciList = kullaniciService.veriAl(kullaniciForm);
        if (kullaniciList.isEmpty()) {
            result.setMesaj("sorun olustu");
        } else {
            result.setMesaj("basarili");
        }

        result.setSonuc(kullaniciList);
        return ResponseEntity.ok(result);

    }
}
