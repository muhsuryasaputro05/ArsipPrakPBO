/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum10Soal;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        Elektronik elektronik = new Elektronik();
        Makanan makanan = new Makanan();

        double hargaElektronik = 1400000;
        double hargaMakanan = 75000;

        double pajakElektronik = elektronik.hitungPajak(hargaElektronik);
        double pajakMakanan = makanan.hitungPajak(hargaMakanan);

        System.out.println("Pajak Elektronik: Rp " + pajakElektronik);
        System.out.println("Pajak Makanan: Rp " + pajakMakanan);
    }
}

