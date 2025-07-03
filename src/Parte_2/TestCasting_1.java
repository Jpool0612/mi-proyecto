/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_2;

import Parte_1.Gato;
import Parte_1.Mascota;
import Parte_1.Perro;

/**
 *
 * @author JEAN POOL TAPIERO
 */
public class TestCasting_1 {
    public static void main(String[] args) {
        Mascota m = new Gato("Michi");
        //Se agrega el instanceof para la verificacion
        if (m instanceof Perro) {
        Perro p = (Perro) m;  
        p.ladrar();
        //si no cumple con las caracteristicas se envia un mensaje aclarando
        }else{
            System.out.println("No es un perro, no se puede hacer la accion ladrar.");
        }
    }
}
