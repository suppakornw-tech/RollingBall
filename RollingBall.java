package Lib;

import javax.swing.*;
import java.awt.*;



public class RollingBall extends JPanel {

    private int ballX = 100;    
    private int ballY = 100;   
    private int ballSize = 80;  

    public RollingBall() {
        this.setBackground(new Color(236, 236, 236));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        drawBall(g2, ballX, ballY, ballSize, 0);
    }

    private void drawBall(Graphics2D g2, int x, int y, int size, double angle) {

        g2.setColor(Color.WHITE);
        g2.fillOval(x, y, size, size);

        g2.setColor(Color.BLACK);
        g2.fillArc(x, y, size, size, (int) angle, 180);

        g2.setColor(Color.BLACK);
        g2.drawOval(x, y, size, size);
    }
}