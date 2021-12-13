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
                Object [] row = new Object[6];
                row[0] = card;
                row[1] = card.getCardType();
                row[2] = card.getCreditLimit();
                row[3] = card.getCreditAvailable();
                row[4] = card.getStatus();
                row[5] = card.getCardNumber();
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

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Apply New Card");

        btnadd.setText("Apply New Card");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/93634-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        comboCardType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCardTypeActionPerformed(evt);
            }
        });

        tblCustomer.setBackground(new java.awt.Color(204, 255, 204));
        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Card Provider", "Card Type", "Limit", "Available Credit", "Status", "Card Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        jLabel3.setText("Available Cards");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Credit Cards");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboCardType, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnadd)
                .addGap(183, 183, 183))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(cardDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboCardType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd))
                .addGap(1, 1, 1)
                .addComponent(cardDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
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
                JOptionPane.showMessageDialog(null, "Card exists. Please wait for admin to approve the request if it is pending.");
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
