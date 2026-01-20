
package polimorfismo;
import java.util.Scanner;


//Se agrega igual abstract en la clase
public abstract class operaciones_clasePadre {
    
    
    //Atributos:
    protected int valor1, valor2, resultado;
    Scanner sc = new Scanner(System.in);
    
    public void pedirDatos(){
    System.out.print("Dame los datos del 1er numero: ");
    valor1 = sc.nextInt();
    System.out.print("Dame los datos del 2do numero: ");
    valor1 = sc.nextInt();
    }
    //METODOS polimorfismo:
    //crear un metodo que se comporte de diferente manera, dependiendo de la 
    //clase a la que se este comunicando.
     /*
    Se agrega (abstract) a los metodos y a la clase para comenzar a realizar el polimorfismo.
    
    Un metodo abstract no puede contener instrucciones dentro de si, solo se puede declarar. 
    
    esto no  x:
     public abstract void operaciones(){
       Instrucciones para llegar a lo cometido
     }
    
    
    Esto si
    
    public abstract void operaciones();
    */
    public abstract void operaciones();//dedeclara pero nose puede colocar logica
    
    public void MostrarResultado(){
        System.out.println(resultado);
    }
}
