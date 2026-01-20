package libreria;

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
        switch (tipoDeRopa) {
            case 1 -> {
                System.out.println("Ropa blanca / lavado suave");
                System.out.println("lavando");
                lavadoCompleto = 1;
            }
            case 2 -> {
                System.out.println("ropa de color / lavado seco");
                System.out.println("Lavando");
                lavadoCompleto = 1;
            }
            default -> {
                System.out.println("El tipo de ropa no esta disponibe");
                System.out.println("se lavara como ropa de color");
                lavadoCompleto =1;
            }
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
     
     //setter y getter
     //parapoder acceder a variables privadas es necesrario agregar getter y setter 
     //getter debe de ser forzosamente PUBLICO.
     
     //muestra el valor 
     public int getTipoDeRopa(){
         return tipoDeRopa;
     }
     
     //permitira modificar elvalor de un atributo desde cualquier clase con este metodo.
     
     //Los metodos set no retornan un valor de manera automatica y por ello debem de llevar (void)
     //(void)obligamos a un metodo nos retorne un valor, unresultado
     public void setTipoDeRopa(int tipoRopa){
         this.tipoDeRopa = tipoRopa;
     }
     
}
