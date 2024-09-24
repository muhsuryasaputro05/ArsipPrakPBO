/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6soal;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Buku buku = new Buku("Object Oriented Programming", 100000, 10);
        Elektronik elektronik = new Elektronik("TV", 2000000, 50000);
        Pakaian pakaian = new Pakaian("Kemeja", 150000, 20);

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        // Tampilkan daftar produk
        keranjang.tampilkanDaftarProduk();

        // Tampilkan total harga setelah diskon
        System.out.println("Total harga setelah diskon: Rp" + keranjang.hitungTotalHargaSetelahDiskon());
    }
}


