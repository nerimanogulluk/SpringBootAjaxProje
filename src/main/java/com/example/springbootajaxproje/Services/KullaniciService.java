package com.example.springbootajaxproje.Services;

import com.example.springbootajaxproje.Kullanici;
import com.example.springbootajaxproje.Models.KullaniciForm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Service katmanı kullanıcıdan gelecek verileri alan katmandır.
//Dönecek cevabı da veriAl metodunda oluşturuyoruz.
@Service
public class KullaniciService {
    private List<Kullanici> kullanici;

    public List<Kullanici> veriAl(KullaniciForm kullaniciForm) {

        Kullanici user = new Kullanici(kullaniciForm.getAd(), kullaniciForm.getSoyad());

        return new ArrayList<Kullanici>(Arrays.asList(user));

    }
}
