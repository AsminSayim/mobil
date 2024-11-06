package com.example.uygulama1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("Sayı Girin:");
        int sayi= oku.nextInt();

        if(sayi%2==0){
            System.out.print("Sayı Çift");
        }
        else{
            System.out.print("Sayı Tek");
        }
    }




}
