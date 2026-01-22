
package jared.examenchayane;


public class PagoTransferencia extends ClasePrincipal {
    protected String BancoOrigen = "BBVA";
    protected String CuentaDestino = "123456";
    protected String swift = "i dont know";
    
    
    @Override
    public void getComision(){
     procesarPago = 1.56;
    }
    
    @Override
    public void getDescripcion(){
        System.out.println("Banco Origen es: "+ BancoOrigen +" Cuenta de destino es a :"+CuentaDestino+" Y SWIFT ES: "+swift);
    }
}
