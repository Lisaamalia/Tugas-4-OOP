package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s=new Scanner(System.in); // Menginputkan Data Secara Dinamis

        Balok b=new Balok(); // Membuat Objek b Dari Class Balok
        int p,l,t; // Pendeklarasian Variabel p,l,t dengan tipe data integer Guna Untuk Memanggil Inputan Secara Dinamis
        System.out.println("=====================================");
        System.out.println("               B A L O K             ");
        System.out.println("         C A L C U L A T O R         ");
        System.out.println("      [Lisa Amalia][1900018171]      ");
        System.out.println("_____________________________________");

        //Memanggil Varibel p Secara Dinamis
        System.out.print(" Massukkan Panjang : ");
        p=s.nextInt();

        //Memanggil Varibel l Secara Dinamis
        System.out.print(" Masukkan Lebar    : ");
        l=s.nextInt();

        //Memanggil Varibel t Secara Dinamis
        System.out.print(" Masukkan Tinggi   : ");
        t=s.nextInt();

        System.out.println();
        b.setP(p); // Mengeset Nilai p Berdasarkan Inputan Dinamis
        b.setL(l); // Mengeset Nilai l Berdasarkan Inputan Dinamis
        b.setT(t); // Mengeset Nilai t Berdasarkan Inputan Dinamis

        System.out.println(" ~ Panjang          : "+b.getP()+" CM"); // Pemanggilan Nilai P Melalui Objek b
        System.out.println(" ~ Lebar            : "+b.getL()+" CM"); // Pemanggilan Nilai L Melalui Objek b
        System.out.println(" ~ Tinggi           : "+b.getT()+" CM"); // Pemanggilan Nilai T Melalui Objek b
        System.out.println(" ~ Luas Balok       : "+b.Luas()+" CM2"); // Pemanggilan Method Luas Melalui Objek b
        System.out.println(" ~ Keliling Balok   : "+b.Keliling()+" CM"); // Pemanggilan Method Keliling Melalui Objek b
        System.out.println("====================================");

    }

}