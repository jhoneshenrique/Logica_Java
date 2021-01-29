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
//Ler quatro numeros e mostrar os que sao divisiveis por 2 e 3
public class Exercicio5 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a,b,c,d;
        
        System.out.println("Entre com o valor para a: ");
        a = input.nextInt();  
        System.out.println("Entre com o valor para b: ");
        b = input.nextInt();
        System.out.println("Entre com o valor para c: ");
        c = input.nextInt();
        System.out.println("Entre com o valor para d: ");
        d = input.nextInt();
        
        if(a%2==0 && a%3==0){
            System.out.println(a);
        }
        
        if(b%2==0 && b%3==0){
            System.out.println(b);
        }
        
        if(c%2==0 && c%3==0){
            System.out.println(c);
        }
        
        if(d%2==0 && d%3==0){
            System.out.println(d);
        }
    }
}
