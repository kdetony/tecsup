
package App.Clase3.Excepcion;

public class SaldoInsuficienteException extends Exception {
    /*debe tener un constructor*/
    /*clase de errores*/
    /*this.   =  hace referencia a la misma clase*/
    /*super= deriva a la clase padre el contructor*/
            public SaldoInsuficienteException(double saldo, double cuantoDesea) {
                super("En su cuenta tiene "+ saldo + " soles. No puede prestarse " + cuantoDesea +" soles.");
        }
}
