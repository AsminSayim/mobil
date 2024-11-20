package com.example.uygulama1;

import java.util.Scanner;

public class MetotOrnek1 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        double y1,y2,ortalama;
        System.out.print("1.Yazılı:");
        y1= oku.nextDouble();
        System.out.print("2.Yazılı:");
        y2= oku.nextDouble();
        ortalama=ortalamaniz(y1,y2);
        System.out.println("Ortalamanız:"+ortalama);
    }

    private static double ortalamaniz(double y1, double y2) {
        return (y1+y2)/2;
    }
}
