package com.mycompany.curso.java;
import java.util.Scanner;
public class CursoJava {

    public static void main(String[] args) {

        String word= " ";
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ingrea una Palabra invertida");
        word = sc.nextLine();
        //logitudPalabra = word.length();
        for(int i= word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));
        }
        
        
        
    }
}
