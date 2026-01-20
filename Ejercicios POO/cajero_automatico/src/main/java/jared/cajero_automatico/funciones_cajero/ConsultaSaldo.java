
package jared.cajero_automatico.funciones_cajero;


public class ConsultaSaldo extends ClasePrincipal{
    
    @Override
    public void Transacciones(){
        System.out.println("----------------------------------------");
        System.out.println("Tu saldo actual es de :" +getSaldo());
        System.out.println("----------------------------------------");
    }
}
