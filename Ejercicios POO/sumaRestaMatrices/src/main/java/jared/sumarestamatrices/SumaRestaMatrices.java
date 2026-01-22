/*La suma de matrices solo se puede realizar entre matrices de la misma dimension
es decir, las mismas FILAS Y las mismas COLUMNAS por tal motivo la matriz
resultante tiene las mismas dimenciones
La suma se efectua en cad uno de los elementos correspondientes a cda matriz en su posision actual,
es decir, se sumara la posicion matriz[0,0] con la posicion matrizDos[0,0] y el resultado se guardara
en matrizResultado[0,0];. 
*/
package jared.sumarestamatrices;

/**
 *
 * @author ClockSoft
 */
public class SumaRestaMatrices {

    public static void main(String[] args) {
        int matriz_1[][] = new int[3][3];
        int matriz_2[][] = new int[3][3];
        int matriz_Resultante[][] = new int[3][3];
        //llenado de la primera clase
        for( int j =0; j<matriz_1.length; j++){
         for(int i = 0; i<matriz_1.length; i++){
             matriz_1[j][i] = (int)(Math.random()*10);
         }
        }
        //llenado de la segunda clase
        for(int j=0; j< matriz_2.length; j++){
         for(int i=0; i< matriz_2.length; i++){
          matriz_2[j][i] = (int) (Math.random()*100);
         }
        }
        
        //suma o resta
        for(int j=0; j<matriz_1.length; j++){
         for(int i=0; i< matriz_2.length; i++){
          matriz_Resultante[j][i] = matriz_1[j][i] + matriz_2[j][i];
         }
        }
        
        
        //IMPRIMIR
        for (int j = 0; j < matriz_1.length; j++) {

    // matriz 1
    for (int i = 0; i < matriz_1[j].length; i++) {
        System.out.print("[ " + matriz_1[j][i] + " ]");
    }

    if (j == 1) System.out.print("   +   ");
    else System.out.print("       ");

    // matriz 2
    for (int i = 0; i < matriz_2[j].length; i++) {
        System.out.print("[ " + matriz_2[j][i] + " ]");
    }

    if (j == 1) System.out.print("   =   ");
    else System.out.print("       ");

    // matriz resultante
    for (int i = 0; i < matriz_Resultante[j].length; i++) {
        System.out.print("[ " + matriz_Resultante[j][i] + " ]");
    }

    System.out.println();
}

        
        
        /*imprimir
        for(int j= 0; j < matriz_1.length; j++){
            
         for(int i = 0; i< matriz_1.length; i++){
          System.out.print("[ "+ matriz_Resultante[j][i]+" ]");
         }
         if(j==1){
             System.out.print("   +   ");
         }else{
             System.out.print("       ");
         }
       
         for(int i =0; i<matriz_2.length; i++){
          System.out.print("[ "+ matriz_2[j][i]+" ]");
         }
          
         if(j==1){
             System.out.print("   =   ");
         }else{
             System.out.print("       ");
         }
         
         
         for(int i = 0; i<matriz_Resultante.length; i++){
            System.out.print("[ "+ matriz_Resultante[j][i]+ " ]");
         }
         System.out.println("");
        }
         System.out.println("");
         */
         
         
         
        
 
        
    }
}
