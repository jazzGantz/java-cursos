/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package jared.numaleatorios;

import java.util.Random;

/**
 *
 * @author ClockSoft
 */
public class NumAleatorios {

    public static void main(String[] args) {
        int aleatorio = 0;
        aleatorio = (int)(Math.random() * 100);
        System.out.println(aleatorio);
        
        
        //Segunda forma de imprimir ramdon
        int aleatorio2 = 0;
        
        Random r = new Random();
        aleatorio2 = (int)(r.nextDouble()*100);
        System.out.println("Random: "+aleatorio2);
    }
}
