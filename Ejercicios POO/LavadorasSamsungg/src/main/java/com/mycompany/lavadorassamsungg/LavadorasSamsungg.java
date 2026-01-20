

package com.mycompany.lavadorassamsungg;
import libreria.LLFuncionesss;
import java.util.Scanner;

public class LavadorasSamsungg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tipo de ropa (1) ropa blanca, (2)ropa color");
        int TipoDeRopa = sc.nextInt();
        System.out.println("¿Cuantos kilos de ropa?");
        int kilos = sc.nextInt();
        
        LLFuncionesss mensajero = new LLFuncionesss(kilos, TipoDeRopa);
        mensajero.setTipoDeRopa(2);
        System.out.print("El tipo de ropa es :"+mensajero.getTipoDeRopa());
        mensajero.CicloFinalizado();
    }
}
