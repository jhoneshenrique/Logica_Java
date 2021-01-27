/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencial;

/**
 *
 * @author Jhones
 */

import javax.swing.JOptionPane;

//Converter o valor de uma temperatura de Celcius para Fahrenreit
public class Exercicio1 {
    public static void main(String args[]){
        float c;
        float f;
        
        c = Float.parseFloat(JOptionPane.showInputDialog("Entre com da temperatura em celcius"));
        f = (9*c+160)/5;
        JOptionPane.showMessageDialog(null,"O valor em Fahrenheit é "+f);
    }
}
