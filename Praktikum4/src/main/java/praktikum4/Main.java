/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 180, "Bensin", 4);

        System.out.println("Informasi awal mobil:");
        mobil.tampilkanInfoMobil();

        mobil.setKecepatanMaks(200);
        mobil.setJumlahPintu(5);

        System.out.println("Informasi setelah perubahan:");
        mobil.tampilkanInfoMobil();
    }
}