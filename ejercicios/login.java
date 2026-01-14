import java.util.Scanner;

public class login{
 public static void main(String[] args){
  String usuario ="";
  String contrasena = "";
  Scanner sc = new Scanner(System.in);
  System.out.println("Bienvenido al loggeo");
  System.out.println("Ingresa tu correo");
  usuario = sc.nextLine();
  System.out.println("Ingresa tu contraseña");
  contrasena = sc.nextLine();
  if(usuario.equalsIgnoreCase("Jared.gmail.com") && contrasena.equalsIgnoreCase("jared1")){
   System.out.println("Acceso correcto");
  }else{
    System.out.println("Dato erroneo");
   } 
 }
}