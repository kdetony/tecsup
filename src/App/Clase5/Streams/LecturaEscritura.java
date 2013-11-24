package App.Clase5.Streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LecturaEscritura {

    public static void main(String[] arg) {
        LecturaEscritura.escribirArchivo();
        LecturaEscritura.LeerArchivo();
            }
    
    
    
    public static void escribirArchivo() {
        try {
            FileWriter fw = new FileWriter("C:\\TECSUP\\ejemplo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Buenas noches Tecsup");
            bw.newLine();
            bw.write("Clase de escritura");
            bw.newLine();
            bw.write("Hola Chulls");
            bw.newLine();
            bw.write("");
            bw.newLine();
            bw.write("Hola Again");
            bw.newLine();
            bw.write("Hola  Tecsup");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void LeerArchivo() {
        String sInput;
        try {
           FileReader fr = new FileReader("C:\\TECSUP\\ejemplo.txt");
           BufferedReader br = new BufferedReader(fr);
            while ((sInput = br.readLine()) != null) {
                System.out.println(sInput);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
