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

//Calcular e apresentar o valor do volume de uma lata de óleo
public class Exercicio3 {
    public static void main(String args[]){
        double raio;
        double altura;
        double volume;
        
        raio = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do raio da lata"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Entre com a altura da lata"));
        
        volume = 3.14159* (raio*raio) * altura;
        
        JOptionPane.showMessageDialog(null,"O volume da lata é de "+volume);
    }
}
