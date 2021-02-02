/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;
import java.util.Scanner;
 /*
 * @author Jhones
 */
//Ler 10 elementos de um vetor e apresentá-los. 
public class Exercicio1 {
    public static void main(String args[]){
        int array[] = new int[10];
        Scanner input = new Scanner(System.in);
        
        for(int i=0; i<=9; i++){
            System.out.println("Entre com o valor referente ao indice "+i);
            array[i] = input.nextInt();
        }
        
        for(int i=0; i<=9; i++){
            System.out.println("\nO valor na posicao de indice "+i+" e de :"+array[i]);
        }
    }
}
