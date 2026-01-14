public class fibinacci{
 public static void main(String[] args){
//--------------------------------------------------------

  int a = 0;
  int b = 1;
   int c = 0;
 System.out.print("serie fibbonacci con for");
  for(int i = 0; i<10; i++){
    System.out.print(a+ ",");
    c = a+b;
    a= b;
    b=c;
  }
//-----------------------------------------------------------

  int uno = 0;
  int dos = 1;
  int result = 0;
  int i = 0;
  System.out.print("Fibbonacci con while");
   while(i < 10){
    System.out.print(uno+",");
    result = uno + dos;
    uno = dos;
    dos = result;
   i++;
  }



 }
}