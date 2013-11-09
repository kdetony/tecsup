
package App.Clase3;

/**
 *
 * @author alumno
 */
public class Objeto {

  
    public static void main(String[] args) {
       
        Socio jose = new Socio(12,"jose","Jr. La la la");
        Socio luis = new Socio(12,"jose","Jr. diamantes");
            if (jose==luis) {
                    System.out.print("comprobando referencias");
            }
            if (jose.equals(luis)) {
                System.out.println("Comprobando el valor");
                System.out.println(jose.toString());
            }
    }
}
