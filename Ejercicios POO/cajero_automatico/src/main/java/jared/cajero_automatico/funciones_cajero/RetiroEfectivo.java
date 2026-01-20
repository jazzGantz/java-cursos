/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jared.cajero_automatico.funciones_cajero;

/**
 *
 * @author ClockSoft
 */
public class RetiroEfectivo extends ClasePrincipal {
    
    @Override
    public void Transacciones(){
        System.out.println("----------------------------------------");
        System.out.println("Cuanto deseas retirar: ");
        System.out.println("----------------------------------------");
        Retiro();
        if(retiro <= getSaldo()){
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("Retiraste: "+ retiro);
            System.out.println("Tu saldo actual es de: "+ getSaldo());
            System.out.println("----------------------------------------");
        }else {
         System.out.println("-------------------Saldo insufiente--------------------");
        }
    }
    
}
