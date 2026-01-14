//arreglos bidimencionales

import java.util.Scanner;
public class vectorDinamico{
 public static void main(String[] args){
  int longitud = 0;
  Scanner sc = new Scanner(System.in);
  int valor = 0;

  System.out.println("Ingresa la longitud de numeros a encontrar");
  longitud = sc.nextInt();
  int arrays[] = new int[longitud];

  for(int i = 0; i <arrays.length; i++){
    System.out.println("Ingresa el dato a guardar :"+ (i+1));
    arrays[i] = sc.nextInt();
   }
   System.out.println("Numeros totales escritos:");
   for(int i = 0; i <arrays.length; i++){
    System.out.println(arrays[i]);
    
   }
 }
}