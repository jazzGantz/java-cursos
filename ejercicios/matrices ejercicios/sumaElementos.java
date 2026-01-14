import java.util.Scanner;
//calcula y muestra la suma total de sus elementos
public class sumaElementos{ 
  public static void main(String[] args){
   int filas = 0;
   int columnas = 0;
   int incremento = 0;
   int total= 0;
   int total2 =0;
   Scanner sc = new Scanner(System.in);
   System.out.println("Ingresa el numero de filas que desas tener");
   filas = sc.nextInt();
   System.out.println("Ingresa el numero de columnas que deseas tener");
   columnas = sc.nextInt();
   int arreglosuma[][] = new int[filas][columnas];
   
   for(int j = 0; j < filas; j++){
    
    for(int i =0; i< columnas; i++){
     arreglosuma[j][i] = incremento;

     System.out.print("["+arreglosuma[j][i] +"]");
     total= (total + arreglosuma[j][i]);
     incremento ++;
   }
   System.out.println(total2 = total2 + total);
   total = 0;
  }
 }
}