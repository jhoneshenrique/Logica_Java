/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;
import java.util.Scanner;
/**
 *
 * @author Jhones
 */
//Ler 8 elementos de uma matriz A, criar uma matriz b com os elementos de a multiplicados por 3
public class Exercicio2 {
    public static void main(String args[]){
        int a[] = new int[8];
        int b[] = new int[8];
        Scanner input = new Scanner(System.in);
        
        for(int i=0; i<=7; i++){
            System.out.println("Entre com o valor para a posicao :"+i);
            a[i] = input.nextInt();
        }
        
        for(int i=0; i<=7; i++){
            b[i] = a[i]*3;
        }
        
        for(int i=0; i<=7; i++){
            System.out.println("\nO valor na posicao de indice "+i+" e de :"+b[i]);
        }
        
    }
}
