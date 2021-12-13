/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MerchantEmployeeWorkArea;

import userinterface.BankEmployeeWorkArea.*;
import Business.CardType.CardTypeList;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Order.Order;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author somnathsolaskar
 */
public class ManageOrdersMerchantEmployeeJPanel extends javax.swing.JPanel {

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
    ArrayList<String> orderList;
    
    public ManageOrdersMerchantEmployeeJPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.account = account;
        this.cardTypeList = cardTypeList;
        customerUsername = new ArrayList<String>();
        orderList = new ArrayList<String>();
        fillValue();
        btnDelivered.setEnabled(false);
        btnProcessed.setEnabled(false);
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) orderHistory.getModel();
        dtm.setRowCount(0);
        if(ecoSystem.getOrderHistory().getOrderHistory() != null) {
            for(Order order : ecoSystem.getOrderHistory().getOrderHistory()){
                if(order.getCustomer() == customer && order.getIsProduct() == true) {
                    orderList.add(order.getOrderNumber());
                    Object [] row = new Object[8];
                    row[0] = order.getOrderNumber();
                    row[1] = order.getProduct().getName();
                    row[2] = order.getProduct().getPrice();
                    row[3] = order.getQuantity();
                    row[4] = order.getPointsEarned();
                    row[5] = order.getPurchaseDate();
                    row[6] = order.getPaymentMethod().getCardNumber();
                    row[7] = order.getStatus();
                    dtm.addRow(row);                
                }
            }            
        }
    }     
    public void fillValue() {
        
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

        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        cardDetails = new javax.swing.JLabel();
        btnProcessed = new javax.swing.JButton();
        lblManage = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderHistory = new javax.swing.JTable();
        combCustomer = new javax.swing.JComboBox<>();
        lblCustomer = new javax.swing.JLabel();
        btnDelivered = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 102, 204));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/93634-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnProcessed.setText("Order Processed");
        btnProcessed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessedActionPerformed(evt);
            }
        });

        lblManage.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblManage.setForeground(new java.awt.Color(0, 102, 204));
        lblManage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManage.setText("Manage Shopping Orders");

        orderHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order #", "Product Name", "Product Price", "Quantity", "Points Earned", "Order Date", "Payment Method", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(orderHistory);

        combCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combCustomerActionPerformed(evt);
            }
        });

        lblCustomer.setText("Select Customer");

        btnDelivered.setText("Order Delivered");
        btnDelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveredActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnProcessed)
                                .addGap(33, 33, 33)
                                .addComponent(btnDelivered)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblManage, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(lblCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(combCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(cardDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblManage)
                .addGap(7, 7, 7)
                .addComponent(btnBack)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomer)
                    .addComponent(combCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcessed)
                    .addComponent(btnDelivered))
                .addGap(38, 38, 38)
                .addComponent(cardDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessedActionPerformed

        int selectedRow = orderHistory.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String cur = ecoSystem.getOrderHistory().getOrder(orderList.get(selectedRow)).getStatus();
        if(cur.equals("Order Processed")) {
            JOptionPane.showMessageDialog(null,"order has already been processed.", "Warining", JOptionPane.WARNING_MESSAGE);
            return;            
        }
        if(cur.equals("Order Complete")) {
            JOptionPane.showMessageDialog(null,"Order is already complete.", "Warining", JOptionPane.WARNING_MESSAGE);
            return;            
        }

        ecoSystem.getOrderHistory().getOrder(orderList.get(selectedRow)).setStatus("Order Processed");
        fillValue();
        populateTable();
    }//GEN-LAST:event_btnProcessedActionPerformed

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
        String cUsername = customerUsername.get(index-1);
        customer = ecoSystem.getCustomerDirectory().getCustomer(cUsername);
        populateTable();
        btnDelivered.setEnabled(true);
        btnProcessed.setEnabled(true);

    }//GEN-LAST:event_combCustomerActionPerformed

    private void btnDeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveredActionPerformed
        int selectedRow = orderHistory.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String cur = ecoSystem.getOrderHistory().getOrder(orderList.get(selectedRow)).getStatus();
        if(cur.equals("Order Placed")) {
            JOptionPane.showMessageDialog(null,"Please process the order first.", "Warining", JOptionPane.WARNING_MESSAGE);
            return;            
        }
        if(cur.equals("Order Complete")) {
            JOptionPane.showMessageDialog(null,"Order is already complete.", "Warining", JOptionPane.WARNING_MESSAGE);
            return;            
        }
        ecoSystem.getOrderHistory().getOrder(orderList.get(selectedRow)).setStatus("Order Complete");
        fillValue();
        populateTable();
    }//GEN-LAST:event_btnDeliveredActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelivered;
    private javax.swing.JButton btnProcessed;
    private javax.swing.JLabel cardDetails;
    private javax.swing.JComboBox<String> combCustomer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblManage;
    private javax.swing.JTable orderHistory;
    // End of variables declaration//GEN-END:variables
}
