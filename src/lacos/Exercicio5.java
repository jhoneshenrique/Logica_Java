/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacos;

/**
 *
 * @author Jhones
 */
//Somatorio dos pares de 1 ate 500
public class Exercicio5 {
    public static void main(String args[]){
        int i = 1;
        int sum = 0;
        
        do{
            if(i%2==0){
                sum += i;
            }
            i++;
        }while(i<=100);
        
        System.out.println(sum);
    }
}
