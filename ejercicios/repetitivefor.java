import java.util.Scanner;
public class repetitivefor{
 public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  //for(inicio; condicion; incremento){ 
  //instruccion
  //}


   for(int i= 100; i>0; i--){
    System.out.println("descendente" + i);
   }
	//imprime numeros de dos en dos
   for(int i=0; i<21; i+=2){
    System.out.println(i);
   }

	//imprime una palabra 5 veces usando for
   for(int i=0; i<5; i++){
     System.out.println("palabra");
   }

   //calcula la suma de los numeros del 1 al 10
   for(int i=1; i<11; i++){
     int total = 0;
     total += i;
     System.out.println(total);
   }
 
   //pide un numero y mestra su tabla de multiplicar del 1 al 10
   //System.out.println("Inserta el numero para conocer la tabla de multiplicar");
   //int numero = sc.nextInt();
   //for(int i=1; i<11; i++){
    //System.out.println(numero +" * "+" "+i+ " =" + numero*i);
   //}
   
   //Dado un string, recorre con un for y cuenta cuantos caracteres
   String word = "pelicano";
   int contador = 0;
   for(int i=0; i< word.length(); i++){
    contador++;
   }
    System.out.println("la longitud es de: "+contador);

  //Dado un String Mostrar cada letra en una linea diferente
   //for(int i = 0; i<word.length(); i++){
   //System.out.println(word.charAt(i));
   //}

   //dibuja un cuadrado de asteriscos
   for(int i =0; i<7; i++){
    System.out.println("*****");
   }

	//Crea untriangulo con asteriscos
   String linea = "";
   for(int i =1; i<= 6; i++){
   linea = linea + "*";
   System.out.println(linea); 
}


   
   

 }
}