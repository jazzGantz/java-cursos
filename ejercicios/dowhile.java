public class dowhile{
 public static void main(String[] args){
  //Estructura basica del do while
  //  do{
  //  instrucciones
  //  }while(condicion); //se coloca comillas porque while es una decision, no contiene codigo a realizar
  //Do while primero verifica sila condicionse cumple y despues procede a realizar los procesos.
  

   int cuenta = 10000;
   do{
      System.out.println(cuenta);
      cuenta-=200;
      System.out.println(cuenta);
   }while(cuenta != 0);  
 }

}