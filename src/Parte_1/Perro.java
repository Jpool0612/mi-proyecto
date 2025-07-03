/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_1;

/**
 *
 * @author MI PC
 */
public class Perro extends Mascota {
    public Perro(String nombre) {
        super(nombre);
    }

    public void ladrar() {
        System.out.println(nombre + " dice: ¡Guau!");
    }
}