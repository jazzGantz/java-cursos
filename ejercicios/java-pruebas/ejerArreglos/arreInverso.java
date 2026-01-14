public class arreInverso{
 public static void main(String[] args){
  //crea un arreglo y imprimelo inversamente
  int incremento = 5;
  int arreglo[] = new int[5];
  for(int i= arreglo.length - 1; i>=0; i--){
  arreglo[i] = incremento;
  incremento --;
  System.out.println(arreglo[i]); 

}
  
 }
}