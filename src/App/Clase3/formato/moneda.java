
package App.Clase3.formato;
/*ctrl+shift+i importa*/
import java.text.NumberFormat;
import java.util.Locale;
/*Se reduce el codigo ctrl+shift + -*/

public class moneda {
    public static void main(String[] args) {
        moneda.moneditas();
    }
    
    public static void moneditas() {
        NumberFormat formatoAleman = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        formatoAleman.setGroupingUsed(false);
        
        NumberFormat formatoAmericano = NumberFormat.getCurrencyInstance(Locale.US);
        formatoAmericano.setGroupingUsed(false);
        
        Locale localePeru = new Locale("es", "PE");
        NumberFormat formatoPeru = NumberFormat.getCurrencyInstance(localePeru);
        formatoPeru.setGroupingUsed(false);

        System.out.println("Moneda Euro :"+formatoAleman.format(150000));
        System.out.println("Moneda Dolar :"+formatoAmericano.format(150));
        System.out.println("Moneda Soles :"+formatoPeru.format(15));                     
    }
    
}
