/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6soal;

/**
 *
 * @author hp
 */
public class Elektronik extends Produk {
    private final double diskonFlat;

    public Elektronik(String nama, double harga, double diskonFlat) {
        super(nama, harga);
        this.diskonFlat = diskonFlat;
    }

    @Override
    public double hitungDiskon() {
        return diskonFlat; // Diskon flat
    }
}

