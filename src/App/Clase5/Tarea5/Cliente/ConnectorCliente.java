package App.Clase5.Tarea5.Cliente;

public class ConnectorCliente{
    public static void main(String[] ar) {
        ConnectorCliente.TestCliente();
    }
 public static void TestCliente() {
        Cliente cliente = new Cliente("localhost",9999);
        cliente.doConectar();
        }

}