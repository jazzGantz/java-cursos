
package paquete1;

public class ClaseJavaUno {
    public static void main(String[] args){
        Atributo_Metodos mensajero = new Atributo_Metodos();// solo puede acceder a sus ATRIBUTOS YA QUE ESTAN 
        //DENTRO DEUN MISMO PAQUETE
        mensajero.SetvalorUno(12);//setmodoficamos el valor privado
        System.out.print( mensajero.getterValor_Uno());// mostramos el valor 
       
     
    }
}
