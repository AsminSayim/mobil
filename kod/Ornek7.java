package com.example.uygulama1;

import java.util.Scanner;

public class Ornek7 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("Mevcut Maaşı Gir:");
        double mevcutMaas=oku.nextDouble();

        double zamOrani=0.43;
        double yeniMaas=mevcutMaas+(mevcutMaas*zamOrani);

        System.out.println("Yeni Maaş:"+yeniMaas);

    }
}
