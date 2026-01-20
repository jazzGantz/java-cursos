
package main;
import operaciones.ClaseHija_resta;
import operaciones.ClaseHija_suma;
//no es necesario importar a las clases hijas ya que esas clases contienen la informacion de la clase padre
public class ClasePrincipal {
    public static void main(String[] args){
    ClaseHija_suma sumar = new ClaseHija_suma();
    sumar.pedirDatos();
    sumar.suma();
    System.out.print("El resultado de la suma es : ");
    sumar.MostrarResultado();
    ClaseHija_resta restar = new ClaseHija_resta();
    restar.pedirDatos();
    restar.restar();
    System.out.print("El resultado de tu resta es de: ");
    restar.MostrarResultado();
    }
}
