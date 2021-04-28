package capitulo5.estudodecasogui.exercicios.exercicio1;

import javax.swing.*;

/**
 * @author augustobellinaso
 */
public class ConcentricCirclesTest {

    public static void main(String[] args) {

        ConcentricCircles cc = new ConcentricCircles(10);

        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(cc);
        app.setSize(300, 300);
        app.setVisible(true);

    }
}
