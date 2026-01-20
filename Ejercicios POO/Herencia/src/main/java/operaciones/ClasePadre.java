/*
La clase padre es la que debe de contener a llos atributos y metodos que se deben de heredar
*/

package operaciones;

import java.util.Scanner;
public class ClasePadre {
    protected int valor1, valor2, resultado;
    Scanner sc = new Scanner(System.in);
    
    public void pedirDatos(){
    System.out.print("Dame el primer valor: ");
    this.valor1 = sc.nextInt();
    System.out.print("Dame el segundo valor: ");
    this.valor2 = sc.nextInt();
    
    }
    
    //Metodo que muestra el resultado:
    public void MostrarResultado(){
      System.out.print(resultado);
    }
}
