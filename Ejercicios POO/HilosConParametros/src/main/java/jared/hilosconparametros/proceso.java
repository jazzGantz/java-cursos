/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jared.hilosconparametros;

public class proceso extends Thread {
    int numero;
    
    public proceso(String nombreHilo){
      super(nombreHilo);// pide un parametro String de entrada en las funciones que instancien y tenga un constructor, este valor se manda a traer con getName().
    }
    
    @Override
    public void run(){
        for(int i = 0; i<= numero;i++){
         System.out.println(i+ this.getName());// el metodo constructor pide un nombre hilo y al imprimir, la propiedad getName() obtiene el dato de 
         //constructor que es el string y con for imprime los hilos mas el nombre de cda parte de nombre del hilo que corresponde cada unode esos procesos.
        }
        System.out.println("");
    }
    
    public void numValorCondicion(int numero){
        this.numero = numero;
    }
    
}
