/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Externo;


import Parte_3.MascotaDifModificadores;

/**
 *
 * @author JEAN POOL TAPIERO
 */
public class AccesoExterno {
    public static void main(String[] args) {
        MascotaDifModificadores m = new MascotaDifModificadores();
        //al ser de otro paquete el privado, default y el protegido nos dara error
        // System.out.println(m.nombrePrivado);   // Error
        // System.out.println(m.nombreDefault);   // Error
        // System.out.println(m.nombreProtegido); // Error
        System.out.println(m.nombrePublico);      // OK
        //Solo se muestra el metodo publico
        m.metodoPublico(); // OK
    }
}
