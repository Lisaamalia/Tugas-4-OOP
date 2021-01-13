package com.company;

public class Balok implements BangunDatar { // Class Implementasi dari Interface BangunDatar
    int p, l, t; // Pendeklarasian Variabel p,l,t dengan tipe data integer
    public Balok() {} // Pendeklarasian Class Balok

    public int getP() { // Method Getter Untuk Mendapatkan Nilai P
        return p;
    }

    public void setP(int p) { // Method Setter Untuk Mengeset Nilai P
        this.p = p;
    }
    public int getL() { // Method Getter Untuk Mendapatkan Nilai L

        return l;
    }

    public void setL(int l) { // Method Setter Untuk Mengeset Nilai L
        this.l = l;
    }

    public int getT() { // Method Getter Untuk Mendapatkan Nilai T
        return t;
    }

    public void setT(int t) { // Method Setter Untuk Mengeset Nilai T
        this.t = t;
    }

    //Method Untuk Menghitung Luas Balok Dengan Tipe Data Integer
    @Override
    public int Luas() {
        return (2*((p*l)+(p*t)+(l*t)));
    }

    //Method Untuk Menghitung Keliling Balok Dengan Tipe Data Integer
    @Override
    public int Keliling() {
        return (4*(p+l+t));
    }
}
