package App.Clase5.Tarea5.Cliente;
import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    private String host;
    private int port;

    public Cliente(String host, int port) {   /*Constructor*/
        this.host = host;
        this.port = port;
    }
    
    public void doConectar() {            
            
      String aviso[ ] = {"El producto de 5 y 6 es:"};
      
        try {
            Socket cliente = new Socket(host, port);
// Crear los canales de lectura y escritura
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);            
            
// COMUNICACION 1
            String msg = in.readLine();
            System.out.println(msg);
// COMUNICACION 2
                  
            out.println("CLIENTE: Iniciando multiplicacion");
            // COMUNICACION 3               
            DataOutputStream dos = new DataOutputStream(in());
            
// Cerrar canales
            in.close();
            out.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error Cliente : " + e.getMessage());
        }
    }
     
    
    
          }
    