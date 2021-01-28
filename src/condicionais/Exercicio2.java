/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionais;
import java.util.Scanner;
/**
 *
 * @author Jhones
 */
//Read two values and show the difference from the highers to the smaller 
public class Exercicio2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        
        System.out.println("Enter the value of the first number: ");
        number1 = input.nextInt();
        System.out.print("Enter the value of the second number: ");
        number2= input.nextInt();
        
        if(number1>number2){
            System.out.println("The difference is "+(number1-number2));
        }else{
            System.out.println("The difference is "+(number2-number1));
        }
        
    }
}
