package App.Clase5.Sockets.socketBasico;
public class TestServidor {
  
    public static void main(String[] ar){
        TestServidor.TestServer();
        }
    
    public static void TestServer() {
        Servidor server = new Servidor(9999);
        server.ejecutar();
    }
        
}
