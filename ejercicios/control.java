import java.util.Scanner;
public class control{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 String nombre;
 int clave;
 int antiguedad;
 System.out.println("Bienvenido al sistema vacacional de Coca-Cola Company");
 System.out.println("Cual esel nombre del trabajo");
 nombre = sc.nextLine();
 System.out.println("Cuantos años de servicio tiene en el trabajo");
 antiguedad = sc.nextInt();
 System.out.println("Cual es la clave deltrabajador?");
 clave = sc.nextInt();
 switch(clave){
  case 1:
   if(antiguedad == 1){
     System.out.println(nombre+" Tienes derecho a 6 dias");
   }else if(antiguedad >=2 && antiguedad <=6){
     System.out.println(nombre +" Tienes derecho a 14 dias");
  }else if(antiguedad == 7 ){
     System.out.println(nombre + "Tienes derecho a 20 dias");
   }
   break;

  case 2:
   if(antiguedad == 1){
    System.out.println(nombre+" Tienes derecho a 7 dias");
   }else if(antiguedad >=2 && antiguedad <=6){
    System.out.println(nombre +" Tienes derecho a 15 dias");
  }else if(antiguedad == 7){
     System.out.println(nombre + "Tienes derecho a 22 dias");
   }
    break;

  case 3:
   if(antiguedad == 1){
    System.out.println(nombre+" Tienes derecho a 10 dias");
   }else if(antiguedad >=2 && antiguedad <=6){
    System.out.println(nombre +" Tienes derecho a 20 dias");
  }else if(antiguedad == 7){
     System.out.println(nombre + "Tienes derecho a 30 dias");
   }
    
  default:
   System.out.println("error, numero de departamento no encontrado");
   break;
  } 
 }
}