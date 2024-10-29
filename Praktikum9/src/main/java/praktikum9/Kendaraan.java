/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum9;

/**
 *
 * @author hp
 */
// Definisi kelas abstrak
abstract class Kendaraan {
    // Metode abstrak
    abstract void berjalan();

    // Metode dengan implementasi
    void info() {
        System.out.println("Ini adalah kendaraan.");
    }
}
