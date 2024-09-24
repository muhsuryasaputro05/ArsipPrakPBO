/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5kendaraan;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 120, 4, 4);
        SepedaMotor motor = new SepedaMotor("Yamaha", 90, 2, "Mesin 4-Tak");

        mobil.tampilkanInfo();
        System.out.println();
        motor.tampilkanInfo();
    }
}

