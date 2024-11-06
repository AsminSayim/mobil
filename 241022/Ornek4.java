package com.example.uygulama1;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {

        //1kullanıcının sayıya kadar toplayan
        Scanner oku = new Scanner(System.in);
        int ilk, son, toplam = 0;

        System.out.print("Başlangıç Sayısını Gir: ");
        ilk = oku.nextInt();
        System.out.print("Bitiş Sayısını Gir: ");
        son = oku.nextInt();
        int sayilar = 0;
        for (int i = ilk; i < son; i++){
            sayilar = i+i;
            toplam += i;
        }
        System.out.println("Arasındaki sayıların toplamı : " + toplam);
    }
}
