
package App.Clase3;

public class Cadenas {
    public static void main(String[] args) {
     Cadenas.extraccion();
    }
     public static void extraccion() {    
    String texto = "Tecsup";
    System.out.println("Número de Caracteres: "+texto.length()+"\n");
    for (int i=0; i<texto.length(); i++) {
    System.out.println(texto.substring(i,i+1)+"\n");
        }   
    }
}

