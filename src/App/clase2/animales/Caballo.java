package App.clase2.animales;

public class Caballo extends Animal {
    public Caballo (String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
       
    }

    /*sobre escribiendo*/
    @Override
    public void hacerRuido() {
       System.out.println("Relinchooooo");
       
    }
      public void comer() {
       System.out.println("pasto");
      
    }

}
