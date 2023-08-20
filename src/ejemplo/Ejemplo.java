/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo;

/**
 *
 * @author 50241
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase_usuario us = new Clase_usuario("Kevin","David");

        Clase_Administrador adm = new Clase_Administrador("KEVIN123","DAVID456");
        
        Imprimir Impresora = new Imprimir(us);
        Impresora.ImprimirObjetoPorImpresora();
    }
    
}
