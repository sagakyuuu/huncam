package huncam.components.fragments;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class ProfileImg extends JComponent {

    private ImageIcon icon;
    private int borderSize = 2;

    public ProfileImg() {
        setPreferredSize(new Dimension(24, 24));
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int w = getWidth() - (borderSize * 2);
        int h = getHeight() - (borderSize * 2);
        int x = borderSize;
        int y = borderSize;

        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, w, h);

        if (icon != null) {
            g2.setClip(circle);
            g2.drawImage(icon.getImage(), x, y, w, h, null);
        }

        g2.setClip(null);
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(borderSize));
        g2.draw(circle);

        g2.dispose();
    }

}
