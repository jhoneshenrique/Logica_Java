/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionais;
import java.util.Scanner;
/**
 *
 * @author Jhones
 */
//Ler quatro notas e apresentar a media
public class Exercicio4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        float n1,n2,n3,n4,media;
        
        System.out.println("Entre com a nota 1: ");
        n1 = input.nextInt();
        System.out.println("Entre com a nota 2: ");
        n2 = input.nextInt();
        System.out.println("Entre com a nota 3: ");
        n3 = input.nextInt();
        System.out.println("Entre com a nota 4: ");
        n4 = input.nextInt();
        
        media = (n1+n2+n3+n4)/4;
        
        if(media >= 5){
            System.out.println("Aprovado com a media "+media);
        }else{
            System.out.println("Reprovado com a media "+media);
        }
    }
}
