package App.Clase5.Tarea5;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSimple {
  public static void main(String args[])
   {
    ServerSocket s=null;
        int a,b,result;

    try
      {
        s= new ServerSocket(5432);
       } catch (IOException e)
             {
               e.printStackTrace();
             }
        while(true)
           {
             try
              {
               Socket s1= s.accept();
                DataInputStream dis = new DataInputStream(s1.getInputStream());
        a=dis.readInt();
        b=dis.readInt();

                OutputStream slout = s1.getOutputStream();
                BufferedWriter bw = new BufferedWriter(new       OutputStreamWriter(slout));

        result=a+b;
                bw.write(result);
        result=a-b;
                bw.write(result);
        result=a*b;
                bw.write(result);
        result=a/b;
                bw.write(result);

                bw.close();
                s1.close();
              } catch(IOException e)
                      {
                        e.printStackTrace();
                       }
             }
     }
}
