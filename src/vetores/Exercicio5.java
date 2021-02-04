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
//Pesquisar um nome em um vetor
public class Exercicio5 {
    public static void main(String args[]){
        String nomes[] = {"Pedro","Mario","Ana","Carlos","Renata","Thiago","Rodrigo'","isabela"};
        String pesq = null;
        int i = 0;
        boolean acha = false;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com o nome a ser pesquisado");
        pesq = input.next();
        
        while(i<=7 && acha==false){
            if(pesq.endsWith(nomes[i])){
                acha = true;
            }else{
                acha = false;
            }
            i++;
        }
        
        if(acha==true){
            System.out.println("O nome foi encontrado na posicao :"+i);
        }else{
            System.out.println("O nome nao foi encontrado");
        }
        
    }
}
