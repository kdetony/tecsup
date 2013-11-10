/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Clase3.interfases.universo;

public abstract class SerVivo {
            public abstract void comer();
            public abstract void comunicarse();
            public abstract void sentir();
            private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
            
}
