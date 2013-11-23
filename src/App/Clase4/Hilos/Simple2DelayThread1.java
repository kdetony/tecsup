
package App.Clase4.Hilos;
public class Simple2DelayThread1 extends Thread{
    private long delay;
    private String nombre;
    
    public Simple2DelayThread1(String nombre, long delay) {
        this.delay = delay;
        this.nombre = nombre;
    }
    
    public void run () {
        for (int i=0; i<10; i++ ) {
        System.out.println("Nombre: " + nombre + "|  delay:  " + delay);
       try {
           Thread.sleep(delay);
       } catch (InterruptedException ex) {
           System.out.println("ERROR:" +  ex.getMessage());
       }
    
    
    
    
    }
    }
    
    
}
