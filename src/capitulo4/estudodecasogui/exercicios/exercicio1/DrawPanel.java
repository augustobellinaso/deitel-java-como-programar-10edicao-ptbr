package capitulo4.estudodecasogui.exercicios.exercicio1;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private static final int TOTAL_LINES = 15;

    public void paintComponent(Graphics g) {


        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        int step = height / TOTAL_LINES;

        int lineCounter = 0;

        while (lineCounter < TOTAL_LINES) {
            g.drawLine(0, 0, width - lineCounter * step, lineCounter * step);
            g.drawLine(0, height, lineCounter * step, lineCounter * step);
            g.drawLine(width, 0, lineCounter * step, lineCounter * step);
            g.drawLine(width, height, width - lineCounter * step, lineCounter * step);

            lineCounter++;
        }
    }

}
