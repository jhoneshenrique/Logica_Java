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
//Ler um valor inteiro positivo ou negativo e apresentar o valor lido como sendo positivo
public class Exercicio3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Entre com um numero: ");
        num = input.nextInt();
        
        if(num<0){
            num = num * -1;
            System.out.println("O numero e: "+num);
        }else{
            System.out.println("O numero e: "+num);
        }
    }
}
