
package App.Clase3.Excepcion;

public class Excepcion {
        /*Con esto se ejecuta en la misma clase*/
    public static void main(String[ ] ar) {
        Excepcion.testExcepcion();
    }
    /**/
    
    public static void testExcepcion() {
        try {
            int dividendo = 10;
            int divisor = 0;
            int resultado = dividendo / divisor;
            /*int [ ] array = new int [2]; */  
            /*array[10]  = 100;*/
            
        } catch (Exception e) {
                System.out.println("Error aqui chekea:" + e.getMessage()) ;   /*Atrapando el ERROR*/
                e.printStackTrace();   /*Traza de Errores*/
                
                /*catch(ArrayIndexOutOfBoundsException e)*/
                /*catch(ArtimeticException e)*/
                
        }
        System.out.println("Fin del programa");
    }
}
