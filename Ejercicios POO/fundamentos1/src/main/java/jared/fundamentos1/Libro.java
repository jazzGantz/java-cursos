
package jared.fundamentos1;
import java.util.Scanner;

public final class Libro {
    private String titulo;
    private String autor;
    public int precio;
    private String tituloS;
    private String autorS;
    public int precioS;
    private Scanner sc = new Scanner(System.in);
    
    public  Libro(){
       System.out.println("Ingresa el titulo del libro: ");
       tituloS = sc.nextLine();
        SetTitulo(tituloS);
       
       System.out.println("Ingresa el AUTOR del libro: ");
       autorS = sc.nextLine();
        setAutor(autorS);
       
       System.out.println("Ingresa el PRECIO del libro: ");
       precioS = sc.nextInt();
       if(precioS > 0){
        setPrecio(precioS);
       }else{
           System.out.print("ERROR NOSE PUEDE COLOCAR NUMEROS NEGATIVOS");
        }
       
    }
    
    
    
    public void setPrecio(int precio){
     this.precio = precio;
    }
    
    public void SetTitulo(String Titulo){
     this.titulo = Titulo;
    }
    
    public void setAutor(String Autor){
     this.autor = Autor;
    }
    
    public String getTitulo(){
     return titulo;
    }
    
    public String getAutor(){
     return autor;
    }
    
    public int getPrecio(){
     return precio;
    }
    
    public void MostrarInfo(){
        
        System.out.println("El titulo del libre es: "+ getTitulo());
        System.out.println("El titulo del libre es: "+ getAutor());
        System.out.println("El titulo del libre es: "+ getPrecio());
    
    }
    
}
