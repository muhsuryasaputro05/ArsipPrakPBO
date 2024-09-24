/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4soal;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        Pekerja pekerja = new Pekerja("Muhsu", 30, "Programmer", 5000000);

        // Coba akses langsung atribut
        //System.out.println("Nama: " + pekerja.nama); 
        // System.out.println("Usia: " + pekerja.usia);  
        System.out.println("Gaji: " + pekerja.gaji); 
    }
}
