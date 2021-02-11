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
public class Exercicio6 {
    public static void main(String args[]){
        int x;
        int a[] = new int[12];
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i<=11; i++){
            System.out.println("Entre com o valor para a posicao "+i);
            a[i] = input.nextInt();
        }
        
        for(int i=0; i<=10; i++){
            for(int j=i+1;j<=11; j++ ){
                if(a[i]<a[j]){
                    x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
        
        for(int i = 0; i<=11; i++){
            System.out.println("\nO valor da posicao "+i+" e "+a[i]);
        }
    }
}
