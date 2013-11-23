//sleep 
package App.Clase4.Hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleDelayThread  extends Thread {

    public void run ( ) {
       for  (int i=0; i<20;i++) {
           System.out.println(i);
       try {
           Thread.sleep(3000);
                           
              } catch (InterruptedException ex) {
            System.out.println("ERROR" + ex.getMessage());
           }
       }
           
    }
}

