public class cadenarara{
 public static void main(String[] args){ 
  //0,99,2,98,3,97,4,96,5,95 etc
  System.out.println("Serie con FOR segunda cadena");

    int i = 1, j = 99;
   for(i=1; i <=5; i++){
    if(i < 5){
     System.out.print(i + " ,");
     System.out.print(j + " ,");
    }else{
     System.out.print(i + " ,");
     System.out.print(j + " ,");
     }
    j--; 
   }


  i = 1;
  j = 99;




  System.out.println("Serie con while");
  while(i <= 5){
     if(i < 5){
     System.out.print(i + " ,");
     System.out.print(j + " ,");
    }else{
     System.out.print(i + " ,");
     System.out.print(j + " ,");
     }
    j--;
    i++; 
   }

   i = 1;
   j = 99;
   System.out.println("Serie con do while");
   do{
      if(i<5){ 
       System.out.println(i + ",");
       System.out.println(j +",");
       i++;
       j--;
     }
    }while(i<5);

  } 
}


