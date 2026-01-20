
package jared.fundamentos1;
import java.util.Scanner;
public class Persona {
    public Scanner sc = new Scanner(System.in);
    private String nombre;
    private int edad;
    private int valor_edad;
    private String valor_nombre;
   
    public void pedirDatos(){
    System.out.println("Cual es tu nombre: ");
    valor_nombre = sc.nextLine();
        setNombre(valor_nombre);
    System.out.println("Cual es tu edad: ");
    valor_edad = sc.nextInt();
    if(edad > 0){
      setEdad(valor_edad);
    }else{
        System.out.println("La edad no debe de ser negativa");
     }   
    }
    
    public void MostrarDatos(){
     System.out.println("Tu nombre es: " + getNombre());
     System.out.println("Tu edad es: "+ getEdad());
    }
    
    
    public String getNombre(){
         return nombre;
    }
    
    public void setNombre(String nombre){
     this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    
}
