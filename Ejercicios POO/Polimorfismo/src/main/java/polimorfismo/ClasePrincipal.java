
package polimorfismo;


public class ClasePrincipal {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
  
        operaciones_clasePadre padre = new Suma_clase_hija();
        padre.pedirDatos();
        padre.operaciones();
        padre.MostrarResultado();
        
        System.out.print("Area de restar numeros");
        operaciones_clasePadre restpadre = new Resta_clase_hija();
        restpadre.pedirDatos();
        restpadre.operaciones();
        restpadre.MostrarResultado();
        
    
    }
    
    
}
