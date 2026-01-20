package jared.hilosconparametros;

public class HilosConParametros{

    public static void main(String[] args) {
        proceso hilo1 = new proceso(" hilo1");
        proceso hilo2 = new proceso( " hilo2");
        proceso hilo3 = new proceso(" hilo3");
        hilo1.numValorCondicion(10);
        hilo2.numValorCondicion(16);
        hilo2.numValorCondicion(10);
        hilo1.start(); hilo2.start(); hilo3.start();
        
    }
}
