
package jared.examenchayane;

public class PagoPaypal extends ClasePrincipal{
    protected String email = "Jared@gmail.com";
    protected String region = "NORT AMERICA";
    
    @Override
    public void getComision(){
        procesarPago = 2.99;
    }
    
    @Override
    public void getDescripcion(){
        System.out.println("los datos de Pago de paypal es: correo: "+email+ " region: "+region);
    
    }
}
