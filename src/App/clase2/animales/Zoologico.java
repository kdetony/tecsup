package App.clase2.animales;

public class Zoologico {
    public static void main(String[] ar) {
        /*Instanciando*/
        Tigre diego = new Tigre("Diego",20);
        diego.hacerRuido();
        /**/
        diego.hacerRuido(true);
       diego.comer();
        
        Caballo jose = new Caballo("Jose",40);
        jose.hacerRuido();
        jose.comer();
         
        Vicuña ma = new Vicuña("Lolo",4);
        ma.hacerRuido();
        ma.comer();
        
            }
    

    
}
