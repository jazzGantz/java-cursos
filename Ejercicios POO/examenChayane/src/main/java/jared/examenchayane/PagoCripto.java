
package jared.examenchayane;

public class PagoCripto extends ClasePrincipal {
    protected String wallet = "wallet1";
    
    @Override
    public void getComision(){
        procesarPago = 2.66;
        System.out.print("Comision de: "+ procesarPago);
     
    }
    
    @Override
    public void getDescripcion(){
      System.out.println("Tipo de pago es: "+ wallet);
    }
    
}
