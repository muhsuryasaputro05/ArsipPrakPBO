/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum11Komposisi;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        Buku buku1 = new Buku("Belajar Java");
        Buku buku2 = new Buku("Algoritma dan Struktur Data");

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        perpustakaan.infoPerpustakaan();
    }
}
