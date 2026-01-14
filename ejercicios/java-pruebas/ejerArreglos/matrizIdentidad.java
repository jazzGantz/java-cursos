import java.util.Scanner;
public class matrizIdentidad{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int valor = 0; 
  int matIdent = 1;
  System.out.println("Ingresa el numero de la matriz de indentidad");
  valor = sc.nextInt();


  int matrizValor[][] = new int[valor][valor];
  
  for(int i =0; i< matrizValor.length; i++){
    matrizValor[i][i]= matIdent;
  }

  for(int j= 0; j< matrizValor.length; j++){
   for(int i =0; i< matrizValor.length; i++){
    System.out.print("["+matrizValor[j][i]+"]");
  }
  System.out.println("");

}   


  
  
  
 }
}