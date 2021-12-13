/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MerchantEmployeeWorkArea;

import Business.Bank.Bank;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Bank.BankDirectory;
import Business.Card.CardDirectory;
import Business.CardType.CardTypeList;
import Business.Merchant.MerchantDirectory;
import Business.BankEmployee.BankEmployee;
import Business.BankEmployee.BankEmployeeDirectory;
import Business.Merchant.Merchant;
import Business.MerchantEmployee.MerchantEmployee;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import userinterface.BankEmployeeWorkArea.BankEmployeeWorkAreaJPanel;
import userinterface.CustomerWorkArea.ApplyCardJPanel;

/**
 *
 * @author somnathsolaskar
 */
public class MerchantEmployeeWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BankEmployeeWorkAreaJPanel
     */
     private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private CustomerDirectory customerDirectory;
    private BankDirectory bankDirectory;
    private CardTypeList cardTypeList;
    private MerchantDirectory merchantsDirectory;
    private CardDirectory cardDirectory;
    private UserAccount account;
    private Merchant merchant;
    private MerchantEmployee bankEmployee;
    private BankEmployeeDirectory bankEmployeeDirectory;
    private Customer customer;
    
    public MerchantEmployeeWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.customerDirectory = ecosystem.getCustomerDirectory();
        
        merchant = ecosystem.getMerchantDirectory().getMerchant(account.getUsername());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnApplyCard = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnApplyCard.setText("Manage Customer Orders");
        btnApplyCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyCardActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/93634-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Welcome...!!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnApplyCard, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(btnApplyCard, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApplyCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyCardActionPerformed
      
      ManageOrdersMerchantEmployeeJPanel applyCard = new ManageOrdersMerchantEmployeeJPanel(userProcessContainer,  ecosystem);
      userProcessContainer.add("BankManagement",applyCard);
      CardLayout layout=(CardLayout)userProcessContainer.getLayout();
      layout.next(userProcessContainer);
    }//GEN-LAST:event_btnApplyCardActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BankEmployeeWorkAreaJPanel mcjp = (BankEmployeeWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApplyCard;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}