package com.example.uygulama1;

import java.util.Scanner;

public class Ornek6 {
    public static void main(String[] args) {

        Scanner oku= new Scanner(System.in);
        double r,cevre,alan;
        final double PI=3.14;

        System.out.println("Yarıçapı Girin:");
        r=oku.nextDouble();

        cevre=2*PI*r;
        alan=PI*r*r;

        System.out.println("Alanı:"+alan);
        System.out.println("Çevre:"+cevre);


    }
}
