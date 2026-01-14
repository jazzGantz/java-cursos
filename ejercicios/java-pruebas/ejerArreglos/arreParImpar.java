import java.util.Scanner;
 //obtener cuantos numeros son pares y impares en un arreglo

public class arreParImpar{
 public static void main(String[] args){
  int arrays[] = new int[10];
  int numpar = 0;
  int numImp = 0;
  int incremento = 1; 
  for(int i = 0; i <arrays.length; i++){
   arrays[i] = incremento;
    incremento++;
  }

  for(int j =0; j < arrays.length; j++){
     if( arrays[j] % 2 == 0){
        numpar +=1;
        System.out.println("numero pare :"+arrays[j]);
     }else{
      System.out.println("numero impar :"+arrays[j]);
      numImp +=1;
     }
   }

  System.out.println("numeros par totales: "+numpar + " numeros impar : "+numImp);
 }
}