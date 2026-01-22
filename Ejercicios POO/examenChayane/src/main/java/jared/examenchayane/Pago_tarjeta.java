
package jared.examenchayane;

public class Pago_tarjeta extends ClasePrincipal {
    protected int numTarjeta = 12345;
    protected int cvv = 4536;
    protected String expiracion = "12/10/2013";
    protected String TipoExamen = "Polimorfismo";
    
    @Override
    public void getComision(){
        System.out.print("Comision de 1");
        procesarPago = 12.30;
    }
    
    @Override
    public void getDescripcion(){
    System.out.println("datos de tarjeta:"+ "numerode tarjeta: "+numTarjeta +" CVV: "+ cvv+ " expiracion: "+expiracion);
    System.out.println("tipo de examen: "+TipoExamen);
    }
    
    
}
