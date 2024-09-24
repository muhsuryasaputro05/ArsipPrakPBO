/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6soal;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private final List<Produk> daftarProduk;

    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk produk : daftarProduk) {
            total += produk.getHarga() - produk.hitungDiskon();
        }
        return total;
    }

    // Metode untuk menampilkan daftar produk
    public void tampilkanDaftarProduk() {
        System.out.println("Daftar Produk dalam Keranjang:");
        for (Produk produk : daftarProduk) {
            System.out.println("- " + produk.getNama() + ": Rp" + produk.getHarga() + 
                               " (Diskon: Rp" + produk.hitungDiskon() + ")");
        }
    }
}


