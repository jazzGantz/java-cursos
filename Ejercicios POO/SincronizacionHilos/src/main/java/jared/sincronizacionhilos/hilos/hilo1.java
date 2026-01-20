
package jared.sincronizacionhilos.hilos;

public class hilo1 extends Thread{
    @Override
    public void run(){
        for(int i = 0; i <11;i++){
            System.out.print(i+" :G");
            try{
                hilo1.sleep(1000);
            } catch(InterruptedException e){
                System.out.print("error"+ e);
            }
            
            
        }
    
    }
    
}
