package capitulo5.estudodecasogui.exercicios.exercicio2;

import javax.swing.*;

/**
 * @author augustobellinaso
 */
public class GraficoBarras {


    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 30: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 30: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 30: "));
        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 30: "));
        int num5 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 30: "));


        Barras b = new Barras(num1, num2, num3, num4, num5);

        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(b);
        app.setSize(300, 300);
        app.setVisible(true);
    }
}
