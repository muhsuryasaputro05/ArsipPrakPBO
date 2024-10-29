/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9soal;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Kucing dan Anjing
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        
        // Memanggil metode suara
        kucing.suara(); 
        anjing.suara();
    }
}
