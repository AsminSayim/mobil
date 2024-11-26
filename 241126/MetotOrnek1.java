package com.example.uygulama1;

public class MetotOrnek1 {
    public static void main(String[] args) {

        selamla2("Asmin");
        String adSoyad=adSoyadBirlestir("Asmin","Sayim");
        selamla2(adSoyad);
    }

    public static void selamla(){
        System.out.println("Merhaba 11A");
    }

    public static void selamla2(String ad){
        System.out.println("Selam "+ad);
    }

    public static String adSoyadBirlestir(String ad, String soyad){
        String adSoyad = ad + " " + soyad;
        return adSoyad;
    }
}
