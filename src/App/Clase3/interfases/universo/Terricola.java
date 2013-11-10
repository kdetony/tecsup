/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Clase3.interfases.universo;

/**
 *
 * @author alumno
 */
public class Terricola extends Humano {

    @Override
    public void comer() {
        System.out.println("Comiendo");
    }

    @Override
    public void comunicarse() {
      System.out.println("Comunicarse en Español");
    }
    @Override
    public void sentir() {
      System.out.println("Confundido");
    }
    
}
