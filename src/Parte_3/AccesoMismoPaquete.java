/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_3;


/**
 *
 * @author JEAN POOL TAPIERO
 */
public class AccesoMismoPaquete {
    public static void main(String[] args) {
        MascotaDifModificadores m = new MascotaDifModificadores();
        //Por ser del mismo paquete nos muestra todos a excepcion del privado 
        // System.out.println(m.nombrePrivado); // Error
        System.out.println(m.nombreDefault);     // OK
        System.out.println(m.nombreProtegido);   // OK
        System.out.println(m.nombrePublico);     // OK

        // m.metodoPrivado(); // Error
        m.metodoDefault();     // OK
        m.metodoProtegido();   // OK
        m.metodoPublico();     // OK
    }
}

