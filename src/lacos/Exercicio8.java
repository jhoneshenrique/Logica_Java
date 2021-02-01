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
//Somatorio Fatorial
public class Exercicio8 {
    public static void main(String args[]){
        int sum = 0;
        int j;
        int fat;
        int num;
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i<=2; i++){
            System.out.println("Entre com o valor do "+i+1+"o numero");
            num = input.nextInt();
            fat = 1;
            j=1;
            while(j<=num){
                fat*=j;
                j++;
            }
            sum += fat;
        }
        
        System.out.println("O valor da soma e :"+sum);
    }
}
