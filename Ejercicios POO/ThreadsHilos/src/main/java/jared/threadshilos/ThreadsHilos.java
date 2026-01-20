package jared.threadshilos;

public class ThreadsHilos{

    public static void main(String[] args) {
        
        proceso1 hilo1 = new proceso1(); // la clase que tenga extends se instancia normal.
        Thread hilo2 = new Thread(new proceso2());// la clase que contenga implments se debe de instanciar de esta otra manera;
        
        //Si queremos volver a ejecutar el hilo2, solo es volver a instanciar la clase y mandar a llamar el mismo metodo
        Thread hilo2clon = new Thread(new proceso2());
        
        hilo1.start(); hilo2.start(); hilo2clon.start(); // metodo para ejecutar/ iniciar los hilos
        // no tienen orden de ejcucion, eso depende de nuestra cpu
    }
}
