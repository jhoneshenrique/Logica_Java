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
//Calcular e apresentar a quantidade de litros de combustivel gasta em uma viagem 
//utilizando um automovel que faz 12km por litro.

public class Exercicio4 {
    public static void main(String args[]){
        float tempoGasto;
        float velocidadeMedia;
        float distancia;
        float litrosUsados;
        
        tempoGasto = Float.parseFloat(JOptionPane.showInputDialog("Entre com o tempo gasto"));
        velocidadeMedia = Float.parseFloat(JOptionPane.showInputDialog("Entre com a velocidade media"));
        
        distancia = tempoGasto * velocidadeMedia;
        litrosUsados = distancia / 12;
        
        JOptionPane.showMessageDialog(null, "O carro gastou "+litrosUsados+" na viagem");
        
    }
}
