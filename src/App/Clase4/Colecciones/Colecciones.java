
package App.Clase4.Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colecciones {
   
    /*con esto ejecutamos la clase*/
    public static void main (String[ ] ar) {
        Colecciones.ejemploEstudiantes();
    }  
        
    public static void ejemploEstudiantes() {
            Estudiante mario = new Estudiante("Mario","Castro Torres");
            Estudiante pepe = new Estudiante("Julian","Lopez Gomez");
            Estudiante maria = new Estudiante("Maria","Mamani Maraletti");
            Estudiante juanito = new Estudiante("Paquita","Drago Porres");
            Estudiante pedro = new Estudiante("Miguel","Roman Suarez");
            Estudiante lala = new Estudiante("Leandro","Bueno Benitez");
            /*Lista de Estudiantes*/
            List<Estudiante> listado = new ArrayList<Estudiante>();
            listado.add(mario);
            listado.add(pepe);
            listado.add(maria);
            listado.add(juanito);
            listado.add(pedro);
            listado.add(lala);
            
            Collections.sort(listado);    /*Ordena la lista*/
            for (Estudiante estudiante : listado) {
                estudiante.printEstudiante();
            
        }
            /*recorrer una lista fore + TAB*/
                    
        }
}
