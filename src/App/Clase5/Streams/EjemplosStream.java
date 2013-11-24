package App.Clase5.Streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import sun.org.mozilla.javascript.internal.ast.CatchClause;

public class EjemplosStream {
    private List<String> lineas;        
    private String filename;
  
     public EjemplosStream(String file) {
        this.filename = file;
        this.lineas = new ArrayList<String>();
            }   
     
    public static void main(String[] args) {    /*instanciar para ejecutar*/
        EjemplosStream ejemplo = new EjemplosStream("c:\\ejemplo.txt");
        ejemplo.actualizarDatos();
    }
     
    public void actualizarDatos() {
        leerArchivo();
        guardarArchivo();
    }
    public void leerArchivo() {
        try {
            String line;
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
                    while ((line = br.readLine()) !=null) {
                        this.lineas.add(line);
                    } 
                    br.close();
                    fr.close();
                    }    catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
        }    
    
    public void guardarArchivo() {
        try {
                FileWriter fw = new FileWriter(this.filename);
                BufferedWriter bw = new BufferedWriter(fw);

                    for (String line : this.lineas) {
                        bw.write(line);
                        bw.newLine();    
                        }
              bw.write("Nuevo Mensaje");              
              bw.newLine();
              bw.close();
              fw.close();
} catch (IOException e) {
    e.printStackTrace();
            }
        }
     }
