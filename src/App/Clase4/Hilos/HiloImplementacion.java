package App.Clase4.Hilos;   /*Hilo interface*/

public class HiloImplementacion implements  Runnable{
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(" " +i);
            
        }
    }
    
}
