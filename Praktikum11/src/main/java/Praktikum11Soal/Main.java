/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum11Soal;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        // Membuat pengarang
        Pengarang pengarang1 = new Pengarang("J.K. Rowling");
        Pengarang pengarang2 = new Pengarang("George R.R. Martin");
        Pengarang pengarang3 = new Pengarang("Suzanne Collins");
        Pengarang pengarang4 = new Pengarang("J.R.R. Tolkien");

        // Membuat buku dan menghubungkan dengan pengarang (Agregasi)
        Buku buku1 = new Buku("Harry Potter", pengarang1);
        Buku buku2 = new Buku("Game of Thrones", pengarang2);
        Buku buku3 = new Buku("The Hunger Games", pengarang3);
        Buku buku4 = new Buku("The Lord of the Rings", pengarang4);

        // Membuat satu perpustakaan dan menambahkan semua buku (Komposisi)
        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        perpustakaan.tambahBuku(buku4);

        // Menampilkan informasi semua buku di perpustakaan
        System.out.println("Daftar Buku di Perpustakaan:");
        perpustakaan.tampilkanInfoBuku();
    }
}
