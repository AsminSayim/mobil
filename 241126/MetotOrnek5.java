package com.example.uygulama1;

import java.util.Scanner;

public class MetotOrnek5 {
    public static void main(String[] args) {

        //Scanner oku=new Scanner(System.in);
        System.out.println("Elektrik:"+faturaHesapla(150));
        System.out.println("Elektrik Tüketimi:"+faturaHesapla(250));
        System.out.println("Borcunuz ve bir dahaki sefer az kullanın:"+faturaHesapla(350));



    }

    public static double faturaHesapla(double miktar) {
        double ucret=0;
        if(miktar<=200){
            ucret=miktar*2;
        } else if (miktar<=300) {
            ucret=200 * 2 + (miktar - 200)* 2.5;
        }
        else{
            ucret=200 * 2 + 100 * 2.5 + (miktar - 300) * 4;
        }
        return ucret;
    }
}