/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4soal;

/**
 *
 * @author hp
 */
class Manusia {
    private String nama;  // hanya bisa diakses dari dalam kelas ini
    protected int usia;   // bisa diakses dari kelas ini dan subclass
    public String pekerjaan;  // bisa diakses dari mana saja

    // Constructor untuk menginisialisasi atribut
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }

    // Getter untuk atribut nama
    public String getNama() {
        return nama;
    }

    // Setter untuk atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }
}

