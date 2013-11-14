
package App.Clase3.Tarea3.Abstractas;

public abstract class Distrito {
   private String nombreDistrito;
   private String nombreCentroDistribucion;

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }

    public String getNombreCentroDistribucion() {
        return nombreCentroDistribucion;
    }

    public void setNombreCentroDistribucion(String nombreCentroDistribucion) {
        this.nombreCentroDistribucion = nombreCentroDistribucion;
    }
   }
