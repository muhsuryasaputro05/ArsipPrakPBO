/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3soal;

/**
 *
 * @author muhsu
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Corolla", 2022, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2023, "Putih");

        System.out.println("Informasi Mobil Surya:");
        mobil1.displayInfo();
        mobil1.startEngine();

        System.out.println("\nMengubah warna Mobil Surya");
        mobil1.ubahWarna("Merah");
        mobil1.displayInfo();

        System.out.println("\nInformasi Mobil Saputro");
        mobil2.displayInfo();
        mobil2.startEngine();
    }
}


