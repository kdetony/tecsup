package App.Clase5.Tarea5.Servidor;

import App.Clase5.Sockets.socketInfinito.Servidor;

public class ConnectorServer {
  
    public static void main(String[] ar){
        ConnectorServer.TestServer();
        }
    
    public static void TestServer() {
        Servidor server = new Servidor(9999);
        server.ejecutar();
    }
        
}
