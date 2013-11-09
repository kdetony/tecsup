package App.Clase3;


public class stringbuffer {
   public static void main(String[] args) {
/* String texto = "java permite crear java applets, javabeans y java servlets"; 
System.out.println(texto.replaceAll("java","JAVA")); */
       stringbuffer.buffer1();
   }
   
   /*Mas metodos String*/   /*trim borra espacio en blanco*/
   public static void buffer1(){
       StringBuffer buffer = new StringBuffer("tecsup");
       buffer.append(" - ");
       buffer.append("java");
       
       /*agregamos instituto y espacio es una POSICION*/
       buffer.insert(0, " instituto ");
       
       /*Borramos java, usamos length para leer todo el String*/
       buffer.delete(buffer.indexOf(" java"),buffer.length());
       
       
       System.out.println(buffer);
       
       /*Imprime al reves*/
       System.out.println(buffer.reverse());
       
        }   
}
   
