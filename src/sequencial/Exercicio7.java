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
//Apresentar o quadrado do numero
public class Exercicio7 {
    public static void main(String args[]){
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor para N"));
        n = n*n;
        JOptionPane.showMessageDialog(null, "O valor de N ao quadrado e "+n);
    }
}
