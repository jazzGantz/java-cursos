import java.util.Scanner;
//Buscar un número

//Crea un arreglo de 10 números.

//Pide un número al usuario.

//Indica si el número está en el arreglo y en qué posición.
public class searchnumarray{
 public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   int incremento = 1;
   int arreglo[] = new int[10];
   int numero = 0;
   for(int i= 0; i<arreglo.length; i++){
    arreglo[i] = incremento;
    incremento++;
  }
  

  System.out.println("Ingresa el numero a buscar en el arreglo");
  numero = sc.nextInt();
  int in = 0;
  for( in = 0 ; in< arreglo.length; in++){
    if(arreglo[in] == numero){
      System.out.println("Se encontro el numero: "+ numero + " en la posicion :"+ in);
    }
  }
 }
}