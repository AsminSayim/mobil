package com.example.uygulama1;

import java.util.Scanner;

public class MetotOrnek2 {
    public static int faktoriyel(int n) {
        int sonuc = 1;
        for (int i = 1; i <= n; i++) {
            sonuc *= i;
        }
        return sonuc;
    }


    public static int kombinasyon(int n, int k) {
        // C(n, k) = n! / (k! * (n-k)!)
        int faktN = faktoriyel(n);
        int faktK = faktoriyel(k);
        int faktNK = faktoriyel(n - k);

        return faktN / (faktK * faktNK);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n değeri (toplam eleman sayısı) girin: ");
        int n = scanner.nextInt();

        System.out.print("r değeri (seçilecek eleman sayısı) girin: ");
        int k = scanner.nextInt();


        if (n >= k && n >= 0 && k >= 0) {
            int sonuc = kombinasyon(n, k);
            System.out.println("C(" + n + ", " + k + ") = " + sonuc);
        } else {
            System.out.println("Geçersiz giriş! n >= k ve n, k >= 0 olmalıdır.");
        }


    }

}
