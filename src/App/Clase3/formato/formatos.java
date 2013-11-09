
package App.Clase3.formato;
/*psvm+tab*/
import java.text.NumberFormat;
import java.util.Locale;

public class formatos {
   public static void main(String[] args) {
       formatos.numberformat();
           }
   
   /*Agrupando*/
           public static void numberformat() {
           NumberFormat nf = NumberFormat.getInstance(Locale.US);
            System.out.println(nf.format(10000000.0045451));      
   /*No agrupando*/        
        nf.setGroupingUsed(false); /*este metodo indica la agrupacion*/
        System.out.println(nf.format(10000000.0045451));
   
  /*Digitos enteros*/     
        System.out.println("Con 3 enteros mínimo"); 
        nf.setMinimumIntegerDigits(3);
        System.out.println(nf.format(12)); /*manda a imprimir 12, pero solo tiene 2 digitos ojo! le pone 0*/
   
        System.out.println("Con 5 enteros máximo");
        nf.setMaximumIntegerDigits(5);        
        System.out.println(nf.format(123456)); /*elimina el numero de la izquierda*/
        
        System.out.println("Con 4 enteros máximo en los decimales"); 
        nf.setMaximumFractionDigits(4);
        System.out.println(nf.format(123.981454)); /*max. decimales derecha ojo*/

        System.out.println("Con 2 enteros mínimo en los decimales");
        nf.setMinimumFractionDigits(2);
        System.out.println(nf.format(45.2));
        
        
        
           }
}
