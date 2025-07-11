package huncam.view.client;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import huncam.components.form.client.AboutForm;
import huncam.components.form.client.ContactForm;
import huncam.components.form.client.HomeForm;
import huncam.components.form.client.ProductForm;
import huncam.components.fragments.ButtonCustom;
import huncam.components.fragments.ProfileImg;
import huncam.components.fragments.dashboard.ProfileUser;
import huncam.config.Database;
import huncam.controller.AddToCartListener;
import huncam.controller.TransactionController;
import huncam.middleware.SessionManager;
import huncam.model.CartItem;
import huncam.model.Product;
import huncam.view.auth.LoginView;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import java.sql.*;

public class ClientView extends javax.swing.JFrame implements AddToCartListener {

    private java.util.List<CartItem> cartItems = new java.util.ArrayList<>();
    private TransactionController transactionController;

    private HomeForm homeForm;
    private ContactForm contactForm;
    private AboutForm aboutForm;

    public ClientView() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainPanel.removeAll();
        homeForm = new HomeForm();
        mainPanel.add(homeForm, BorderLayout.CENTER);
        mainPanel.revalidate();
        mainPanel.repaint();
        updateLoginBtn();

        this.cartItems = new ArrayList<>();
        this.transactionController = new TransactionController();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnToCart = new javax.swing.JLabel();
        btnToProductForm = new javax.swing.JLabel();
        btnToContactForm = new javax.swing.JLabel();
        btnToAboutForm = new javax.swing.JLabel();
        btnToHomeForm = new javax.swing.JLabel();
        isLoginWrap = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        homeForm1 = new huncam.components.form.client.HomeForm();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Huncam");

        btnToCart.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnToCart.setText("Cart");
        btnToCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnToCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnToCartMouseClicked(evt);
            }
        });

        btnToProductForm.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnToProductForm.setText("Product");
        btnToProductForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnToProductForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnToProductFormMouseClicked(evt);
            }
        });

        btnToContactForm.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnToContactForm.setText("Contact");
        btnToContactForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnToContactForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnToContactFormMouseClicked(evt);
            }
        });

        btnToAboutForm.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnToAboutForm.setText("About");
        btnToAboutForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnToAboutForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnToAboutFormMouseClicked(evt);
            }
        });

        btnToHomeForm.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnToHomeForm.setText("Home");
        btnToHomeForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnToHomeForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnToHomeFormMouseClicked(evt);
            }
        });

        isLoginWrap.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15);
        flowLayout1.setAlignOnBaseline(true);
        isLoginWrap.setLayout(flowLayout1);

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1383, Short.MAX_VALUE)
                .addComponent(btnToHomeForm)
                .addGap(18, 18, 18)
                .addComponent(btnToProductForm)
                .addGap(18, 18, 18)
                .addComponent(btnToAboutForm)
                .addGap(18, 18, 18)
                .addComponent(btnToContactForm)
                .addGap(18, 18, 18)
                .addComponent(btnToCart)
                .addGap(27, 27, 27)
                .addComponent(isLoginWrap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(isLoginWrap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(btnToCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnToProductForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnToContactForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnToAboutForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnToHomeForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(headerPanel, java.awt.BorderLayout.PAGE_START);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.BorderLayout());
        mainPanel.add(homeForm1, java.awt.BorderLayout.CENTER);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnToCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToCartMouseClicked
        new CartView().setVisible(true);
    }//GEN-LAST:event_btnToCartMouseClicked

    private void btnToProductFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToProductFormMouseClicked
        mainPanel.removeAll();

        ProductForm productForm = new ProductForm(this);

        mainPanel.add(productForm, BorderLayout.CENTER);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_btnToProductFormMouseClicked

    public void onAddToCart(Product product) {
        // Taruh semua logika keranjang Anda di sini
        System.out.println("Menambahkan ke keranjang: " + product.getName());

        // Contoh: Cek jika produk sudah ada, tambah qty. Jika belum, tambah baru.
        for (CartItem item : cartItems) {
            if (item.getProduct().getId() == product.getId()) {
                item.setQuantity(item.getQuantity() + 1);
                // Refresh tampilan tabel keranjang Anda di sini
                return;
            }
        }
        cartItems.add(new CartItem(product, 1));
        // Refresh tampilan tabel keranjang Anda di sini
    }


    private void btnToContactFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToContactFormMouseClicked
        mainPanel.removeAll();
        contactForm = new ContactForm();
        mainPanel.add(contactForm, BorderLayout.CENTER);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_btnToContactFormMouseClicked

    private void btnToAboutFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToAboutFormMouseClicked
        // TODO add your handling code here:
        mainPanel.removeAll();
        aboutForm = new AboutForm();
        mainPanel.add(aboutForm, BorderLayout.CENTER);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_btnToAboutFormMouseClicked

    private void btnToHomeFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToHomeFormMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnToHomeFormMouseClicked

    public void updateLoginBtn() {
        isLoginWrap.removeAll();

        if (SessionManager.isLoggedIn()) {
            ProfileImg profileMenu = createProfileMenu();
            isLoginWrap.add(profileMenu);
        } else {
            ButtonCustom btn = new ButtonCustom("Login");
            btn.addActionListener(e -> {
                new LoginView().setVisible(true);
                this.dispose();
            });
            isLoginWrap.add(btn);
        }

        isLoginWrap.revalidate();
        isLoginWrap.repaint();
    }

    private ProfileImg createProfileMenu() {
        JPopupMenu popMenu = new JPopupMenu();

        ProfileImg pi = new ProfileImg();

        JLabel welcome = new JLabel();

        String sql = "SELECT nama_lengkap FROM users WHERE id = ?";
        int userId = SessionManager.getUserId();
        String name;

        try (Connection conn = Database.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            ps.setInt(1, userId);
            if (rs.next()) {
                name = rs.getString("nama_lengkap");
                welcome.setText("Welcome " + name);
            }
        } catch (SQLException e) {
            System.err.println("Get Name Error:" + e.getMessage());
        }

        JMenuItem profileItem = new JMenuItem("Profile");
        JMenuItem logoutItem = new JMenuItem("Logout");

        profileItem.addActionListener(e -> {
            System.out.println("Tombol Profile di click");
        });

        logoutItem.addActionListener(e -> {
            SessionManager.logout();
            new LoginView().setVisible(true);
            this.dispose();
        });

        popMenu.add(welcome);
        popMenu.add(profileItem);
        popMenu.add(logoutItem);

        URL iconUrl = getClass().getResource("/huncam/assets/icons/user_b.png");
        ImageIcon icon = new ImageIcon(iconUrl);

        Image img = icon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);

        pi.setIcon(icon);

        pi.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popMenu.show(pi, 0, pi.getHeight());
            }
        });

        return pi;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnToAboutForm;
    private javax.swing.JLabel btnToCart;
    private javax.swing.JLabel btnToContactForm;
    private javax.swing.JLabel btnToHomeForm;
    private javax.swing.JLabel btnToProductForm;
    private javax.swing.JPanel headerPanel;
    private huncam.components.form.client.HomeForm homeForm1;
    private javax.swing.JPanel isLoginWrap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
