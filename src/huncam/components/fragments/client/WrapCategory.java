package huncam.components.fragments.client;

import javax.swing.ImageIcon;

public class WrapCategory extends javax.swing.JPanel {

    public WrapCategory() {
        initComponents();

    }

    public void categoryImage(ImageIcon icon) {
        lbImage.setIcon(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbImage = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(237, 216));
        jPanel1.setLayout(new java.awt.CardLayout());

        lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huncam/assets/banner/Canon.png"))); // NOI18N
        jPanel1.add(lbImage, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbImage;
    // End of variables declaration//GEN-END:variables
}
