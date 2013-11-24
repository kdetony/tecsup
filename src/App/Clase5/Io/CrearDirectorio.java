package App.Clase5.Io;

import java.io.File;

public class CrearDirectorio {
    public static void main(String[] ar) {
        CrearDirectorio.CreaDir();
    }       
    public static void CreaDir() {
            File dir = new  File("C:\\TECSUP");
                if (!dir.isDirectory() && !dir.exists() ) {
                    dir.delete();
                }
    
    }
}
