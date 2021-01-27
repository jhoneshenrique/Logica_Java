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
//O quadrado da diferenca de um numero por outro
public class Exercicio9 {
    public static void main(String args[]){
        int a, b;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de B"));
        
        JOptionPane.showMessageDialog(null,"O valor do quadrado da diferenca de A por B e "+((a-b)*(a-b)));
        
    }
}
