package com.example.uygulama1;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        double ortalama,devamsizlik;
        System.out.println("Ortalamayı girin:");
        ortalama=oku.nextDouble();

        System.out.println("Devamsızlıgı girin:");
        devamsizlik=oku.nextDouble();

        if(devamsizlik>10){
            System.out.println("Devamsızlıktan Kaldın");
        }
        else if (ortalama>=50) {
            System.out.println("Geçtin");
        }
        else{
            System.out.println("Kaldın");
        }


    }
}
