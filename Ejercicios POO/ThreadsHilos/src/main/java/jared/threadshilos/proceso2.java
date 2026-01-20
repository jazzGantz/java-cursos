
package jared.threadshilos;


public class proceso2 implements Runnable{// segunda clase que se quiere ejecutar al mismo tiempo se debe de colocar IMPLEMENTS RUNNABLE
    @Override // se agrega Override a toda clase que sea sobre Escrita.
    public void run(){
     for(int i =0; i <10; i++){
      System.out.println("Proceso2");
     }
    }
    
}
