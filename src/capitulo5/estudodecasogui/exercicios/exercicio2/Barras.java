package capitulo5.estudodecasogui.exercicios.exercicio2;

import javax.swing.*;
import java.awt.*;

public class Barras extends JPanel {

    private int comp1;
    private int comp2;
    private int comp3;
    private int comp4;
    private int comp5;

    public Barras(int comp1, int comp2, int comp3, int comp4, int comp5) {
        this.comp1 = comp1;
        this.comp2 = comp2;
        this.comp3 = comp3;
        this.comp4 = comp4;
        this.comp5 = comp5;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int larguraPainel = getWidth();
        int alturaPainel = getHeight();

        int larguraRetangulo = larguraPainel / 5;


        g.drawRect(0, 0, comp1 * 10, larguraRetangulo);
        g.drawRect(0, 1 * larguraRetangulo, comp2 * 10, larguraRetangulo);
        g.drawRect(0, 2 * larguraRetangulo, comp3 * 10, larguraRetangulo);
        g.drawRect(0, 3 * larguraRetangulo, comp4 * 10, larguraRetangulo);
        g.drawRect(0, 4 * larguraRetangulo, comp5 * 10, larguraRetangulo);

    }
}
