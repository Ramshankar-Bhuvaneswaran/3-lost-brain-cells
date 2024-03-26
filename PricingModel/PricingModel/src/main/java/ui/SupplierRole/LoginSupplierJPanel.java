package ui.SupplierRole;


import java.awt.CardLayout;
import javax.swing.JPanel;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.Supplier.SupplierProfile;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class LoginSupplierJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    public LoginSupplierJPanel(JPanel upc, SupplierDirectory sd) {
        initComponents();
        userProcessContainer = upc;
        supplierDirectory = sd;
        
        cmbSupplier.removeAllItems();;
        for (SupplierProfile supplier : supplierDirectory.getSuplierList()) {
            cmbSupplier.addItem(supplier);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblSupplierChooser = new javax.swing.JLabel();
        cmbSupplier = new javax.swing.JComboBox();
        btnFind = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(102, 0, 0));
        setPreferredSize(new java.awt.Dimension(650, 600));

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(102, 0, 0));
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logoPleaseBuySmall.png"))); // NOI18N
        lblTitle.setText("Supplier Portal");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTitle.setIconTextGap(50);

        lblSupplierChooser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSupplierChooser.setForeground(new java.awt.Color(102, 0, 0));
        lblSupplierChooser.setText("Choose your supplier account:");

        cmbSupplier.setBackground(new java.awt.Color(204, 255, 204));
        cmbSupplier.setForeground(new java.awt.Color(102, 0, 0));
        cmbSupplier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSupplierActionPerformed(evt);
            }
        });

        btnFind.setBackground(new java.awt.Color(204, 255, 204));
        btnFind.setForeground(new java.awt.Color(102, 0, 0));
        btnFind.setText("Login >>");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(lblSupplierChooser)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFind)
                            .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitle)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplierChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed

        SupplierProfile supplier = (SupplierProfile) cmbSupplier.getSelectedItem();
        SupplierWorkAreaJPanel swajp = new SupplierWorkAreaJPanel(userProcessContainer, supplier);
        userProcessContainer.add("SupplierWorkAreaJPanel", swajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFindActionPerformed

    private void cmbSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSupplierActionPerformed

    }//GEN-LAST:event_cmbSupplierActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JComboBox cmbSupplier;
    private javax.swing.JLabel lblSupplierChooser;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
    
}
