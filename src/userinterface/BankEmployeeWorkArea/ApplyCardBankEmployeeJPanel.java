/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BankEmployeeWorkArea;

import Business.Card.Card;
import Business.CardType.CardType;
import Business.CardType.CardTypeList;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author somnathsolaskar
 */
public class ApplyCardBankEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddBankJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private CardTypeList cardTypeList;
    private UserAccount account;
    private ArrayList<String> cardTypeLst;
    private Customer customer;
    ArrayList<String> customerUsername;
    
    public ApplyCardBankEmployeeJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, CardTypeList cardTypeList, Customer customer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.account = account;
        this.cardTypeList = cardTypeList;
        customerUsername = new ArrayList<String>();
//        this.customer = customer;
        fillValue();
        populateTable();
        btnadd.setEnabled(false);
    }

     public void populateTable() {
        DefaultTableModel cc = (DefaultTableModel) tblCustomer.getModel();
        cc.setRowCount(0);
        for(Card card : ecoSystem.getCardDirectory().getCardDirectory()){
            if(card.getCardOwner() == customer) {
                Object [] row = new Object[5];
                row[0] = card;
                row[1] = card.getCardType();
                row[2] = card.getCreditLimit();
                row[3] = card.getStatus();
                row[4] = card.getCardNumber();
                cc.addRow(row);
            }
        }
    }
     
    public void fillValue() {
        cardTypeLst = new ArrayList<String>();
        cardTypeLst.add("Select");
        for(CardType ct : ecoSystem.getCardTypeList().getCardTypeList()) {
            cardTypeLst.add(ct.getName() + "-" + ct.getCardPlatinumType());
        }
        String[] cardTypeLstArray = new String[cardTypeLst.size()];
        cardTypeLstArray = cardTypeLst.toArray(cardTypeLstArray);
        comboCardType.setModel(new javax.swing.DefaultComboBoxModel(cardTypeLstArray));
        
        ArrayList<String> customerLst = new ArrayList<String>();
        customerLst.add("Select");
        for(Customer ct : ecoSystem.getCustomerDirectory().getCustomerDirectory()) {
            customerLst.add(ct.getName());
            customerUsername.add(ct.getUserame());
        }
        String[] customerArray = new String[customerLst.size()];
        customerArray = customerLst.toArray(customerArray);
        combCustomer.setModel(new javax.swing.DefaultComboBoxModel(customerArray));
    }

    /**
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        cardDetails = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        comboCardType = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCustomer1 = new javax.swing.JTable();
        lblAvailable = new javax.swing.JLabel();
        lblManage = new javax.swing.JLabel();
        combCustomer = new javax.swing.JComboBox<>();
        lblCustomer = new javax.swing.JLabel();
        lblApply = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Card Provider", "Card Type", "Limit", "Status", "Card Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 700, 95));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 42, -1, -1));
        jPanel1.add(cardDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 190, 60));

        btnadd.setText("Apply New Card");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        comboCardType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCardTypeActionPerformed(evt);
            }
        });
        jPanel1.add(comboCardType, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 190, -1));

        tblCustomer1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Card Provider", "Card Type", "Limit", "Status", "Card Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCustomer1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 700, 95));

        lblAvailable.setText("Available Cards");
        jPanel1.add(lblAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 117, -1));

        lblManage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblManage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManage.setText("Manage Credit Cards");
        jPanel1.add(lblManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 778, -1));

        combCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combCustomerActionPerformed(evt);
            }
        });
        jPanel1.add(combCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 190, -1));

        lblCustomer.setText("Select Customer");
        jPanel1.add(lblCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 117, -1));

        lblApply.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblApply.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApply.setText("Apply New Card");
        jPanel1.add(lblApply, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 778, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       if(comboCardType.getSelectedItem().toString() == "Select") {
            JOptionPane.showMessageDialog(null, "Please select from available options.");
            return;
        }
        int index = comboCardType.getSelectedIndex() - 1;
        CardType ct = ecoSystem.getCardTypeList().getCardTypeList().get(index);
       
        for(Card card : ecoSystem.getCardDirectory().getCardDirectory()) {
            if(card.getCardOwner() == customer && card.getCardType() == ct) {
                JOptionPane.showMessageDialog(null, "Card already exists. If it is in pending state, please wait for admin to approve.");
                return;
            }
        }

        System.out.println(account);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");  
        LocalDateTime now = LocalDateTime.now();
        ecoSystem.getCardDirectory().newCard( "", dtf.format(now), "", "", 0, 0, 0, 0, ct, customer, Card.statusNew,ecoSystem.getCardTypeList().getCardTypeList().get(index).getLimit());
        JOptionPane.showMessageDialog(null, "Card Applied.");
        cardDetails.setText("");
        fillValue();
        populateTable();
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BankEmployeeWorkAreaJPanel mcjp = (BankEmployeeWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void combCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combCustomerActionPerformed
        int index = combCustomer.getSelectedIndex();
        if(index < 0) {
            JOptionPane.showMessageDialog(null,"Please select a customer", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(index == 0) {
            DefaultTableModel cc = (DefaultTableModel) tblCustomer.getModel();
            cc.setRowCount(0);
            btnadd.setEnabled(false);
            return;            
        }
        String cUsername = customerUsername.get(index-1);
        customer = ecoSystem.getCustomerDirectory().getCustomer(cUsername);
        populateTable();
        btnadd.setEnabled(true);
    }//GEN-LAST:event_combCustomerActionPerformed

    private void comboCardTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCardTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCardTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnadd;
    private javax.swing.JLabel cardDetails;
    private javax.swing.JComboBox<String> combCustomer;
    private javax.swing.JComboBox<String> comboCardType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApply;
    private javax.swing.JLabel lblAvailable;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblManage;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTable tblCustomer1;
    // End of variables declaration//GEN-END:variables
}
