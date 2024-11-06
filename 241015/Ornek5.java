package com.example.uygulama1;

import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
         float s1,s2,secim,sonuc=0;
        System.out.print("1. Sayı Girin: ");
        s1=oku.nextFloat();
        System.out.print("2. Sayı Girin:");
        s2=oku.nextFloat();

        System.out.println("(1) Toplam:");
        System.out.println("(2) Fark:");
        System.out.println("(3) Çarpım:");
        System.out.println("(4) Bölüm:");

        System.out.print("Seçim yap: ");
        secim= oku.nextFloat();

        if(secim==1){
            sonuc=s1+s2;
        }
        else if (secim==2) {
            sonuc=s1-s2;
        }
        else if (secim==3) {
            sonuc=s1*s2;
        }
        else{
            sonuc=s1/s2;
        }

        System.out.println("Sonuç"+sonuc);

    }
}
