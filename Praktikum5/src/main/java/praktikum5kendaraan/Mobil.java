/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5kendaraan;

/**
 *
 * @author hp
 */
class Mobil extends KendaraanDarat {
    int jumlahPintu;

    public Mobil(String nama, int kecepatan, int jumlahRoda, int jumlahPintu) {
        super(nama, kecepatan, jumlahRoda);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}


