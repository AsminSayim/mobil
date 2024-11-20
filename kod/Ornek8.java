package com.example.uygulama1;

import java.util.Scanner;

public class Ornek8 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("Mevcut Maaşı Gir:");
        double mevcutMaas=oku.nextDouble();

        System.out.print("Zam Oranı % Gir:");
        double zamOrani=oku.nextDouble()/100;

        double yeniMaas=mevcutMaas+(mevcutMaas*zamOrani);

        System.out.println("Yeni Maaş:"+yeniMaas);
    }


}
