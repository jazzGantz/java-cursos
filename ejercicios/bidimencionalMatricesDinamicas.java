import java.util.Scanner;
public class bidimencionalMatricesDinamicas{
 public static void main(String[] args){

  int incremento = 1;
  int filas = 0;
  int columnas = 0;
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Arreglo bidimencional");
  System.out.println("Ingresa el numero de filas que deseas obtener");
  filas = sc.nextInt();
  System.out.println("Ingresa el numero de columnas que deseas obtener");
  columnas = sc.nextInt();
  int matbidimenDinamic[][] = new int[filas][columnas];
  for(int j = 0; j < filas; j++){
      for(int i = 0; i < columnas; i++){ 
        matbidimenDinamic[j][i] = incremento;
    	incremento++;
   	System.out.print("["+ matbidimenDinamic[j][i] + "]");
   }
   System.out.println("");
  }
  
  
 }
}