
package App.Clase4.Colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ejemploMap {
    public static void main (String[] ar) {
        ejemploMap.ejmmap();
    }
    public static void ejmmap ()  { 
             Estudiante mario = new Estudiante("Mario","Castro Torres");
            Estudiante pepe = new Estudiante("Julian","Lopez Gomez");
            Estudiante maria = new Estudiante("Maria","Mamani Maraletti");
            Estudiante juanito = new Estudiante("Paquita","Drago Porres");
            Estudiante oan = new Estudiante("Joao","Fernandez Zarmiento");
            /*Lista de Estudiantes*/
           HashMap<String, Estudiante> listado = new HashMap<String, Estudiante>();
            listado.put("123",mario);
             listado.put("624",pepe);
            listado.put("567",maria);
            listado.put("965",juanito);
            listado.put("710",oan);
   
            listado.get("710").printEstudiante();
        
            Collection<Estudiante> listadoMap = listado.values();
            for (Estudiante estudiante : listadoMap) {
            estudiante.printEstudiante();
        }
            
        } 
}
