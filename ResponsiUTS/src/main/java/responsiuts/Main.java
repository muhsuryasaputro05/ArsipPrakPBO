/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package responsiuts;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        // Output Produk
        Produk produk1 = new Elektronik("Televisi", 2000000, 1);
        produk1.tampilkanInfo();
        System.out.println();

        // Output Pegawai
        Pegawai pegawai1 = new PegawaiTetap("Muhammad Surya Saputro", 8000000, 500000);
        pegawai1.tampilkanInfo();
        System.out.println();

        // Output Polimorfisme
        Produk produk2 = new Makanan("Susu UHT", 20000, "2024-11-01");
        produk2.tampilkanInfo();
        System.out.println();

        Pegawai pegawai2 = new PegawaiKontrak("Bagus Sang Surya", 5000000, 6);
        pegawai2.tampilkanInfo();
    }
}
