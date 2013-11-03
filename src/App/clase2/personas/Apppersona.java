
package App.clase2.personas;

public class Apppersona {
    public static void main(String args[]){
    int edad = 20;
     Persona p = new Persona("Piter","Gamarra", edad);
     
     Persona xn = new Persona();
     xn.setNombreApellidos("Maria", "Prado");
     xn.imprimir();
     
    System.out.println("Atributos");
    System.out.println("Nombre:" +p.getNombre());
    System.out.println("Apellido:" +p.getApellidos());
    System.out.print("Edad:" +p.getEdad());
    
}
}
