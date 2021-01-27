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
//Calcular o preco de uma prestacao em atraso 
public class Exercicio5 {
    public static void main(String args[]){
        float taxa;
        float valor;
        float prestacao;
        float tempo;
        
        taxa = Float.parseFloat(JOptionPane.showInputDialog("Entre com a taxa"));
        valor = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor devido"));
        tempo = Float.parseFloat(JOptionPane.showInputDialog("Entre com o tempo de atraso em meses"));
        
        prestacao = valor + (valor * (taxa/100) * tempo);
        
        JOptionPane.showMessageDialog(null, "O valor corrigido e de "+prestacao);
    }
}
