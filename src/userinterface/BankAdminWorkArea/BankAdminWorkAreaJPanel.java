/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BankAdminWorkArea;

import Business.Bank.Bank;
import userinterface.SystemAdminWorkArea.*;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Bank.BankDirectory;
import Business.Card.CardDirectory;
import Business.CardType.CardTypeList;
import Business.Merchant.MerchantDirectory;
import Business.BankEmployee.BankEmployee;
import Business.BankEmployee.BankEmployeeDirectory;
import Business.PaymentMethod.PaymentMethod;
import Business.PaymentMethod.PaymentMethodDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MyPC1
 */
public class BankAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private CustomerDirectory customerDirectory;
    private BankDirectory bankDirectory;
    private CardTypeList cardTypeList;
    private MerchantDirectory merchantsDirectory;
    private CardDirectory cardDirectory;
    private UserAccount account;
    private Bank bank;
    private BankEmployee bankEmployee;
    private BankEmployeeDirectory bankEmployeeDirectory;
    private  PaymentMethod paymentMethod;
    private  PaymentMethodDirectory paymentMethodDirectory;
    
    public BankAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.customerDirectory = ecosystem.getCustomerDirectory();
        this.cardTypeList = ecosystem.getCardTypeList();
        this.cardDirectory = ecosystem.getCardDirectory();
        this.bankEmployee = bankEmployee;
        this.bankEmployeeDirectory = ecosystem.getBankEmployeeDirectory();
        this.paymentMethodDirectory = ecosystem.getPaymentMethodDirectory();
        
        bank = ecosystem.getBankDirectory().getBank(account.getUsername());
    }
    

    /**
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnManageCustomers = new javax.swing.JButton();
        btnManageCreditCards = new javax.swing.JButton();
        btnManageEmployees = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        jSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Selected Node:");

        lblSelectedNode.setText("<View_selected_node>");

        btnManageCustomers.setText("Manage Customers");
        btnManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomersActionPerformed(evt);
            }
        });

        btnManageCreditCards.setText("Manage Credit Cards");
        btnManageCreditCards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCreditCardsActionPerformed(evt);
            }
        });

        btnManageEmployees.setText("Manage Employees");
        btnManageEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeesActionPerformed(evt);
            }
        });

        btnPayment.setText("Manage Payments Gateway");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblSelectedNode))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnManageCreditCards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSelectedNode))
                .addGap(54, 54, 54)
                .addComponent(btnManageCustomers)
                .addGap(18, 18, 18)
                .addComponent(btnManageCreditCards)
                .addGap(18, 18, 18)
                .addComponent(btnManageEmployees)
                .addGap(18, 18, 18)
                .addComponent(btnPayment)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomersActionPerformed
       ManageCustomerJPanel customer = new ManageCustomerJPanel(userProcessContainer, account, ecosystem, customerDirectory, bank);
       userProcessContainer.add("CustomerManagement",customer);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageCustomersActionPerformed

    private void btnManageCreditCardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCreditCardsActionPerformed
       ManageCreditCardsJPanel creditCard = new ManageCreditCardsJPanel(userProcessContainer, account, ecosystem, cardDirectory, bank);
       userProcessContainer.add("CreditCardManagement",creditCard);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCreditCardsActionPerformed

    private void btnManageEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeesActionPerformed
       ManageBankEmployeeJPanel mer = new ManageBankEmployeeJPanel(userProcessContainer,account, ecosystem, bankEmployeeDirectory,bank);
       userProcessContainer.add("EmployeeManagement",mer);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEmployeesActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        // TODO add your handling code here:
       ManagePaymentGatewayJPanel mer = new ManagePaymentGatewayJPanel(userProcessContainer,account, ecosystem, paymentMethodDirectory);
       userProcessContainer.add("PaymentGatewayManagement",mer);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPaymentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCreditCards;
    private javax.swing.JButton btnManageCustomers;
    private javax.swing.JButton btnManageEmployees;
    private javax.swing.JButton btnPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}
