/* Un hilo presenta distintos estados desde sucreacion hasta el fin de su ejecucion.
  estos estados son los siguientes:
  El hilo (thread), ha sido creado pero no inicializado, esdecir, nose ha ejecutado el metodo start();

Se producira un mensaje de error (IllegalThreadStateException) si se intenta ejecutar cualquier metodo delaclase de thread Excepto con el metodo start().
*/
package jared.estadosdeunhiloenjava;


public class EstadosDeUnHiloEnJava {

    public static void main(String[] args) {
        hilo_proceso hilo1 = new hilo_proceso();
        hilo_proceso hilo2 = new hilo_proceso();
        hilo_proceso hilo3 = new hilo_proceso();
        
        hilo1.start();// iniciamos el hilo
        try{
            hilo1.sleep(5000);// se pausa/duerme 5 segundos y pasando esos segundos se ejecuta.
        }catch(InterruptedException e){
            System.out.println("error en el hilo1: " + e);
        }
        hilo2.start();//
        try{
            hilo2.sleep(2500);
        }catch(InterruptedException e){
            System.out.println("error en :"+e);
        }
        hilo3.stop();// parar parar o matar un un hilo, es necesaria la propiedad .stop()
    }
}
