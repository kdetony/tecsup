
package App.clase2.estatico;

public class Appestatico {
    public static void main(String[] ar) {
            Appestatico.atributoEstatico();
            Appestatico.metodoEstatico();
    }
public static void metodoEstatico() {
    double euro = Estatico.dolarEuro(10d);
    System.out.print(euro);    
}
 
public static void atributoEstatico() {
    System.out.print(Estatico.contador);
    Estatico estaUn = new Estatico();
    Estatico estaDo = new Estatico();
    Estatico estaTre = new Estatico();
    System.out.print(Estatico.contador);
    
    }
}
