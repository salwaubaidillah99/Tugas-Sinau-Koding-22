/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinaukoding22tugas3salwafadillahh;

import java.util.Scanner;

/**
 *
 * @author salwa
 */
public class SinauKoding22Tugas3SalwaFadillahh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("<=============================================>");
            System.out.println("<===========Tugas 2 Sinau Koding 22===========>");
            System.out.println("|=============================================|");
            System.out.println("|===Menghitung Luas & Keliling Bangun Datar===|");
            System.out.println("|=============================================|");
            System.out.println("1. Persegi");
            System.out.println("2. Layang Layang");
            System.out.println("3. Belah Ketupat");
            System.out.println("4. Lingkaran");
            System.out.println("5. Exit");
            System.out.println("|=============================================|");
            System.out.println("| Masukkan Pilihan : ");
            int object = scan.nextInt();
            selectObject bd = new selectObject();
            bd.select(object);
        }
    }
}

class selectObject {
    void select(int x) {
        if (x == 5) {
            System.exit(0);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("|---------------------------------------------|");
        System.out.println("|Pilih perhitungan Object : ");
        System.out.println("|   1. Keliling");
        System.out.println("|   2. Luas");
        System.out.println("|---------------------------------------------|");
        System.out.print("| Masukkan  pilihan : ");
        int selectPerhitungan = scan.nextInt();

        switch (x) {
            case 1:
                System.out.print("| Masukkan  sisi persegi (cm) : ");
                float sisi = scan.nextInt();
                Persegi persegi = new Persegi(sisi);
                switch (selectPerhitungan) {
                    case 1:
                        System.out.println(persegi.keliling() + "| Keliling Persegi ");
                        System.out.println("|---------------------------------------------|");
                        break;
                    case 2:
                        System.out.println(persegi.luas() + "| Luas Persegi ");
                        System.out.println("|---------------------------------------------|");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            case 2:
                LayangLayang layanglayang = new LayangLayang();
                switch (selectPerhitungan) {
                    case 1:
                        System.out.print("| Masukkan  sisi 1 Layang-layang(cm) : ");
                        float sisi1 = scan.nextFloat();
                        System.out.print("| Masukkan sisi 2 Layang-layang (cm) : ");
                        float sisi2 = scan.nextFloat();
                        layanglayang.keliling(sisi1, sisi2);
                        System.out.println(layanglayang.keliling() + "| Keliling Layang-Layang");
                        System.out.println("|---------------------------------------------|");
                        break;
                    case 2:
                        System.out.print("| Masukkan diagonal1 Layang-layang (cm) : ");
                        float diagonal1 = scan.nextFloat();
                        System.out.print("| Masukkan diagonal2 Layang-layang(cm) : ");
                        float diagonal2 = scan.nextFloat();
                        layanglayang.luas(diagonal1, diagonal2);
                        System.out.println(layanglayang.luas() + "| Luas Layang-Layang");
                        System.out.println("|---------------------------------------------|");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;

            case 3:
                BelahKetupat belahketupat = new BelahKetupat();
                switch (selectPerhitungan) {
                    case 1:
                        System.out.print("| Masukkan sisi Belah Ketupat (cm) : ");
                        float sisi1 = scan.nextFloat();
                        belahketupat.keliling(sisi1);
                        System.out.println(belahketupat.keliling() + "| Keliling Belah Ketupat ");
                        System.out.println("|---------------------------------------------|");
                        break;
                    case 2:
                        System.out.print("| Masukkan diagonal1 Belah Ketupat (cm) : ");
                        float diagonal1 = scan.nextFloat();
                        System.out.print("| Masukkan diagonal2 Belah Ketupat (cm) : ");
                        float diagonal2 = scan.nextFloat();
                        belahketupat.luas(diagonal1, diagonal2);
                        System.out.println(belahketupat.luas() + "| Luas Belah Ketupat ");
                        System.out.println("|---------------------------------------------|");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            case 4:
                System.out.print("| Masukkan jari-jari Lingkaran (cm) : ");
                float jari = scan.nextFloat();
                Lingkaran lingkaran = new Lingkaran(jari);
                switch (selectPerhitungan) {
                    case 1:
                        System.out.println( lingkaran.keliling() + "|Keliling Lingkaran  ");
                        System.out.println("|---------------------------------------------|");
                        break;
                    case 2:
                        System.out.println( lingkaran.luas() + "| Luas Lingkaran  ");
                        System.out.println("|---------------------------------------------|");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

    }
}


