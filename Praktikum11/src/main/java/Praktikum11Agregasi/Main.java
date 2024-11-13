/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum11Agregasi;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        Klub klubBola = new Klub("Real Madrid");

        Anggota anggota1 = new Anggota("Cristiano Ronaldo");
        Anggota anggota2 = new Anggota("Karim Benzema");

        klubBola.tambahAnggota(anggota1);
        klubBola.tambahAnggota(anggota2);

        klubBola.infoKlub();
    }
}
