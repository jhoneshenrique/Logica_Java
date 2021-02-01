/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacos;
import java.util.Scanner;
/**
 *
 * @author Jhones
 */
//Fatorial de um numero
public class Exercicio2 {
    public static void main(String args[]){
        int num;
        int fat = 1;
        int i = 1;
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com o valor desejado");
        num = input.nextInt();
        
        while(i<=num){
            fat *= i;
            i++;
        }
        
        System.out.println("A fatorial e :"+fat);
    }
}
