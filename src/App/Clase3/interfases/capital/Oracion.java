/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Clase3.interfases.capital;
    public class Oracion    implements  Capitalizable {
        private String texto;

    /*definimos que texto va*/      
    public Oracion(String texto) {
        this.texto = texto;
    }
      
        
    @Override
    public String cambiaMayuscula() {
        return texto.toUpperCase();
    }

    @Override
    public String cambiaMinuscula() {
        return texto.toLowerCase();
    }
        
}
