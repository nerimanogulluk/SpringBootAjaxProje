package com.example.springbootajaxproje;

import java.util.List;

public class AjaxResponseBody {
    String mesaj;
    List<Kullanici> sonuc;

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public List<Kullanici> getSonuc() {
        return sonuc;
    }

    public void setSonuc(List<Kullanici> sonuc) {
        this.sonuc = sonuc;
    }
}
