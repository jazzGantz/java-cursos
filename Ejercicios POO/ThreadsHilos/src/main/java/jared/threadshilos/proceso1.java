
package jared.threadshilos;


public class proceso1 extends Thread{//se extiende a la clase thread para los hilos
    
    @Override // se agrega Override es necesario
    public void run(){ // el metodo que queramos ejecutar en simultaneo se debe de declarar como run()
        for(int i = 0;i <10; i++){
        System.out.println("proceso 1");
     }
    }
    
    
}
