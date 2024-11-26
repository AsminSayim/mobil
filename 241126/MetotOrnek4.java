package com.example.uygulama1;

public class MetotOrnek4 {
    public static void main(String[] args) {
    //paremetre olarak alınan iki sayı arasındaki farkı ekrana yazdıran program.
    //not sayıların farkı her zaman pozitif olsun.
    //farkHesapla(s1,s2);

        System.out.println("Sayıların Farkı"+farkHesapla(6,0));


    }

    public static int farkHesapla(int s1, int s2) {

        if (s1 > s2) {
            return  s1 - s2;
        }
        else {
            return s2 - s1;
        }

    }

}
