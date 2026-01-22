package jared.examenchayane;


public class ExamenChayane {

    public static void main(String[] args) {
       ClasePrincipal pago_tarjeta = new Pago_tarjeta();
       ClasePrincipal pago_Transferencia = new PagoTransferencia();
       ClasePrincipal pago_Cryptos = new PagoCripto();
       System.out.println("----Tarjeta----");
       pago_tarjeta.getComision();
       pago_tarjeta.getDescripcion();
       System.out.println("----Transferencia----");
       pago_Transferencia.getComision();
       pago_Transferencia.getDescripcion();
       System.out.println("----Cryptos----");
       pago_Cryptos.getComision();
       pago_Cryptos.getDescripcion();
       

       
    }
}
