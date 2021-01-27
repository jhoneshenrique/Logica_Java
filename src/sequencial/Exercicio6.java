/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencial;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhones
 */
//Trocar valores das variaveis
public class Exercicio6 {
    public static void main(String args[]){
        int a,b,c;
        a = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor para a"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor para b"));
        
        c = a;
        a = b;
        b = c;
        
        JOptionPane.showMessageDialog(null,"O valor de a e: "+a+" e o valor de b e: "+b);
    }
}
