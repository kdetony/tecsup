
package App.Clase3.interfases.posicion;


public class Teodolito {
    
  public static void main(String[] ar) {                                    
              
        Position carro = new Carro (20, 30);
        Position persona = new Persona(50,10);
        
        /*Ejecutamos directamente  1    */
        Teodolito.getDistancia(carro, persona);
               
  }                     
            
/*se agrega static para ejecutarse directamente 2*/
   public static void getDistancia(Position p1, Position p2) {
       
       double d1 = p1.getLatitud() - p1.getLatitud();
       double d2 = p1.getLongitud() - p2.getLongitud();
       
       System.out.println(Math.sqrt(d1 * d1 + d2 * d2));
   }
}
