/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author hp
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu; 

    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin); 
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanInfoMobil() {
        System.out.println("Nama: " + getNama());
        System.out.println("Kecepatan Maksimum Mobil: " + getKecepatanMaks() + " km/h");
        System.out.println("Jenis Mesin: " + getJenisMesin());
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}


