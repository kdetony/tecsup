package App.Clase4.Hilos;
import java.io.IOException;

public class ListRam extends Thread{
    public void Ramcita(){
            long mem0 = Runtime.getRuntime().totalMemory();
            long mem1 = Runtime.getRuntime().freeMemory();
            long mem2 = Runtime.getRuntime().availableProcessors();
            long mem3 = Runtime.getRuntime().maxMemory();
            
            System.out.println("Memoria Total:" +mem0);
            System.out.println("Memoria Libre:" +mem1);
            System.out.println("Procesadores Disponibles:" +mem2);    
            System.out.println("Memoria Maxima:" +mem3);
             System.out.println("-------------------------------------");
    }

    
     public void run() {
             for (int i = 0; i <5; i++) {
                try {
                    Ramcita();   /*llamo directamente, solo funciona si esta en la misma clase OJO*/
                    Thread.sleep(10000);

                } catch (InterruptedException ex) {
                    System.out.println("ERROR" + ex.getMessage());
                }
            }
        }       
    
}
