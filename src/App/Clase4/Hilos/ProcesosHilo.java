package App.Clase4.Hilos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProcesosHilo extends Thread {

    public void listProcess() {
        try {
            Process proceso = Runtime.getRuntime().exec("tasklist");
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(
                    proceso.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(
                    proceso.getErrorStream()));
            String s = null;
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
            /* System.exit(0);*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        @Override
        public void run() {
             for (int i = 0; i <10; i++) {
                try {

                    listProcess();   /*llamo directamente, solo funciona si esta en la misma clase OJO*/
                    Thread.sleep(10000);

                } catch (InterruptedException ex) {
                    System.out.println("ERROR" + ex.getMessage());
                }
            }
        }


    }

