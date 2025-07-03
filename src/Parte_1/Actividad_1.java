/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Parte_1;

/**
 *
 * @author MI PC
 */
public class Actividad_1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        ClinicaVeterinaria c = new ClinicaVeterinaria();

        Mascota m1 = new Perro("Toby");
        Mascota m2 = new Gato("Pelusa");

        c.recibirMascota(m1);
        c.recibirMascota(m2);
    }
}
