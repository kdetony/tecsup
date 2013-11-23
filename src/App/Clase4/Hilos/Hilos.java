package App.Clase4.Hilos;

import sun.awt.windows.ThemeReader;
/**Clase que ejecula a los ejeplos*/
public class Hilos {
  public static void main(String[ ] arg)  {
        /*     Hilos.testHiloHerencia();*/
      /*  Hilos.testHiloInterface();*/ 
    /*   Hilos.testSimpleHilo(); */
    /*  Hilos.testSimpleHilo2(); */
    /*  Hilos.testPrioridad(); */
      /* Hilos.ProcesosHilo();*/
      Hilos.ListRam();
  }
       
    public static void testHiloHerencia() {
        HilosHerencia hilo = new HilosHerencia();
        hilo.start();
    }
    
      public static void testHiloInterface() {
        HiloImplementacion hilo = new HiloImplementacion();
        Thread runner = new Thread(hilo);
        runner.start();
    }
    
        public static void testSimpleHilo() {
       SimpleDelayThread delay = new SimpleDelayThread();
        delay.start();
    }
      public static void testSimpleHilo2() {
       long delay1 = (long)(Math.random()*3000);
       Simple2DelayThread1 delay= new Simple2DelayThread1("Juanito", delay1);
       delay.start();
    }
       public static void testPrioridad() {
       Simple2DelayThread1 delayJose = new Simple2DelayThread1("Jose", 8);
       Simple2DelayThread1 delayMaria = new Simple2DelayThread1("Maria", 5);
       
       delayMaria.setPriority(Thread.MAX_PRIORITY);
       delayJose.setPriority(Thread.MIN_PRIORITY);
       
       delayJose.start();
       delayMaria.start();            
    }
      
        public static void ProcesosHilo() {
       ProcesosHilo delay = new ProcesosHilo();
        delay.start();
    }
        public static void ListRam() {
       ListRam delay = new ListRam();
        delay.start();
           }
        
}
