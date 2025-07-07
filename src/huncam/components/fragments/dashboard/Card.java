package huncam.components.fragments.dashboard;

import huncam.components.model.Model_Card;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Card extends javax.swing.JPanel {

    /**
     * @return the color1
     */
    public Color getColor1() {
        return color1;
    }

    /**
     * @param color1 the color1 to set
     */
    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    /**
     * @return the color2
     */
    public Color getColor2() {
        return color2;
    }

    /**
     * @param color2 the color2 to set
     */
    public void setColor2(Color color2) {
        this.color2 = color2;
    }
    
    private Color color1;
    private Color color2;
    
    public Card() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
    }
    
    public void setData(Model_Card data) {
        lbIcon.setIcon(data.getIcon());
        lbTitle.setText(data.getTitle());
        lbValue.setText(data.getValue());
        lbDesc.setText(data.getDesc());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        lbValue = new javax.swing.JLabel();
        lbDesc = new javax.swing.JLabel();

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huncam/assets/icons/stock.png"))); // NOI18N

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("Stock");

        lbValue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbValue.setForeground(new java.awt.Color(255, 255, 255));
        lbValue.setText("Value");

        lbDesc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDesc.setForeground(new java.awt.Color(255, 255, 255));
        lbDesc.setText("Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTitle, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDesc)
                    .addComponent(lbValue, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIcon, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDesc)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 10, getHeight(), getHeight());
        super.paintComponent(g);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbDesc;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbValue;
    // End of variables declaration//GEN-END:variables
}
