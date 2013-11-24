package App.Clase5.Io;

import java.io.File;

public class ListarDirectorio {
 public static void main(String[] ar) {
        ListarDirectorio.ListDir();
    }   
    
    public static void ListDir() {
        File dir = new File("C:\\Java");
        if ((dir.exists()) && (dir.isDirectory())) {
            String[] lista = dir.list();   /*recorre el listado*/
            for (int i = 0; i < lista.length; i++) {
                System.out.println("Directorio: " + lista[i]);
            }
        } else {
            System.out.println("El directorio no existe.");
        }
    }
}
