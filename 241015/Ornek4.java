package com.example.uygulama1;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Ortalamanızı Girin:");

        double ortalama=oku.nextDouble();

        if (ortalama<50){
            System.out.println("1 ile Kaldın");
        }
        else if (ortalama>=50 && ortalama<60) {
            System.out.println("2 ile Geçti");
        }
        else if (ortalama>=60&& ortalama<70) {
            System.out.println("3 ile Geçti");
        }
        else if (ortalama>=70 && ortalama<85) {
            System.out.println("4 ile Geçti");
        }else {
            System.out.println("5 ile Geçti");
        }
    }
}




