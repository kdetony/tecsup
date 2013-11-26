package App.Clase5.Tarea5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class ClienteSimple {
  public static void main(String args[]) throws IOException
  {
   int c,con;

   String avisos []={"LA SUMA de 4 y 4 ES: ","LA RESTA de 4 y 4 ES: ","LA MULTIPLICACION de 4 y 4 es: ","LA DIVISION de 4 y 4 es: "};
    try
      {
        Socket s1 = new Socket("127.0.0.1",5432);
        InputStream is = s1.getInputStream();

        DataOutputStream dos = new DataOutputStream(s1.getOutputStream());
        dos.writeInt(4);
        dos.writeInt(4);

        con=0;
        DataInputStream dis = new DataInputStream(is);
       while((c=dis.read())!=-1)
        {
        System.out.println(avisos[con]);
        System.out.println(Math.round((double)c));
        con++;
        }

         s1.close();
         dis.close();
     }
      catch (ConnectException connExc){
                                        System.err.println("OCURRIO UN ERROR");
       } catch (IOException e){

               }
    }
}
