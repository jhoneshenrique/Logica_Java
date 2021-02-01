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
//Mostrar os 20 primeiros valores impares
public class Exercicio6 {
    public static void main(String args[]){
        int i = 1;
        
        do{
            System.out.println(i%2!=0?i:"");
            i++;
        }while(i<=20);
    }
}
