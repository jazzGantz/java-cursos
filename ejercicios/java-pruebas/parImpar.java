import java.util.Scanner;
//numero par o impar
public class parImpar{
 public static void main(String[] args){
  int num1 = 0;
  Scanner sc = new Scanner(System.in);

  System.out.println("Ingresa el numero para saber si es par o impar");
  num1 = sc.nextInt();

  if(num1 % 2 == 0){
    System.out.println("Numero par");
  }
  else {
    System.out.println("numero impar");
  }

  
 }
}
