/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Clase3.Excepcion;
public class CajeroAutomatico {
            public static void main(String[ ] ar) throws SaldoInsuficienteException {
            try {
                
                Cuenta cuentajose =  new Cuenta("Pedro",5000);
                System.out.println("Saldo:" +cuentajose.retirarCajero(3000));
                System.out.println("Saldo:" +cuentajose.retirarCajero(5000));
                
            }
            catch (SaldoInsuficienteException e) {
                System.out.println("Operacion no valida");
            }
            }
}
            
