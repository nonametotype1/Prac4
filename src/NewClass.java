/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vicent Ng
 */
public class NewClass {
    
    public static void displaySquareRoot(int max){
        
        System.out.println("Number  SquareRoot");
        
        for(int i=0; i<=max; i+=2){
            System.out.printf("%d \t %.4f\n" , i , Math.sqrt(i));
        }
    }
    
    public static void main(String[] args){
        displaySquareRoot(20);
    }
}
