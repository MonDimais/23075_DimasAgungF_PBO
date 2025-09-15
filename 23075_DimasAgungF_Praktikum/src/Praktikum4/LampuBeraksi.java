    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;

/**
 *
 * @author dimas
 */
public class LampuBeraksi {
    public static void main(String[] args) {
        Lampu lampukamar = new Lampu();
        
        lampukamar.hidupkan();
        System.out.println(lampukamar.statusLampu);
    }
}
