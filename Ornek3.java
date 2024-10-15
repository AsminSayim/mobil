package com.example.uygulama1;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.println("Sıcaklık değerini girin:");

        double sicaklik=oku.nextDouble();

        if (sicaklik<5){
            System.out.println("Çok soğuk");
        } else if (sicaklik<20) {
            System.out.println("Soğuk");
        } else if (sicaklik>=20&& sicaklik<27) {
            System.out.println("Normal");
        } else if (sicaklik>=25&& sicaklik<30) {
            System.out.println("Sıcak");
        }else {
            System.out.println("Çok sıcak");
        }


    }
}
