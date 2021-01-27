/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionais;
import javax.swing.JOptionPane;
/**
 *
 * @author Jhones
 */
//Verificar se e triangulo e qual seu tipo
public class Exercicio1 {
    public static void main(String args[]){
        int a,b,c;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de B"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de C"));
        
        if((a<b+c)&&(b<a+c)&&(c<a+b)){
            if(a==b&&b==c){
                JOptionPane.showMessageDialog(null,"Triangulo Equilatero");
            }else{
                if(a==b||b==c||a==c){
                    JOptionPane.showMessageDialog(null,"Trianulo Isosceles");
                }else{
                    JOptionPane.showMessageDialog(null,"Triangulo Escaleno");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Nao e triangulo");
        }
        
    }
}
