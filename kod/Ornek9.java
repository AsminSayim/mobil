package com.example.uygulama1;

import java.util.Scanner;

public class Ornek9 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        double a,b,c;

        System.out.print("(a) Gir:");
        a=oku.nextDouble();

        System.out.print("(b) Gir:");
        b=oku.nextDouble();

        c=Math.sqrt(a*a+b*b);
        System.out.println("Hiptenüs:"+c);


    }
}
