import java.util.Scanner;

public class scanner{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int num1=0, num2=0, resultado=0;
  String name="";

  System.out.println("Escribe tu nombre");
  name = sc.nextLine();
  System.out.println("Escribe el primer numero");
  num1 = sc.nextInt();
  System.out.println("Escribe el suegundo numero a sumar");
  num2= sc.nextInt();
  resultado = num1 + num2;
  System.out.println(name+" el resultado de los dos numeros es:"+ resultado);
 }
}