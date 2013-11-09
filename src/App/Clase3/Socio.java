
package App.Clase3;
public class Socio {
   private int codigo;
   private String nombre;
   private String direccion;

    public Socio(int codigo, String nombre, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
    }

public String toString() {
    String cadena = "Codigo" + this.codigo +""
            + "Nombre:" + this.nombre;
    return cadena;
} 
   
 

   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
        
    
           
}
