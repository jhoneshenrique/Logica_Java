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
//Mostrar a tabuada de um numero qualquer
public class Exercicio3 {
    public static void main(String args[]){
        int num;
        int i = 1;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com o valor desejado");
        num = input.nextInt();
        
        while(i<=10){
            System.out.println(num+" X "+i+" = "+(num*i));
            i++;
        }
    }
}
