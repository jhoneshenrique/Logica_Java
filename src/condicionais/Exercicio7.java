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
//Ler um numero entre 1 a 9 e dizer se esta na faixa permitida
public class Exercicio7 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Entre com um numero");
        num = input.nextInt();
        
        if(num>=1 && num<=9){      
            System.out.println("Esta na faixa");
        }else{
            System.out.println("Esta fora da faixa");
        }
    }
}
