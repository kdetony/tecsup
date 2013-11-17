package App.Clase4.Colecciones;

public class Estudiante implements Comparable<Estudiante>{
    private String nombres;
    private String apellidos;
    private String direccion;
    private int  codMatricula;

    /*constructor*/
    public Estudiante(String nombres, String apellidos) {
        this.nombres=nombres;
        this.apellidos=apellidos;
    }

    Estudiante(String alberto, String zapata, String bolognesi_123, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int compareTo(Estudiante o) {
       String apellidosExterno = o.getApellidos().toLowerCase();
       String apellidosLocal = this.getApellidos().toLowerCase();  /*conviertelo a minuscula*/
       return apellidosLocal.compareTo(apellidosExterno);
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }

public void printEstudiante(){
    System.out.println(this.apellidos+ " " +this.nombres);
}    
    }

