/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum6;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Kucing();
        hewan.bersuara(); 

        Kucing kucing = new Kucing();
        kucing.makan("ikan"); // Memanggil metode makan() dari kelas Hewan
        kucing.makan("ikan", 2); // Memanggil metode makan() yang overloaded

        Anjing anjing = new Anjing();
        anjing.bersuara(); 
        anjing.makan("daging", 3); // Memanggil metode makan() yang overloaded pada kelas Hewan
    }
}