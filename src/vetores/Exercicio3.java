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
//Ler uma matriz A de 15, construir uma matriz B da mesma dimensão onde cada elemento de B é a fatorial correpondente de A 
public class Exercicio3 {
    public static void main(String args[]){
        int a[] = new int[15];
        int b[] = new int[15];
        Scanner input = new Scanner(System.in);
        int fat; 
        int j;
        
        for(int i=0; i<=14; i++){
            System.out.println("Entre com o valor referente ao indice :"+(i+1));
            a[i] = input.nextInt();
        }
        
        for(int i=0; i<=14; i++){
            fat = 1;
            j = 1;
            while(j<=a[i]){
                fat *= j;
                j++;
            }
            b[i] = fat;
        }
        
        for(int i=0; i<=14; i++){
            System.out.println("O valor da fatorial de "+a[i]+" e de "+b[i]);
        }    
    }
}
