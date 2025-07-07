package huncam.components.form.dashboard;

import huncam.components.model.Model_Card;
import javax.swing.ImageIcon;

public class Home_Form extends javax.swing.JPanel {

    public Home_Form() {
        initComponents();
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/huncam/assets/icons/user.png")), "Total Pngguna", "Rp200000000", "Total Produk Camera Yang Belum Terjual"));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/huncam/assets/icons/stock.png")), "Total Stock", "Rp200000000", "Total Produk Camera Yang Belum Terjual"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/huncam/assets/icons/profit.png")), "Pendapatan", "Rp1200000000", "Total Pendapatan Camera Yang Terjual"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card1 = new huncam.components.fragments.dashboard.Card();
        card4 = new huncam.components.fragments.dashboard.Card();
        card2 = new huncam.components.fragments.dashboard.Card();
        card3 = new huncam.components.fragments.dashboard.Card();

        setPreferredSize(new java.awt.Dimension(810, 437));

        panel.setPreferredSize(new java.awt.Dimension(810, 437));
        panel.setLayout(new java.awt.GridLayout(2, 2, 10, 30));

        card1.setColor1(new java.awt.Color(48, 238, 216));
        card1.setColor2(new java.awt.Color(2, 127, 125));
        panel.add(card1);
        panel.add(card4);

        card2.setColor1(new java.awt.Color(231, 7, 250));
        card2.setColor2(new java.awt.Color(161, 6, 244));
        panel.add(card2);

        card3.setColor1(new java.awt.Color(96, 239, 255));
        card3.setColor2(new java.awt.Color(0, 97, 255));
        panel.add(card3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private huncam.components.fragments.dashboard.Card card1;
    private huncam.components.fragments.dashboard.Card card2;
    private huncam.components.fragments.dashboard.Card card3;
    private huncam.components.fragments.dashboard.Card card4;
    private javax.swing.JLayeredPane panel;
    // End of variables declaration//GEN-END:variables
}
