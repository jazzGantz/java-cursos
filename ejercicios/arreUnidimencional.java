import java.util.Scanner;
public class arreUnidimencional{
// lenght() =Indica caracteres pose una cadena de caracteres
//Metodo substring -> permite obtener una parte especifica de la cadena. 
// .substring(desde, hasta);
// Ejemplo carlos: .substring(0,4);
//resultado:
// carl
 
 public static void main(String[] args){
    String caracter = "";
    Scanner sc = new Scanner(System.in);
    int inicio = 0;
    int finalista = 0;
    System.out.println("Coloque una palabra");
    caracter = sc.nextLine();
    
    System.out.println("La palabra contiene :"+ caracter.length() + "caracteres");
    System.out.println("ingrese el inicio de impresion del texto");
    inicio = sc.nextInt();
    System.out.println("ingrese el final de impresion del texto");
    finalista = sc.nextInt();
    if (inicio >=0 && finalista <= caracter.length() && inicio <finalista){
    System.out.println(caracter.substring(inicio,finalista));
   }else{
    System.out.println("Error la longitud ingresada sobre pasa a ladel texto");
   }

 }
}