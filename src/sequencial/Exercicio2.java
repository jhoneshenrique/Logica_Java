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
//Converter uma temperatura de Fahrenheit para Celcius
public class Exercicio2 {
    public static void main(String args[]){
        float c;
        float f;
        
        f = Float.parseFloat(JOptionPane.showInputDialog("Entre com a temperatura em Fahrenheit"));
        c = (float) ((f-32)*0.555);
        JOptionPane.showMessageDialog(null, "A temperatura em celcius e "+c);
    }
}
