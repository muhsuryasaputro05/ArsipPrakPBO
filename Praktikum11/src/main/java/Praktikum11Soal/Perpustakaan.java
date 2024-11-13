/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum11Soal;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private List<Buku> daftarBuku;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanInfoBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Perpustakaan tidak memiliki buku.");
        } else {
            for (Buku buku : daftarBuku) {
                buku.infoBuku();
                System.out.println();
            }
        }
    }
}
