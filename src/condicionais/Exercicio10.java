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
//Ler um numero e dizer se e divisivel por 5
public class Exercicio10 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.println("Entre com um numero: ");
        num = input.nextInt();
        
        System.out.println(num%5==0 ? "E divisivel por 5" : "Nao e divisivel por 5");
    }
}
