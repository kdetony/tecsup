package App.Clase3.interfases.capital;

public class Imprenta {

    public static void main(String[] ar) {

        Capitalizable[] palabra = new Capitalizable[4];  /*nombre del arreglo ARRAY/PALABRA*/
        palabra[0] = new Palabra("Vamos a la playita");
        palabra[1] = new Palabra("Mancora");
        palabra[2] = new Oracion("Febrero Playita - Sur");
        palabra[3] = new Palabra("Fichas tengo");
        for (int i = 0; i < palabra.length; i++) {
            /* System.out.println( "Texto " + i + ": " + obj1[i].cambiaMayuscula());    */
            System.out.println(palabra[i].cambiaMayuscula());
        }
    }
}
