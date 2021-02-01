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
//Fibonacci
public class Exercicio7 {
    public static void main(String args[]){
        int i = 1;
        int ant = 1;
        int prox = 0;

        
        System.out.println(1);
        while(i<=10){ 
            ant = ant + prox;
            prox = ant - prox;
            System.out.println(ant);
            i++;
        }
    }
}
