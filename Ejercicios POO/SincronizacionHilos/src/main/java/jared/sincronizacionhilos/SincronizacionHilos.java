/*La sincronzacion de hilos permite controlar el tiempo y forma de ejecucion e varios hilos ejecutandose
de manera simultanea cuya finalidad es evitar que un hilo provoque el entorpecimiento de otro 
hilo almomento de estar ejecutandosus respectivas tareas.
o bien para establecerun orden de ejecucion de nuestros programas al utilizar hilos.
*/

package jared.sincronizacionhilos;

import jared.sincronizacionhilos.hilos.hilo1;
import jared.sincronizacionhilos.hilos.hilo2;
import jared.sincronizacionhilos.hilos.hilo3;
import jared.sincronizacionhilos.hilos.hilo4;


public class SincronizacionHilos {

    public static void main(String[] args) {
        hilo1 hilo1 = new hilo1();
        hilo2 hilo2 = new hilo2();
        hilo3 hilo3 = new hilo3();
        hilo4 hilo4 = new hilo4();
        
        hilo1.start();
        try{
            hilo1.sleep(10);
        }catch(InterruptedException e){
         System.out.println("Error en el hilo 1: "+ e);
        }
        hilo2.start();
        
        try{
            hilo2.sleep(10);
        }catch(InterruptedException e){
         System.out.println("Error en el hilo 2: "+ e);
        }
        
        hilo3.start();
        
        try{
            hilo3.sleep(10);
        }catch(InterruptedException e){
         System.out.println("Error en el hilo 3: "+ e);
        }
        
        hilo4.start();
        
        try{
            hilo4.sleep(100);
        }catch(InterruptedException e){
         System.out.println("Error en el hilo 4: "+ e);
        }
    }
}
