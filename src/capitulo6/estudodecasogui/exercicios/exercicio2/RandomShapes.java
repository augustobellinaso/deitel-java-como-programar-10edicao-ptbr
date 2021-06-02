package capitulo6.estudodecasogui.exercicios.exercicio2;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;

/**
 * @author augustobellinaso
 */
public class RandomShapes extends JPanel {

    private static final SecureRandom secureRandom = new SecureRandom();

    public static final int LARGURA = 600;
    public static final int ALTURA = 600;
    public static final int RAIO = 50;


    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                g.setColor(new Color(secureRandom.nextInt(256), secureRandom.nextInt(256), secureRandom.nextInt(256)));
                g.fillRect(secureRandom.nextInt( LARGURA),
                        secureRandom.nextInt(ALTURA),
                        secureRandom.nextInt(LARGURA / 2),
                        secureRandom.nextInt(ALTURA / 2));
            } else {
                g.setColor(new Color(secureRandom.nextInt(256), secureRandom.nextInt(256), secureRandom.nextInt(256)));
                g.fillOval(secureRandom.nextInt( LARGURA),
                        secureRandom.nextInt(ALTURA),
                        secureRandom.nextInt(LARGURA / 2),
                        secureRandom.nextInt(ALTURA / 2));
            }
        }
    }

    public static void main(String[] args) {
        RandomShapes panel = new RandomShapes();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(LARGURA, ALTURA);
        app.add(panel);
        app.setVisible(true);
    }

}
