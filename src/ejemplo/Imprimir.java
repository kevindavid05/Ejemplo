/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

/**
 *
 * @author 50241
 */
public class Imprimir {
    private Interface_Imprimible ob;

    public Imprimir(Interface_Imprimible ob) {
        this.ob = ob;
    }
    
    public void ImprimirObjetoPorImpresora(){
    
    System.out.println(this.ob.Imprimir());
    }
}
