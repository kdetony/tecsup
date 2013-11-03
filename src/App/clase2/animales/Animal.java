
package App.clase2.animales;

/*Clase animal*/
public abstract class Animal {
    /* Atributos */
    private String nombre;
    private String color;
    private double peso;
    private int edad;
    
    /*Metodo */
    public void hacerRuido(){
        
    }
    
     /*Fin metodo*/
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    
    
    
}
