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
//Ler um vetor com 10 nomes e ordenalo
public class Exercicio4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String nomes[] = new String[10];
        String troca;
        
        for(int i=0; i<=9; i++){
            System.out.println("Entre com o valor para o nome referente ao indice "+(i+1));
            nomes[i] = input.next();
        }
        
        //rotina de ordenação
        for(int i=0; i<=8; i++){
            for(int j=i+1; j<=9; j++){
                if(nomes[i].compareTo(nomes[j])>0 ){
                    troca = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = troca;
                }
            }
        }
        
        for(int i=0; i<=9; i++){
            System.out.println(nomes[i]);
        }
    }
}
