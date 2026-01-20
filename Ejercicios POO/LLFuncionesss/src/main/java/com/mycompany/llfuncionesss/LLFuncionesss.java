
package com.mycompany.llfuncionesss;

public class LLFuncionesss {
    private int kilos = 0;
    private int llenadoCompleto = 0;
    private int tipoDeRopa =0;
    private int lavadoCompleto =0;
    private int secadoCompleto =0;
    
    public LLFuncionesss(int kilos, int tipoDeRopa){
        this.kilos = kilos;
        this.tipoDeRopa = tipoDeRopa;
    }
    
    private void llenado(){
        if(kilos <= 12){
            llenadoCompleto = 1;
            System.out.println("Llenando..........");
            System.out.println("Llenado completo");
        }else{
            System.out.println("reduce la carga de ropa");
        } 
    }
    
    private void lavado(){
    llenado();
    if(llenadoCompleto == 1){
        if(tipoDeRopa == 1){
            System.out.println("Ropa blanca / lavado suave");
            System.out.println("lavando");
            lavadoCompleto = 1;
        }else if(tipoDeRopa == 2){
         System.out.println("ropa de color / lavado seco");
         System.out.println("Lavando");
         lavadoCompleto = 1;
        }else{
            System.out.println("El tipo de ropa no esta disponibe");
            System.out.println("se lavara como ropa de color");
            lavadoCompleto =1;
        }
     }
    }
    
    private void secado(){
     lavado();
        if(lavadoCompleto == 1){
        System.out.println("Secando");
        System.out.println("Secado Completo");
        secadoCompleto = 1;
     } 
    } 
    
     public void CicloFinalizado(){
      secado();
      if(secadoCompleto == 1){
          System.out.println("Se ha secado tu ropa");
      }}      
}
