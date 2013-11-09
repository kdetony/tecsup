
package App.Clase3;


public class cadena {
    public static void main(String[] ar) {
        cadena.concatenar();
    }
    public static void concatenar() {
        String nombre = "James";
        String apellido = "Gosling";
            if(nombre.equals("James")) {
        System.out.println(nombre+" "+apellido);
    }
    String completo = nombre.concat(" "+apellido);
    if(nombre.equals("James")) {
        System.out.println(completo);
        }
    }
}
