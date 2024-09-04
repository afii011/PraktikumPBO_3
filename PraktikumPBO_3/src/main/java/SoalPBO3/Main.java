/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPBO3;

/**
 *
 * @author afifa
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobilSaya = new Mobil("Toyota", "Avanza", 2020, "Hitam");
        Mobil mobilMecca = new Mobil ("Hyundai", "Ioniq", 2023, "Merah");
        
        mobilSaya.displayInfo();
        mobilSaya.setWarna("Hitam");
        mobilSaya.startEngine();
        
        mobilMecca.displayInfo();
        mobilMecca.setWarna("Merah");
        mobilMecca.startEngine();
    }
}
