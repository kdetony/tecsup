
package App.clase2.animales;
/*Herencia*/
public class Tigre extends Animal {
    public Tigre (String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    /*2 metodos*/
    /*sobre escribiendo*/
    @Override
    public void hacerRuido() {
       System.out.println("Grrrrrrrrr");
      
    }
      
  /*Sobrecargando*/  
    public void hacerRuido(Boolean Molestar) {
       System.out.println("Juaaassggh");
    }  
    
     public void comer() {
       System.out.println("carne");
      
    }
    
    
}
