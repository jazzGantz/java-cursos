import java.util.Scanner;
public class inverText{
 public static void main(String[] args){
   String word = "";
   Scanner sc = new Scanner(System.in);
   System.out.println("Ingresa una palabra");
   word = sc.nextLine();
   for(int i > word.length()-1; i < word.length()-1; i--){
   System.out.println(word.charAt(i));
  }
 }
}