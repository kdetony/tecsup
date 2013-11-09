package App.Clase3.formato;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class compararfechas {  
    public static void main(String[] args) {
        compararfechas.compara();    /*si tengo otra clase llamo por su nombre*/
    }
    public static void compara() {
        Calendar c1 = new GregorianCalendar(2011,9,1);
        Date fecha1 = c1.getTime();
        
        Calendar c2 = new GregorianCalendar(2011,9,2);
        Date fecha2 = c2.getTime();
                if (fecha1.after(fecha2)) {
                        System.out.println("fecha1 es después que fecha2");
                                        }
                if (fecha1.before(fecha2)) {
                        System.out.println("fecha1 es antes que fecha2");
                                            }
                    }
}
