/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6soal;

/**
 *
 * @author hp
 */
public class Buku extends Produk {
    private final double diskonPersen;

    public Buku(String nama, double harga, double diskonPersen) {
        super(nama, harga);
        this.diskonPersen = diskonPersen;
    }

    @Override
    public double hitungDiskon() {
        return harga * diskonPersen / 100;
    }
}
