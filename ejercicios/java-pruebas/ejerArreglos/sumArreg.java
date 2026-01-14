import java.util.Scanner;
// pide al usuario N numeros guardalos en un arreglo y muestra suma total y promedio
public class sumArreg{
 public static void main(){
  int cantidad;
  int incremento = 1;
  int total = 0;
  Scanner sc = new Scanner(System.in); 
  System.out.println("Suma de todos los arreglos");
  System.out.println("coloca la logitud del array");
  cantidad = sc.nextInt();
  int arreglo[] = new int[cantidad];

  for(int i = 0; i<arreglo.length; i++){
   arreglo[i] = incremento;
   incremento ++;
   System.out.print("["+arreglo[i]+"]");
   total = total + arreglo[i];  
  }
  System.out.println("total : "+ total);
  System.out.println("promedio :"+ (total/cantidad));
 }
}