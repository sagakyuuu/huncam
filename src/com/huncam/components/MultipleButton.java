package com.huncam.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class MultipleButton extends JPanel {

    public Color getEffectColor() {
        return effectColor;
    }

    public void setEffectColor(Color effectColor) {
        this.effectColor = effectColor;
        int red = effectColor.getRed();
        int green = effectColor.getGreen();
        int blue = effectColor.getBlue();

        colors = new Color[]{new Color(red, green, blue, 70), new Color(red, green, blue, 20), new Color(red, green, blue, lineSize)};

    }

    private Color effectColor;
    private Point point;
    private float[] dist = {0.0f, 0.5f, 1.0f};
    private Color[] colors;
    private int itemWidth = 100;
    private int itemHeight = 100;
    private int space = 4;
    private int lineSize = 4;
    private int showLine = 0;

    public MultipleButton() {
        init();

    }

    private void init() {
        setOpaque(false);
        setEffectColor(new Color(255, 255, 255));
        setForeground(new Color(205, 205, 205));
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                point = e.getPoint();
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        int width = getWidth();
        int height = getHeight();
        int size = 150;
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int x = space;
        int y = space;

        for (int i = 0; i < 50; i++) {
            Shape s = createShape(x, y, itemWidth, itemHeight);
            g2.fill(s);
            x += space + itemWidth;
            if (x + space + itemWidth > width) {
                x = space;
                y += space + itemHeight;
            }
        }
        
        if (point != null) {
            RadialGradientPaint p = new RadialGradientPaint(point, size, dist, colors);
            g2d.setPaint(p);
        }else {
            g2d.setColor(new Color(255,255,255));
        }

        g2d.fillRect(0, 0, width, height);
        g2d.dispose();
        g2.drawImage(img, 0, 0, null);
        g2.dispose();
        super.paint(g);
    }

    private Shape createShape(int x, int y, int width, int height) {
        Area area = new Area(new Rectangle2D.Double(x, y, width, height));
        area.subtract(new Area(new Rectangle2D.Double(x + lineSize, y + lineSize, width - lineSize * 2, height - lineSize * 2)));
        return area;

    }

}
