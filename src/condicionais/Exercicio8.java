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
//Ler uma nota e falar se o aluno foi aprovado. Usar operador de condicao
public class Exercicio8 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int nota;
        
        System.out.println("Entre com a nota do aluno: ");
        nota = input.nextInt();
        
        System.out.println(nota>=7 ? "aprovado" : "reprovado");
    }
}
