package capitulo4.estudodecasogui.exercicios.exercicio2;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private static final int TOTAL_LINES = 15;

    public void paintComponent(Graphics g) {


        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        int yStep = height / TOTAL_LINES;
        int xStep = width / TOTAL_LINES;

        int lineCounter = 0;

        while (lineCounter < TOTAL_LINES) {
            g.drawLine(0, yStep * lineCounter, xStep + xStep * lineCounter, height);
            g.drawLine(width, yStep * lineCounter, width - (xStep + (lineCounter * xStep)), height);
            g.drawLine(lineCounter * xStep, 0, width, lineCounter * yStep);
            g.drawLine(width - (lineCounter * xStep), 0, 0, yStep * lineCounter);

            lineCounter++;
        }
    }

}
