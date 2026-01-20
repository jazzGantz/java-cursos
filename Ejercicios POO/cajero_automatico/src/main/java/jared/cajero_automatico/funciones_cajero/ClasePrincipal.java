
package jared.cajero_automatico.funciones_cajero;

import java.util.Scanner;


public abstract class ClasePrincipal { 
    
    protected int transacciones, retiro, deposito;
    Scanner sc = new Scanner(System.in);
    static int saldo;
    
    
    public void operaciones(){
        int eleccion;
        System.out.println("Bienvenidos a al cajero BBVA");
        do{
         System.out.println("Por favor selecciona una opcion :");
         System.out.println("1. Consulta de saldo");
         System.out.println("2. Retiro en efectivo");
         System.out.println("3. Depositos en efectivo");
         System.out.println("4. salir");
         eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    ClasePrincipal getSaldoC = new ConsultaSaldo();
                    getSaldoC.Transacciones();
                    break;
                case 2:
                    ClasePrincipal retiroC = new RetiroEfectivo();
                    retiroC.Transacciones();
                    break;
                case 3:
                    ClasePrincipal SaldoGet = new DepositoEfectivo();
                    SaldoGet.Transacciones();
                    break;
                case 4:
                    System.out.print("-----------------Adios!-------------");
                default:
                    System.out.print("-----------------ERROR-------------");
            }
         
         
        }while(eleccion !=4);
        
    }
     
        
        public void Retiro(){
         retiro = sc.nextInt();
        }
        //metodo para solicitar deposito
        public void Deposito(){
            deposito = sc.nextInt();
        }
        
        public abstract void Transacciones();
        
        
        
        
        //METODOS SETTER(Consultar) Y GETTER(Modificar)
        public int getSaldo(){
        return saldo;
        }
        public void setSaldo(int saldo){
            this.saldo = saldo;
        }        
}
    

