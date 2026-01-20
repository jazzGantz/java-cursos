/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package jared.excepcionestry;
import java.util.Scanner;
/**
 *
 * @author ClockSoft
 */
public class ExcepcionesTry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el 1er numeros a sumar");
        int num1 = sc.nextInt();
        System.out.println("Ingresa el 2do numeros a sumar");
        int num2 = sc.nextInt();
        try{
            int resultado =  
                    num1/num2;
            System.out.println("resultado :"+resultado);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Finalizado");
        }
        
    }
}
