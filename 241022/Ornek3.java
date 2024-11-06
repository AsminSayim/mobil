package com.example.uygulama1;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        //1'den 100 kadar sayıların toplamını bulan prog
        int sayi = 100,toplam=0;

        for(int i = 1; i <= sayi; ++i)
        {
            toplam += i;
        }

        System.out.println(" Sayıların toplamı = " + toplam);
    }
}





