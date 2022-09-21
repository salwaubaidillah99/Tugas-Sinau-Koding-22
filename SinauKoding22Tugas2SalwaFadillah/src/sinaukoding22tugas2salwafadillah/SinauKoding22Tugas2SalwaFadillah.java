/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinaukoding22tugas2salwafadillah;
import java.text.DecimalFormat;
import java.util.Scanner;

abstract class BangunDatar {
    int keliling, luas;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public void KelilingPersegi(int x) {
        System.out.println("------------------------------------------------");
        keliling = 4 * x;
        System.out.println("Keliling Persegi : " + keliling + " cm");
    }

    public void LuasPersegi(int x) {
        System.out.println("------------------------------------------------");
        luas = x * x;
        System.out.println("Luas Persegi : " + luas + " cm^2");
    }

    public void KelilingLayangLayang(int x, int y) {
        System.out.println("------------------------------------------------");
        keliling =2*(x + y);
        System.out.println("Keliling Layang-Layang : " + keliling + " cm");
    }

    public void LuasLayangLayang(int x, int y) {
        System.out.println("------------------------------------------------");
        luas = (x * y)/2;
        System.out.println("Luas Layang-Layang : " + luas + " cm^2");
    }
    public void KelilingBelahKetupat(int x) {
        System.out.println("------------------------------------------------");
        keliling =(4*x);
        System.out.println("Keliling Belah Ketupat : " + keliling + " cm");
    }

    public void LuasBelahKetupat(int x, int y) {
        System.out.println("------------------------------------------------");
        luas = (x * y)/2;
        System.out.println("Luas Belah Ketupat : " + luas + " cm^2");
    }

   
    public void KelilingLingkaran(int x) {
        System.out.println("------------------------------------------------");
        double keliling = 2 * Math.PI * x;
        System.out.println("Keliling Lingkaran : " + df.format(keliling) + " cm");
    }

    public void LuasLingkaran(int x) {
        System.out.println("------------------------------------------------");
        double luas = Math.PI * Math.pow(x, 2);
        System.out.println("Luas Lingkaran : " + df.format(luas) + " cm^2");
    }
}

class selectBD extends BangunDatar {
    public void selectObject(int x) {
        if (x == 5) {
            System.out.println("Keluar Aplikasi");
            System.exit(0);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("Pilih perhitungan Object : ");
        System.out.println("1. Keliling");
        System.out.println("2. Luas");
        System.out.println("------------------------------------------------");
        System.out.print("Masukkan angka perhitungan pilihan : ");
        int selectPerhitungan = scan.nextInt();
        if (x == 1) {
            System.out.print("Masukkan panjang sisi persegi (cm) : ");
            int sisi = scan.nextInt();
            if (selectPerhitungan == 1) {
                KelilingPersegi(sisi);
            } else if (selectPerhitungan == 2) {
                LuasPersegi(sisi);
            } else {
                System.out.println("Pilihan perhitungan anda salah");
            }
        } else if (x == 2) {
            int a, b, c;
            if (selectPerhitungan == 1) {
                System.out.print("Masukkan panjang sisi 1 (cm) : ");
                a = scan.nextInt();
                System.out.print("Masukkan panjang sisi 2 (cm) : ");
                b = scan.nextInt();
                KelilingLayangLayang(a, b);
            } else if (selectPerhitungan == 2) {
                System.out.print("Masukkan panjang alas (cm) : ");
                a = scan.nextInt();
                System.out.print("Masukkan panjang tinggi (cm) : ");
                b = scan.nextInt();
                LuasLayangLayang(a, b);
            } else {
                System.out.println("Pilihan yang anda masukkan salah");
            }
        } else if (x == 3) {
             int a, b, c;
            if (selectPerhitungan == 1) {
                System.out.print("Masukkan  sisi  (cm) : ");
                a = scan.nextInt();
                KelilingBelahKetupat(a);
            } else if (selectPerhitungan == 2) {
                System.out.print("Masukkan panjang alas (cm) : ");
                a = scan.nextInt();
                System.out.print("Masukkan panjang tinggi (cm) : ");
                b = scan.nextInt();
                LuasLayangLayang(a, b);
            } else {
                System.out.println("Pilihan yang anda masukkan salah");
            }
            
        } else if (x == 4) {
            System.out.print("Masukkan panjang jari-jari (cm) : ");
            int r = scan.nextInt();
            if (selectPerhitungan == 1) {
                KelilingLingkaran(r);
            } else if (selectPerhitungan == 2) {
                LuasLingkaran(r);
            } else {
                System.out.println("Pilihan perhitungan anda salah");
            }
        } else {
            System.out.println("Object yang anda pilih tidak ditemukan");
        }
    }
}
/**
 *
 * @author salwa
 */
public class SinauKoding22Tugas2SalwaFadillah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("<=============================================>");
            System.out.println("<===========Tugas 2 Sinau Koding 22===========>");
            System.out.println("|=============================================|");
            System.out.println("|===Menghitung Luas & Keliling Bangun Datar===|");
            System.out.println("|=============================================|");
            System.out.println("1. Persegi");
            System.out.println("2. Layang-Layang");
            System.out.println("3. Belah Ketupat1");
            System.out.println("4. Lingkaran");
            System.out.println("5. Exit");
            System.out.println("------------------------------------------------");
            System.out.print("Masukkan pilihan : ");
            int sob = scan.nextInt();
            selectBD bd = new selectBD();
            bd.selectObject(sob);
        }
    }
    
}
