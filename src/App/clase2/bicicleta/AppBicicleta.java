package App.clase2.bicicleta;

public class AppBicicleta {
    public static void main(String[] args) {
        bicicleta BICI = new bicicleta();
        /* acceso a un metodo */
        BICI.setMarca("Monark");
        BICI.setModelo("123");
        BICI.cambiarLlantas();
        
        System.out.print(BICI.getMarca());
           
    }
}
