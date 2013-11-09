
package App.Clase3.formato;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class formateofechas {
    public static void main(String[] args) {
            formateofechas.simpleDateFormat();  /*cambiar a dateformat para ejecutar ojo!!!!*/
    }
        public static void dateformat() {
            Date now = new Date();
System.out.println(now.getTime()); /*unixtime*/
DateFormat df = DateFormat.getDateInstance();
DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);  /*formato corto de fechas*/
DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM); /*formato medio de fechas*/
DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG); /**/
DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL); /**/
DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL,Locale.US); /**/
SimpleDateFormat df6 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
DateFormat df7 = DateFormat.getDateInstance(DateFormat.SHORT,Locale.US); /**/ 

String s = df.format(now);
String s1 = df1.format(now);
String s2 = df2.format(now);
String s3 = df3.format(now);
String s4 = df4.format(now);
/*String s5 = df5.format(now);*/
String s6 = df6.format(now);
System.out.println("(Default) Hoy es " + s);
System.out.println("(SHORT) Hoy es " + s1);
System.out.println("(MEDIUM) Hoy es " + s2);
System.out.println("(LONG) Hoy es " + s3);
System.out.println("(FULL) Hoy es " + s4);
System.out.println(df5.format(now));
System.out.println("(CUSTOM) Hoy es " + s6);
System.out.println(df7.format(now));
 }    
        
        public static void simpleDateFormat() {
                DateFormat df = new SimpleDateFormat("E d MMM h:m:s a Z"); 
                Date now = new Date();
                System.out.println(df.format(now));
        }
    
}
