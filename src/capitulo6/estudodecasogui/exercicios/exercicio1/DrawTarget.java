package capitulo6.estudodecasogui.exercicios.exercicio1;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;

/**
 * @author augustobellinaso
 */
public class DrawTarget extends JPanel {

    private static final SecureRandom secureRandom = new SecureRandom();

    public static final int LARGURA = 600;
    public static final int ALTURA = 600;
    public static final int RAIO = 50;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Color cor1 = new Color(secureRandom.nextInt(256), secureRandom.nextInt(256), secureRandom.nextInt(256));
        Color cor2 = new Color(secureRandom.nextInt(256), secureRandom.nextInt(256), secureRandom.nextInt(256));


        for (int i = 10; i >= 1; i--) {
            Color cor = (i % 2 == 0) ? cor1 : cor2;
            g.setColor(cor);

            g.fillOval((LARGURA / 2) - ((RAIO / 2) * i),
                    (ALTURA / 2) - ((RAIO / 2) * i),
                    i * RAIO,
                    i * RAIO);
        }
    }

    public static void main(String[] args) {
        DrawTarget panel = new DrawTarget();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(LARGURA, ALTURA);
        app.add(panel);
        app.setVisible(true);
    }
}
