/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5hewan;

/**
 *
 * @author hp
 */
class Anjing extends Hewan {

    public Anjing(String nama) {
        super(nama, "Anjing");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara: Guk-guk");
    }
}

