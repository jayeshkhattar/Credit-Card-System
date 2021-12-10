/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BankAdminWorkArea;

import Business.Bank.Bank;
import Business.Card.Card;
import Business.Card.CardDirectory;
import javax.swing.JPanel;
import Business.EcoSystem;
import Business.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author jayesh
 */
public class ManageCreditCardsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageBankJPanel
     */
    private JPanel userProcessContainer; 
    private EcoSystem ecoSystem; 
    private CardDirectory cardDirectory;
    private UserAccount account;
    private Bank bank;
    
    public ManageCreditCardsJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, CardDirectory cardDirectory, Bank bank) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account= account;
        this.ecoSystem = ecoSystem;
        this.cardDirectory = cardDirectory;
        this.bank = bank;
        populateTable();
    }
    
        public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblCreditCard.getModel();
        dtm.setRowCount(0);
        for(Card card : ecoSystem.getCardDirectory().getCardDirectory()) {
            if(card.getCardOwner().getBankName().equals(bank.getName())) {
                Object [] row = new Object[6];
                row[0] = card;
                row[1] = card.getCardOwner().getName();
                row[2] = card.getCardNumber();
                row[3] = card.getStatus();
                row[4] = card.getCardType().getCardPlatinumType();
                row[5] = card.getCreditLimit();
                dtm.addRow(row);                
            }
        }
        }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCreditCard = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        btnDisable = new javax.swing.JButton();

        tblCreditCard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Card Provider", "Customer Name", "Card Number", "Card Status", "Card Type", "Credit Limit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCreditCard);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREDIT CARD MANAGEMENT");

        btnApprove.setText("Approve Request");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnReject.setText("Reject Request");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        btnDisable.setText("Disable Card");
        btnDisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDisable))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReject)
                    .addComponent(btnDisable))
                .addContainerGap(346, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        int index = tblCreditCard.getSelectedRow();
        if(index < 0) {
            JOptionPane.showMessageDialog(null,Organization.selectRow, "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int cnt = 0;
        for(Card card : ecoSystem.getCardDirectory().getCardDirectory()) {
            if(cnt == index) {
                if(card.getStatus().equals(Card.statusNew)) {
                    card.setStatus(Card.statusActive);
                    long first16 = (long) (Math.random() * 10000000000000000L);
                    card.setCardNumber(String.valueOf(first16));
//                    card.setExpiryDate();
                    card.setCardHolderName(card.getCardOwner().getName());
                    int first3 = (int) (Math.random() * 100L);
                    card.setCvv(String.valueOf(first3));
                    card.setCreditLimit(card.getCardType().getLimit());
                    card.setExpenditure(0);
                    card.setTotalPointsEarned(0);
                    card.setPointsRemaining(0);
                }
                else if(card.getStatus().equals(Card.statusActive))
                    JOptionPane.showMessageDialog(null,"The card is already active.", "Warining", JOptionPane.WARNING_MESSAGE);            
                else if(card.getStatus().equals(Card.statusRejected))
                    JOptionPane.showMessageDialog(null,"This application was rejected. Please select another card.", "Warining", JOptionPane.WARNING_MESSAGE);            
                else if(card.getStatus().equals(Card.statusDisabled))
                    JOptionPane.showMessageDialog(null,"This card is disabled. Please select another card.", "Warining", JOptionPane.WARNING_MESSAGE);
            }
            cnt++;
        }
        populateTable();
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnDisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisableActionPerformed
        // TODO add your handling code here:
        int index = tblCreditCard.getSelectedRow();
        if(index < 0) {
            JOptionPane.showMessageDialog(null,Organization.selectRow, "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int cnt = 0;
        for(Card card : ecoSystem.getCardDirectory().getCardDirectory()) {
            if(cnt == index) {
                if(card.getStatus().equals(Card.statusNew)) {
                    JOptionPane.showMessageDialog(null,"This is not allowed.", "Warining", JOptionPane.WARNING_MESSAGE);            
                }
                else if(card.getStatus().equals(Card.statusActive))
                    card.setStatus(Card.statusDisabled);
                else if(card.getStatus().equals(Card.statusRejected))
                    JOptionPane.showMessageDialog(null,"This application is  rejected. Please select another card.", "Warining", JOptionPane.WARNING_MESSAGE);            
                else if(card.getStatus().equals(Card.statusDisabled))
                    JOptionPane.showMessageDialog(null,"This card is already disabled.", "Warining", JOptionPane.WARNING_MESSAGE);
            }
            cnt++;
        }
        populateTable();
    }//GEN-LAST:event_btnDisableActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        int index = tblCreditCard.getSelectedRow();
        if(index < 0) {
            JOptionPane.showMessageDialog(null, Organization.selectRow, "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int cnt = 0;
        for(Card card : ecoSystem.getCardDirectory().getCardDirectory()) {
            if(cnt == index) {
                if(card.getStatus().equals(Card.statusNew)) {
                    card.setStatus(Card.statusRejected);
                }
                else if(card.getStatus().equals(Card.statusActive))
                    JOptionPane.showMessageDialog(null,"This card is already active. Please disable or select another card.", "Warining", JOptionPane.WARNING_MESSAGE);            
                else if(card.getStatus().equals(Card.statusRejected))
                    JOptionPane.showMessageDialog(null,"This application is already rejected.", "Warining", JOptionPane.WARNING_MESSAGE);            
                else if(card.getStatus().equals(Card.statusDisabled))
                    JOptionPane.showMessageDialog(null,"This card is disabled. Please select another card.", "Warining", JOptionPane.WARNING_MESSAGE);
            }
            cnt++;
        }
        populateTable();
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDisable;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCreditCard;
    // End of variables declaration//GEN-END:variables

  
}
