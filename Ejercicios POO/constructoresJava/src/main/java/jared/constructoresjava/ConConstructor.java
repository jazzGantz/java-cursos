
package jared.constructoresjava;
import java.util.Scanner;

public class ConConstructor {
    
    public ConConstructor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Tu nombre es: "+ nombre);
    }
    
}
