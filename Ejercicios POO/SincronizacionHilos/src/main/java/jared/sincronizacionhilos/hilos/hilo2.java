/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jared.sincronizacionhilos.hilos;

/**
 *
 * @author ClockSoft
 */
public class hilo2 extends Thread {
    @Override
    public void run(){
        for(int i = 0; i <11;i++){
            System.out.print("E");
            try{
                hilo1.sleep(1000);
            } catch(InterruptedException e){
                System.out.print("error"+ e);
            }
            
            
        }
    
    }
    
}
