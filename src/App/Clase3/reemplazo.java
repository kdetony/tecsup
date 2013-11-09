package App.Clase3;


public class reemplazo {
   public static void main(String[] args) {
/* String texto = "java permite crear java applets, javabeans y java servlets"; 
System.out.println(texto.replaceAll("java","JAVA")); */
       reemplazo.metodosString();
   }
   
   /*Mas metodos String*/   /*trim borra espacio en blanco*/
   public static void metodosString(){
       String jose = "    Pepe Lucho      ";
       System.out.println(jose.toUpperCase().trim());
       System.out.println(jose.contains("u"));
       System.out.println(jose.length());
   }
}   
   


