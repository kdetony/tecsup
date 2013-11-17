
package App.Clase3.Excepcion;


public class Aritmetica2 {
     public static void main(String[ ] ar) {
        Aritmetica2.testExcepcion3();
    }
      public static void testExcepcion3() {
        try {
            
          /*int [ ] numeros = null;*/
          int [ ] numeros = {11,2,4,56,78,8,9,0,9,0,12,11};
            for (int i = 0; i < 11; i++) {  /*fori + TAB*/
              int j = numeros[i];
                System.out.println(j);
                }
        } catch (NullPointerException e) {
            System.out.println("Error Array Nulo"); /*Controle el error*/
            e.printStackTrace(); /*traza error*/
        } finally  {
            System.out.println("Aplicacion terminada");
        }
        
      }
}
