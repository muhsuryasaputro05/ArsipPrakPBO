/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12.SerializationPractice;

/**
 *
 * @author hp
 */
import java.io.*;

public class SerializationPractice {
    public static void main(String[] args) {
        String filePath = "produk.ser";

        // Membuat objek Produk
        Produk produk = new Produk("Laptop", 15000000, 10);

        // Menyimpan objek ke file (Serialisasi)
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(produk);
            System.out.println("Objek Produk berhasil disimpan ke file: " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan objek.");
            e.printStackTrace();
        }

        // Membaca objek dari file (Deserialisasi)
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Produk deserializedProduk = (Produk) ois.readObject();
            System.out.println("\nObjek Produk berhasil dibaca dari file:");
            deserializedProduk.tampilkanInfo();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat membaca objek.");
            e.printStackTrace();
        }
    }
}
