
package jared.estadosdeunhiloenjava;


public class hilo_proceso extends Thread{
    
    @Override
    public void run(){
     for(int i =0; i<=5; i++){
         System.out.println(i+ ":"+getName());
         try{
             hilo_proceso.sleep(1000);
         }catch(InterruptedException e){
          System.out.println("error en :"+e);
         }
         
     }
    }
    
}
