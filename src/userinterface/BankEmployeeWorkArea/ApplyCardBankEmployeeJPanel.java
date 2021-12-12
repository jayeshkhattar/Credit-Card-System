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

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnadd.setText("Apply New Card");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        comboCardType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCardTypeActionPerformed(evt);
            }
        });

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

        lblAvailable.setText("Available Cards");

        lblManage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblManage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManage.setText("Manage Credit Cards");

        combCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combCustomerActionPerformed(evt);
            }
        });

        lblCustomer.setText("Select Customer");

        lblApply.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblApply.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApply.setText("Apply New Card");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblManage, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnBack))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(lblCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(combCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblApply, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(comboCardType, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(btnadd))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(cardDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblManage)
                .addGap(7, 7, 7)
                .addComponent(btnBack)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomer)
                    .addComponent(combCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblApply)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvailable)
                    .addComponent(comboCardType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd))
                .addGap(15, 15, 15)
                .addComponent(cardDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
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
