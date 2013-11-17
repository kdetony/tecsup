package App.Clase4.Colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ejemploHashSet {
     public static void main (String[ ] arg ) {
        ejemploHashSet.hashSet();
    }
    public static void hashSet( ) {
        Estudiante mario = new Estudiante("Mario","Castro Torres");
            Estudiante pepe = new Estudiante("Julian","Lopez Gomez");
            Estudiante maria = new Estudiante("Maria","Mamani Maraletti");
            Estudiante juanito = new Estudiante("Paquita","Drago Porres");
            Estudiante pedro = new Estudiante("Miguel","Roman Suarez");
            Estudiante lala = new Estudiante("Leandro","Bueno Benitez");
            /*Lista de Estudiantes*/
           Set<Estudiante> listado = new HashSet<Estudiante>();
            listado.add(mario);
            listado.add(mario);
            listado.add(mario);
            listado.add(pepe);
            listado.add(maria);
            listado.add(juanito);
            listado.add(pedro);
            listado.add(pedro);
            listado.add(lala);
            listado.add(lala);
            
            /*acceder */
                   
            for (Estudiante estudiante : listado) {
                estudiante.printEstudiante();
        }
             System.out.println(listado.size( ) );
           
                    }
   }