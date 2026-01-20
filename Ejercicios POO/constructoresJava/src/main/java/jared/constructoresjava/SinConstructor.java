
package jared.constructoresjava;
import java.util.Scanner;

public class SinConstructor {
    private Scanner sc = new Scanner(System.in);
    String nombre="";
    
    public void perdirNombre(){
        System.out.print("Cual es tu nombre: ");
        nombre = sc.nextLine();
    }
    
    public void imprimir(){
     System.out.print("Tu nombre es: "+nombre);
    }
}
