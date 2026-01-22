/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package jared.multiplicacionmatrices;

/**
 *
 * @author ClockSoft
 */
public class MultiplicacionMatrices {

    public static void main(String[] args) {
        int matriz_uno[][] = new int[2][3];
        int matriz_dos[][] = new int[3][2];
        int matriz_resultante[][] = new int[2][2];
        
        //LLENADO DE LA LIST 1
                
        for(int j = 0; j<2; j++){
            for(int i= 0; i <3;i++){
             matriz_uno[j][i] = (int)(Math.random()*5);
            }
        }
        //llenado de matriz 2
        for(int j = 0; j<3; j++){
            for(int i= 0; i <2;i++){
             matriz_dos[j][i] = (int)(Math.random()*5);
            }
        }
        
        //Impresion de matrices 1
        for(int j = 0; j<matriz_uno.length; j++){
            for(int i= 0; i <matriz_uno.length; i++){
             System.out.print("["+ matriz_uno[j][i]+"]"); 
            }
        }
        
        //Impresion de matrices 1
        
        
       
        
    }
}
