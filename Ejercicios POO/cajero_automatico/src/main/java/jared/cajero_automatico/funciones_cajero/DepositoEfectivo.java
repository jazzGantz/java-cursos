/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jared.cajero_automatico.funciones_cajero;

public class DepositoEfectivo extends ClasePrincipal{
    
    @Override
    public void Transacciones(){
        System.out.println("----------------------------------------");
        System.out.println("Cuanto deseas depositar a la cuenta: ");
        System.out.println("----------------------------------------");
        Deposito();
        if(deposito > 0){
            setSaldo(deposito + saldo);
            
          System.out.println("----------------------------------------");
          System.out.println("Se ha depositado la cantidad de :"+ "$"+deposito);
          System.out.println("Saldo actual :"+ "$"+getSaldo());
          System.out.println("----------------------------------------");
        }
    }
    
}
