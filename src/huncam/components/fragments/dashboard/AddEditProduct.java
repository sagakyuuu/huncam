package huncam.components.fragments.dashboard;

import huncam.controller.ProductController;
import huncam.model.Product;
import javax.swing.JOptionPane;

public class AddEditProduct extends javax.swing.JDialog {

    private ProductController pc;
    private Product pEdit;

    public AddEditProduct(java.awt.Frame parent, boolean modal, Product product) {
        super(parent, modal);
        initComponents();
        this.pc = new ProductController();
        this.pEdit = product;

        initForm();
    }

    private void initForm() {
        if (pEdit != null) {
            setTitle("Edit Produk");
            lbTitle.setText("Edit Produk");
            txtName.setText(pEdit.getName());
            cbCategory.setSelectedItem(pEdit.getCategory());
            txtDescription.setText(pEdit.getDescription());
            txtHarga.setText(String.valueOf(pEdit.getPrice()));
            txtStock.setText(String.valueOf(pEdit.getStock()));
            txtImagePath.setText(pEdit.getImagePath());
            btnEditAdd.setText("Edit");

        } else {
            setTitle("Tambah Produk");
            lbTitle.setText("Tambah Produk");
            btnEditAdd.setText("Tambah");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        cbCategory = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        txtDescription = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        txtHarga = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        txtStock = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        txtImagePath = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        btnEditAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTitle.setText("Title");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(13, 0, 0, 10));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.CardLayout());

        jLabel1.setBackground(new java.awt.Color(255, 51, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nama");
        jPanel4.add(jLabel1, "card2");

        jPanel3.add(jPanel4);

        jPanel5.setLayout(new java.awt.CardLayout());

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel5.add(txtName, "card2");

        jPanel3.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.CardLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Kategori");
        jPanel6.add(jLabel3, "card2");

        jPanel3.add(jPanel6);

        jPanel7.setLayout(new java.awt.CardLayout());

        cbCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Canon", "FujiFilm", "Nikon", "Sony" }));
        jPanel7.add(cbCategory, "card2");

        jPanel3.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.CardLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Deskripsi");
        jPanel8.add(jLabel4, "card2");

        jPanel3.add(jPanel8);

        jPanel9.setLayout(new java.awt.CardLayout());

        txtDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel9.add(txtDescription, "card2");

        jPanel3.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.CardLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Harga");
        jPanel10.add(jLabel5, "card2");

        jPanel3.add(jPanel10);

        jPanel11.setLayout(new java.awt.CardLayout());

        txtHarga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel11.add(txtHarga, "card2");

        jPanel3.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.CardLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Stok");
        jPanel12.add(jLabel6, "card2");

        jPanel3.add(jPanel12);

        jPanel13.setLayout(new java.awt.CardLayout());

        txtStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel13.add(txtStock, "card2");

        jPanel3.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.CardLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Gambar");
        jPanel14.add(jLabel7, "card2");

        jPanel3.add(jPanel14);

        jPanel15.setLayout(new java.awt.CardLayout());

        txtImagePath.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtImagePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImagePathActionPerformed(evt);
            }
        });
        jPanel15.add(txtImagePath, "card2");

        jPanel3.add(jPanel15);

        jPanel16.setLayout(new java.awt.CardLayout());

        btnEditAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnEditAdd.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnEditAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnEditAdd.setText("btn");
        btnEditAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAddActionPerformed(evt);
            }
        });
        jPanel16.add(btnEditAdd, "card2");

        jPanel3.add(jPanel16);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtImagePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImagePathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImagePathActionPerformed

    private void btnEditAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAddActionPerformed

        String name = txtName.getText();
        String category = cbCategory.getSelectedItem().toString();
        String imgPath = txtImagePath.getText();
        String description = txtDescription.getText();

        if (name.isEmpty() || category.isEmpty() || txtHarga.getText().isBlank() || txtStock.getText().isEmpty() || imgPath.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double price = Double.parseDouble(txtHarga.getText());
            int stock = Integer.parseInt(txtStock.getText());

            if (pEdit != null) {
                pEdit.setName(name);
                pEdit.setCategory(category);
                pEdit.setImagePath(imgPath);
                pEdit.setDescription(description);
                pEdit.setPrice(price);
                pEdit.setStock(stock);

                boolean success = pc.addProduct(pEdit);
                if (success) {
                    JOptionPane.showMessageDialog(this, "Produk berhasil diperbarui.");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal memperbarui produk.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                Product newP = new Product(0, name, category, description, price, stock, imgPath);
                boolean success = pc.addProduct(newP);
                if (success) {
                    JOptionPane.showMessageDialog(this, "Produk berhasil ditambahkan.");
                    this.dispose(); // Tutup dialog

                } else {
                    JOptionPane.showMessageDialog(this, "Gagal menambahkan produk.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Harga dan Stok harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnEditAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditAdd;
    private javax.swing.JComboBox<String> cbCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtImagePath;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
