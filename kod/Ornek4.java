package com.example.uygulama1;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        int kisakenar,uzunkenar,alan,cevre;
        Scanner oku = new Scanner(System.in);

        System.out.print("Kısa kenarı gir: ");
        kisakenar = oku.nextInt();

        System.out.print("Uzun kenarı gir: ");
        uzunkenar = oku.nextInt();

        alan=kisakenar*uzunkenar;
        System.out.println("Alanı:"+alan);

        cevre=(kisakenar+uzunkenar)*2;
        System.out.println("Çevre:"+cevre);



    }

}
