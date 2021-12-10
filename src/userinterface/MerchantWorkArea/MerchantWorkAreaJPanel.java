/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MerchantWorkArea;

import Business.EcoSystem;
import Business.Merchant.Merchant;
import Business.Product.ProductDirectory;
import Business.UserAccount.UserAccount;
import Business.Voucher.VoucherList;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author jayesh
 */
public class MerchantWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private ProductDirectory productDirectory;
    private UserAccount account;
    private VoucherList voucherList;
    private Merchant merchant;
    
    public MerchantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        merchant = ecosystem.getMerchantDirectory().getMerchant(account.getUsername());
        this.productDirectory = ecosystem.getProductDirectory();
        this.voucherList = ecosystem.getVoucherList();
    }
    
    /**
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnManageCustomers = new javax.swing.JButton();
        btnVoucher = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageCustomers.setText("Manage Products");
        btnManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomersActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 95, 136, -1));

        btnVoucher.setText("Manage Vouchers");
        btnVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoucherActionPerformed(evt);
            }
        });
        jPanel2.add(btnVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 140, -1));

        add(jPanel2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomersActionPerformed
       ManageProductsJPanel customer = new ManageProductsJPanel(userProcessContainer, account, ecosystem, productDirectory,merchant);
       userProcessContainer.add("BankManagement",customer);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageCustomersActionPerformed

    private void btnVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoucherActionPerformed

       ManageVouchersJPanel vouchers = new ManageVouchersJPanel(userProcessContainer, ecosystem, voucherList, merchant);
       userProcessContainer.add("VouchersManagement",vouchers);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnVoucherActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCustomers;
    private javax.swing.JButton btnVoucher;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
