public class arreUnidimencional1{
 public static void main(String[] args){

  int arreglo1[] = new int[10];// para obtener longitud de array solo es length, esto no: length();
  	arreglo1[0] = 1;
	arreglo1[1] = 11;
	arreglo1[2] = 12;
	arreglo1[3] = 13;
	arreglo1[4] = 14;
	arreglo1[5] = 15;
	arreglo1[6] = 16;
	arreglo1[7] = 17;
	arreglo1[8] = 18;
	arreglo1[9] = 19;
   for(int i=0; i< arreglo1.length; i++){// recordatorio no colocar >= o <= en arrays
   System.out.println("lugar :"+ arreglo1[i]);
  }

 }

}