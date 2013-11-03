package App.clase2.personas;

public class Persona {

    public String nombre;
    public String apellidos;
    public int edad;
    

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    /*Este es un constructor, no devuelve datos
      public void lala( ) -> esto es un metodo
     */
    public Persona () {
            }

    
    /*METODO*/
    public void setNombreApellidos(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public void imprimir(){
       System.out.println(nombre +" " +apellidos);
}
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

     
}
