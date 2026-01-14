import java.util.Scanner;
public class telegrafo{
 public static void main(String[] args){
//ejercicio:
//dado un mensaje se debe de calcular su costo para enviar por telegrafo. para esto se sabe que cada letra cuesta $10,
//los caracteres especiales que no sean letras cuestan $30 y los digitos tienen un valor de $20 cada uno. Los espacios no tienen valor .
//su mensaje debe de ser un String, las letras del castellano á,ñ,é,í,ó,ú se consideran caracteres especiales. ejemplos:
//¡Feliz Aniversario!, su mensaje cuesta $190.

  Scanner sc = new Scanner(System.in); 
  String mensaje = "";
  int costoTotal = 0;
  System.out.println("Bienvenido al envio de telegrafos");
  System.out.println("Ingrese el mensaje a enviar");
  mensaje = sc.nextLine();
  
  for(int i=0; i<mensaje.length(); i++){
     char c = mensaje.charAt(i);
     System.out.println(c);
    //Espacios no cuestan
    if(c == ' '){
      continue;
    }
    
    if((c >= 'A' && c <= 'Z') || c >= 'a' && c <= 'z'){
       costoTotal +=10;
       System.out.println(costoTotal);

     } else if (Character.isDigit(c)){
       costoTotal +=20;
       System.out.println(costoTotal);

     }else{
        costoTotal +=30;
       System.out.println(costoTotal);
      }
 
   }
    System.out.println("El costo total de su mensaje fue de: "+costoTotal);
    sc.close();
 }
}