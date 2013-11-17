
package App.Clase4.Colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class LinkenDist {
    public static void main (String[] arg ) {
        LinkenDist.ejemploLikenDist();
    }
    
    public static void ejemploLikenDist() {
            Estudiante mario = new Estudiante("Mario","Castro Torres");
            Estudiante pepe = new Estudiante("Julian","Lopez Gomez");
            Estudiante maria = new Estudiante("Maria","Mamani Maraletti");
            Estudiante juanito = new Estudiante("Paquita","Drago Porres");
             Estudiante pedro = new Estudiante("Rosa","Lima Gutierres");
            /*Lista de Estudiantes*/
            LinkedList<Estudiante> listado = new LinkedList<Estudiante>();
            listado.add(mario);
            listado.add(pepe);
            listado.add(maria);
            listado.add(juanito);
            listado.add(pedro);
       
            ListIterator<Estudiante> ite = listado.listIterator();
        while(ite.hasNext() ) {
        Estudiante e = (Estudiante) listado.poll();
                e.printEstudiante();
            }   
                    System.out.println(listado.size());
                     }
            
}
