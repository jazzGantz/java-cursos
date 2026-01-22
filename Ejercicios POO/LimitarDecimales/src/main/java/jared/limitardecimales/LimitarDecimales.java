

package jared.limitardecimales;

import java.text.DecimalFormat;


public class LimitarDecimales {

    public static void main(String[] args) {
        double numero = 2;
        double raiz = Math.sqrt(numero);
        System.out.println("la raiz cuadrada de: "+ numero+ " es:"+ raiz);
        
        //utilizando la clase decinal format
        DecimalFormat df = new DecimalFormat("#.00");// se coloca (#.) despues del punto siguen el numero de
        //decimales que queremos mostrar con la cantidad de ceros agregados.
        System.out.println("La raiz cuadrada de: "+numero+" es:"+ df.format(raiz));
        
        //UTILIZANDO String Format
        System.out.println("La raiz cuadrada de: "+numero+ " es:"+String.format("%.2f", raiz));
        //String format igual podemos manipular cuantos decimales decidamos mostrar
        //se coloca ("%.(Numero de decimales a mostrar)+f".
    }
}
