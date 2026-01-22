
package jared.cuentabancaria;

import java.util.Scanner;

public abstract class  Clase_principal {
     protected String titular;
     static int saldo;
     public void solicitarDatos(){
         
         
     int opc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Binvenido a BBVA, slecciona la opcion que desea realizar:");
        System.out.println("1. Consultar saldo.");
        System.out.println("2. Retiro en efectivo");
        System.out.println("3. Deposito a cuenta bancaria");
        System.out.println("4. salir");
        System.out.println("5 Donar todos tu dinero");
        opc = sc.nextInt();
        do{
            switch(opc) {
            case 1 -> {
                System.out.println("");
            }
            case 2 -> {
                System.out.println("");
            }
                
            case 3 -> {
                System.out.println("3");
            }
            default -> System.out.println("Selecciona una opcion valida");
        }
        
        }while(opc != 4);
        
        System.out.println("Adios");
    }
    public void setTitular(String titular){
     this.titular = titular;
    }
    
    public void setSaldoAgregarD(int saldo){
     this.saldo = saldo;
    }
    
    public String GetTitularMostrar(){
     return titular;
    }
    
    public int GetSaldoMostrar(){
     return saldo;
     
    }
    
    public abstract void Acciones();
}
