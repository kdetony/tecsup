
package App.Clase3.Excepcion;

public class Aritmetica {
    public static void main(String[ ] ar) {
        Aritmetica.testExcepcion2();
    }
      public static void testExcepcion2() {
          int x = (int)(Math.random() * 5);
         int y = (int)(Math.random() * 10);
         int [ ] z = new int[5];
try {
System.out.println("y/x gives " + (y/x));
System.out.println("y is " + y + " z[y] is " + z[y]);
    } catch (ArithmeticException e) {
            System.out.println("Problema Aritmetico " + e);
    } catch (ArrayIndexOutOfBoundsException e) {    
            System.out.println("Subscript problem " + e);
} 
finally {
            System.out.println("Terminando la ejecución del método");
}
            System.out.println("Continúa la ejecución del método....");
        }
}