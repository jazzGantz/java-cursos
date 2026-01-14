import java.util.Scanner;
//calcula y muestra la suma total de sus elementos columna
public class sumaElementosColumna{ 
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
   
   for(int j = 0; j < columnas; j++){
    int sumaColumna=0;
    for(int i =0; i< filas; i++){
     
     arreglosuma[i][j] = incremento;

     System.out.print("["+arreglosuma[i][j] +"]");
     total= (total + arreglosuma[i][j]);
     incremento ++;
     sumaColumna += arreglosuma[i][j];

   }
   System.out.println(" por fila es:" +sumaColumna +" y total es: ");
   
  }

//----------------------------------------------------------------------
for(int i = 0; i < filas; i++){
    int sumaFilas=0;
    for(int j =0; i< columnas; j++){

     System.out.print("["+arreglosuma[i][j] +"]");
     total= (total + arreglosuma[i][j]);
     sumaFilas += arreglosuma[i][j];

   }
   System.out.println(" por fila es:" +sumaFilas +" y total es: ");
   
  }
 }
}