/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5hewan;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Tom");
        Anjing anjing = new Anjing("Doggie");

        kucing.tampilkanInfo();
        System.out.println();
        anjing.tampilkanInfo();
    }
}

