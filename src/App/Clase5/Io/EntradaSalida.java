package App.Clase5.Io;
import java.io.File;

public class EntradaSalida {
    public static void main(String[] ar) {
            EntradaSalida.verifyFile();
    }
    
    public static void verifyFile () {
        File file = new File("C:\\temario.txt");
        System.out.println("Nombre: " + file.getName());
        System.out.println("Ruta : " + file.getPath());
        System.out.println("Ruta Absoluta: " + file.getAbsolutePath());
    
        if(file.exists()){
                System.out.println("Archivo sí existe!");
                System.out.println((file.canRead()) ? "Sí se puede leer" : "");
                System.out.println((file.canWrite()) ? "Sí se puede escribir" : "");
                System.out.println("La longitud del archivo es de " + file.length() + " bytes");
                            } else {
                System.out.println("El archivo no existe");
                                    }
        
    }

   }
