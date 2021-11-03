package com.example.springbootajaxproje.Models;

import javax.validation.constraints.NotBlank;

public class KullaniciForm {
    @NotBlank(message = "ad bos gecilemez")
    String ad;

    @NotBlank(message = "soyad bos gecilemez")
    String soyad;


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
