/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_3;

/**
 *
 * @author JEAN POOL TAPIERO
 */
public class MascotaDifModificadores {
    //Diferentes modificadores
    private String nombrePrivado = "Privado";
    String nombreDefault = "Default";
    protected String nombreProtegido = "Protegido";
    public String nombrePublico = "Público";
    
    //metodo para el modificador private
    private void metodoPrivado() {
        System.out.println("Método privado");
    }
    //metodo para el modificador default
    void metodoDefault() {
        System.out.println("Método default");
    }
    //metodo para el modificador protectec
    protected void metodoProtegido() {
        System.out.println("Método protegido");
    }
    //metodo para el modificador public
    public void metodoPublico() {
        System.out.println("Método público");
    }
}

