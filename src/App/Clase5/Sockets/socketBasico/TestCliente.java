
package App.Clase5.Sockets.socketBasico;

public class TestCliente {
    public static void main(String[] ar) {
        TestCliente.testclient();
    }
 public static void testclient() {
        Cliente cliente = new Cliente("localhost",9999);
        cliente.doConectar();
    }

}

