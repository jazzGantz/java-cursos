
package polimorfismo;


public abstract class Suma_clase_hija extends operaciones_clasePadre{
    
    //realizamos sobre escribir un metodo, es necesario colocar @Override
    //y cuando nosotros vamos a sobreescribir un metodo es porque ya esta declarado previamente en otra clase
    @Override
    public void operaciones(){
     resultado = (valor1 + valor2);
    }
      
}
