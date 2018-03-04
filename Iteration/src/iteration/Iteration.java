/*
 Write a program to perform the following tasks: • Display numbers from 0 to 15 inclusive
• Display numbers from 15 to 0 inclusive
• Display numbers 10, 20, 30, 40, 50
• Display numbers 100, 80, 60, 40, 20, 0
@author Tola Otesanya
Iteraction - for loop Extra work
 */
package iteration;

/**
 *
 * @author tolaotesanya
 */
public class Iteration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        System.out.println("Welcome to the Iteration numbers");
        
        /* 
        for Loop exercise
        */
        System.out.println("\nFor loop");
        for(int i = 0; i < 16; i++){
            System.out.print(i +" \n");
        }
        for(int j = 15; j > 0; j--){
            System.out.print(j +" \n");
        }
        for(int k = 10; k < 60; k+=10){
            System.out.print(k +"\n");
        }
        for(int h = 100; h >= 0; h-=20){
            System.out.print(h +"\n");
        }
        
         /* 
        while Loop exercise
        */
        System.out.println("\nWhile loop");
        int i = 0;
        while(i < 16){
            System.out.println(i);
        i++;
        }
        
         /* 
        do while Loop exercise
        */
        System.out.println("\nDo While loop");
        int j = 10;
        do{
            System.out.println(j);
            j++;
        } 
        while(j < 20);
        
    }
    
}
