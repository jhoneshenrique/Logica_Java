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
//Calcular o volume de uma caixa retangular
public class Exercicio8 {
    public static void main(String args[]){
        float comprimento, largura, altura, volume;
        
        largura = Float.parseFloat(JOptionPane.showInputDialog("Entre com a largura"));
        comprimento = Float.parseFloat(JOptionPane.showInputDialog("Entre com o comprimento"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Entre com a altura"));
        
        volume = largura * comprimento * altura;
        
        JOptionPane.showMessageDialog(null, "O volume e "+volume);
    }
}
