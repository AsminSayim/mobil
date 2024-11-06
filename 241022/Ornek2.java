package com.example.uygulama1;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        int toplam = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayıyı girin: ");
            int sayi = oku.nextInt();
           toplam+= oku.nextInt();
        }
        System.out.println("Girdiğin sayı toplamı:"+toplam);

    }
}
