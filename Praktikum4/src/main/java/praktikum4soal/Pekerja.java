/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4soal;

/**
 *
 * @author hp
 */
class Pekerja extends Manusia {
    private double gaji;  // hanya bisa diakses dari dalam kelas ini

    // Constructor untuk menginisialisasi atribut
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);  // memanggil constructor kelas induk
        this.gaji = gaji;
    }

    // Getter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }

    // Setter untuk atribut gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString() untuk menampilkan informasi pekerja
    @Override
    public String toString() {
        return "Nama: " + getNama() + ", Usia: " + usia + ", Pekerjaan: " + pekerjaan + ", Gaji: " + gaji;
    }
}

