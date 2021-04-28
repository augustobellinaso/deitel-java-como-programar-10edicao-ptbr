package capitulo5.estudodecasogui.exercicios.exercicio1;

import javax.swing.*;
import java.awt.*;

/**
 * @author augustobellinaso
 */
public class ConcentricCircles extends JPanel {

    private int raio;


    public ConcentricCircles(int raio) {
        this.raio = raio;
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int largura = getWidth();
        int altura = getHeight();

        for (int i = 0; i < 12; i++) {

            g.drawOval((largura / 2) - (raio + i * raio), (altura / 2) - (raio + i * raio), 2 * (raio + i * raio) , 2 * (raio + i * raio));

        }
    }
}
