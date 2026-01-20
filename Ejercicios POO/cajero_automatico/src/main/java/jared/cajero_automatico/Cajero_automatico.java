
package jared.cajero_automatico;

import jared.cajero_automatico.funciones_cajero.ClasePrincipal;
import jared.cajero_automatico.funciones_cajero.ConsultaSaldo;

public class Cajero_automatico {

    public static void main(String[] args) {
        ClasePrincipal ClasePadre_abstract = new ConsultaSaldo();
        ClasePadre_abstract.setSaldo(500);
        ClasePadre_abstract.operaciones();
        
        
        
        
        
    }
}
