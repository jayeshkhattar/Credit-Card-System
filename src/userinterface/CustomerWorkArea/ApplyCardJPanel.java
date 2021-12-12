/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerWorkArea;

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
public class ApplyCardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddBankJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private CardTypeList cardTypeList;
    private UserAccount account;
    private ArrayList<String> cardTypeLst;
    private Customer customer;
    
    public ApplyCardJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, CardTypeList cardTypeList, Customer customer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.account = account;
        this.cardTypeList = cardTypeList;
        this.customer = customer;
        fillValue();
        populateTable();
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
    }

    /**
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cardDetails = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        comboCardType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Apply New Card");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 778, -1));
        add(cardDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 190, 60));

        btnadd.setText("Apply New Card");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 42, -1, -1));

        comboCardType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCardTypeActionPerformed(evt);
            }
        });
        add(comboCardType, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 190, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 95, 700, 95));

        jLabel3.setText("Available Cards");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 117, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Credit Cards");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 778, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       if(comboCardType.getSelectedItem().toString().equals("Select")) {
            JOptionPane.showMessageDialog(null, "Please select from available options.");
            return;
        }
        int index = comboCardType.getSelectedIndex() - 1;
        CardType ct = ecoSystem.getCardTypeList().getCardTypeList().get(index);
       
        for(Card card : ecoSystem.getCardDirectory().getCardDirectory()) {
            if(card.getCardOwner() == customer && card.getCardType() == ct && (card.getStatus().equals(Card.statusActive) || card.getStatus().equals(Card.statusDisabled))) {
                JOptionPane.showMessageDialog(null, "Card exists. Please wait for admin to approve the request if it is Pending.");
                return;
            }
        }

        System.out.println(account);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");  
        LocalDateTime now = LocalDateTime.now();
        float limit =  ecoSystem.getCardTypeList().getCardTypeList().get(index).getLimit();
        ecoSystem.getCardDirectory().newCard( "", dtf.format(now), "", "", limit, 0, 0, 0, ct, customer, Card.statusNew, limit);
        JOptionPane.showMessageDialog(null, "Card Applied");
        cardDetails.setText("");
        fillValue();
        populateTable();
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerWorkAreaJPanel mcjp = (CustomerWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void comboCardTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCardTypeActionPerformed
        int index = comboCardType.getSelectedIndex();
        CardType ct = ecoSystem.getCardTypeList().getCardTypeList().get(index-1);
        String txt = "<html> Card Provider - " + ct.getName() + "<br/> " +
                "Card Type - " + ct.getCardPlatinumType()+ "<br/> " +
                "Rewards Earned - " + ct.getPointsEarnedPercent()+ "%<br/> " +
                "Credit Limit - " + ct.getLimit()+ "<br/> " +
                "</html>";
        cardDetails.setText(txt);
    }//GEN-LAST:event_comboCardTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnadd;
    private javax.swing.JLabel cardDetails;
    private javax.swing.JComboBox<String> comboCardType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomer;
    // End of variables declaration//GEN-END:variables
}
