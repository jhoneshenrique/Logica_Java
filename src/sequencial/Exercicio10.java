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
//Conversor monetario real em dolar
public class Exercicio10 {
    public static void main(String args[]){
        float real, cotacao, dolar;
        
        real = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor em reais"));
        cotacao = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor da cotacao"));
        
        dolar = real / cotacao;
        
        JOptionPane.showMessageDialog(null, "O valor em dolar e de "+dolar);
    }
}
