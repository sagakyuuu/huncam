package com.huncam.components;

import javax.swing.*;
import java.awt.*;

public class BgGradient extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        Color startColor = new Color(128, 255, 0);
        Color endColor = new Color(128,255,100);

        // Titik awal (x1,y1) dan titik akhir (x2,y2)
        GradientPaint gradient = new GradientPaint(
    getWidth() / 2, 0,          // Titik awal (tengah atas)
    startColor,
    getWidth() / 2, getHeight(), // Titik akhir (tengah bawah)
    endColor
);


        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, getWidth(), getHeight()); // Isi seluruh panel
    }

}
