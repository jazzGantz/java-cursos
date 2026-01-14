import java.util.Scanner;
public class viajes{
 public static void main(String[] args){
  //desarrolla un programa donde el el usuario coloque los minutos de cada viaje y al presionar cero el programa termina y da como resultado ya seaen minutos 
  // y si suman mas de una hora muestra hora y minutos
  

  int sumaTotal = 0;
  int viaje;
  Scanner sc = new Scanner(System.in);
  int incremento = 1;
  System.out.println("----------------------------Bienvenido al sistema de viajes----------------");
  do { 
  
    System.out.println("Ingresa los minutos del" + " ("+ incremento+ ") " + "viaje.");
    viaje = sc.nextInt();

    if(viaje > 0){
       sumaTotal += viaje;
       incremento++;
     }
    
  }while(viaje  != 0);

   if(sumaTotal < 60){
     System.out.println("la suma del tiempo total detus viajes fue de: "+ sumaTotal + " Minutos.");
   }else if(sumaTotal > 60){
      System.out.println("La hora total fue de: "+ sumaTotal/60 + ":"+ (sumaTotal % 60)+ "horas.");
    }

 }
}