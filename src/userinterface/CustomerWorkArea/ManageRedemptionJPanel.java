/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerWorkArea;

import Business.Card.Card;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Merchant.Merchant;
import Business.Merchant.MerchantDirectory;
import Business.Order.Order;
import Business.Product.Product;
import Business.Voucher.Voucher;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author achintyasingh
 */
public class ManageRedemptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoShopping
     */
    private JPanel userProcessContainer; 
    private EcoSystem ecoSystem; 
    private MerchantDirectory merchantDirectory;
    private UserAccount account;
    private Customer customer;
    private int totalamt=0;
    DefaultTableModel dtm2;
    ArrayList<Order> orderList;
    ArrayList<String> merchantList;
    ArrayList<String> paymentCardList;
    
    
        
    public ManageRedemptionJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, MerchantDirectory merchantDirectory, Customer customer) {
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.merchantDirectory = merchantDirectory;
        this.account=account;
        this.customer = customer;
        paymentCardList = new ArrayList<String>();
        orderList = new ArrayList<Order>();
        this.dtm2 = (DefaultTableModel) cart.getModel();
        dtm2.setRowCount(0);
        fillvalues();
        populateTable();
        voucherCategory.setEnabled(false);
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) orderHistory.getModel();
        dtm.setRowCount(0);
        if(ecoSystem.getOrderHistory().getOrderHistory() != null) {
            for(Order order : ecoSystem.getOrderHistory().getOrderHistory()){
                if(order.getCustomer() == customer && order.getIsProduct() == false) {
                    Object [] row = new Object[7];
                    row[0] = order.getOrderNumber();
                    row[1] = order.getVoucher().getName();
                    row[2] = order.getQuantity();
                    row[3] = order.getOrderAmount();
                    row[4] = order.getPurchaseDate();
                    row[5] = order.getPaymentMethod().getCardNumber();
                    dtm.addRow(row);                
                }
            }            
        }
    }    
    
    public void fillvalues(){
        merchantList = new ArrayList<String>();
        merchantList.add("Select");
        for(Merchant ct : ecoSystem.getMerchantDirectory().getMerchantDirectory()) {
            merchantList.add(ct.getName());
        }
        String[] cardTypeLstArray = new String[merchantList.size()];
        cardTypeLstArray = merchantList.toArray(cardTypeLstArray);
        MerchantList.setModel(new javax.swing.DefaultComboBoxModel(cardTypeLstArray));
        
        ArrayList<String> payList = new ArrayList<String>();
        payList.add("Select");
        for(Card ct : ecoSystem.getCardDirectory().getCardDirectory()) {
            if(ct.getCardOwner() == customer && ct.getStatus().equals(Card.statusActive) == true) {
                paymentCardList.add(ct.getCardNumber());
                payList.add(ct.getCardType().getName()+"-"+ct.getCardType().getCardPlatinumType()+": "+ct.getCardNumber());
            }
        }
        String[] cardLstArray = new String[payList.size()];
        cardLstArray = payList.toArray(cardLstArray);
        paymentList.setModel(new javax.swing.DefaultComboBoxModel(cardLstArray));

    }
    
    
    public void populateMerchantOffersTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) merchantOffersTable.getModel();
        dtm.setRowCount(0);
        for(Product product : ecoSystem.getProductDirectory().getProductDirectory()){
            Object [] row = new Object[4];
            row[0] = product;
            row[1] = product.getName();
            row[2] = product.getPoints();
            row[3] = product.getPrice();
            dtm.addRow(row);
        }
    }    

    /**
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblHeader = new javax.swing.JLabel();
        qty = new javax.swing.JSpinner();
        btnAddtoCart = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        merchantOffersTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        MerchantList = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        voucherCategory = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        availablePoints = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cart = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        totamt = new javax.swing.JLabel();
        btnCheckout = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        orderHistory = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        paymentList = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel13.setText("Nike 20% Off ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHeader.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHeader.setText("Manage Vocher Redemptions");

        qty.setValue(1);

        btnAddtoCart.setText("Add");
        btnAddtoCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoCartActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel17.setText("Redemptions List");

        merchantOffersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Offer", "Category", "Points Needed"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(merchantOffersTable);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        MerchantList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Electronics", "Clothing", "Food", "Home Decor", "Baby Products", "Beauty and Health" }));
        MerchantList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MerchantListActionPerformed(evt);
            }
        });

        jLabel4.setText("Merchant");

        jLabel5.setText("Vocher Category");

        voucherCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Electronics", "Clothing", "Food", "Home Decor", "Baby Products", "Beauty and Health" }));
        voucherCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voucherCategoryActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel6.setText("Total Points Available :");

        availablePoints.setFont(new java.awt.Font("Lucida Grande", 0, 19)); // NOI18N
        availablePoints.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cart Items", "Quantity", "Points Used"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(cart);

        jLabel3.setText("Sum Total Points:");

        totamt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCheckout.setText("Confirm Order");
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });

        orderHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order #", "Voucher Name", "Quantity", "Points Redeemed", "Order Date", "Payment Method"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(orderHistory);

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel18.setText("Select Quantity");

        jLabel7.setText("Mode of Payment:");

        paymentList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        paymentList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentListActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnBack)
                        .addGap(369, 369, 369)
                        .addComponent(lblHeader))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCheckout)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel18)
                                .addGap(5, 5, 5)
                                .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAddtoCart)
                                .addGap(372, 372, 372)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(paymentList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(totamt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(jLabel4)
                                        .addGap(5, 5, 5)
                                        .addComponent(MerchantList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addGap(9, 9, 9)
                                        .addComponent(voucherCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnSearch)))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(availablePoints, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnBack))
                    .addComponent(lblHeader))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(MerchantList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(voucherCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSearch))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(availablePoints, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddtoCart)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totamt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(paymentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(btnDelete)))))
                .addGap(18, 18, 18)
                .addComponent(btnCheckout)
                .addGap(78, 78, 78)
                .addComponent(jLabel17)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        // TODO add your handling code here:
        DefaultTableModel cart1 = (DefaultTableModel) cart.getModel();
        int rowSize = cart1.getRowCount();
        if(rowSize <= 0) {
            JOptionPane.showMessageDialog(null,"Cart is empty. Please add vouchers to confirm order.", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int selectedRow =  paymentList.getSelectedIndex();
        Card card;
        if(selectedRow <= 0) {
            JOptionPane.showMessageDialog(null,"Please Select a payment method to continue.", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else {
            String cardNum  = "" + (paymentCardList.get(selectedRow - 1));
            card = ecoSystem.getCardDirectory().getCard(cardNum);
        }
        float remainingCredits = card.getPointsRemaining()-totalamt;
        if(remainingCredits < 0) {
            JOptionPane.showMessageDialog(null, "You do not have enough points to complete this purchase.");
            return;
        }
        int length = (ecoSystem.getOrderHistory() != null && ecoSystem.getOrderHistory().getOrderHistory() != null) ?  ecoSystem.getOrderHistory().getOrderHistory().size() : 0;        
        float remainingPoints = ecoSystem.getCustomerDirectory().getCustomer(customer.getUserame()).getTotalPointsEarned()-Integer.parseInt(totamt.getText());
        
        for(Order ord : orderList) {
            ord.setPaymentMethod(card);
            ord.setOrderNumber("VOUCH#"+length);
//            ord.setPurchaseDate(dtf.format(now)+"");
//            pointsEarned += ord.getPointsEarned();
       }

        if((ecoSystem.getCustomerDirectory().getCustomer(customer.getUserame()).getTotalPointsEarned()-Integer.parseInt(totamt.getText()))>=0)
        {
            ecoSystem.getCustomerDirectory().getCustomer(customer.getUserame()).setTotalPointsEarned( remainingPoints);
            ecoSystem.getOrderHistory().addOrderList(orderList);            
            JOptionPane.showMessageDialog(null, "Congratulations - Your purchase is complete!");
//            completion.setVisible(true);
//            completion.setText("Congratulations - Your purchase is complete!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, " Uh oh! You do not have enough Points.");
        }
        
        
        for(Order ord : orderList) {
            ord.setPaymentMethod(card);
        }
        ecoSystem.getOrderHistory().addOrderList(orderList);  
    }//GEN-LAST:event_btnCheckoutActionPerformed

    private void btnAddtoCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoCartActionPerformed
        // TODO add your handling code here:
        int selectedRow = merchantOffersTable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int qnty = (int) qty.getValue();
        if(qnty <= 0) {
            JOptionPane.showMessageDialog(null,"Quantity should be atleast 1", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int length = (ecoSystem.getOrderHistory() != null && ecoSystem.getOrderHistory().getOrderHistory() != null) ?  ecoSystem.getOrderHistory().getOrderHistory().size() : 0;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");  
        LocalDateTime now = LocalDateTime.now();
        float pointsEarned = 0;

        Voucher voucher = (Voucher) merchantOffersTable.getValueAt(selectedRow, 0);
        String orderNumber = "";
        Order order = new Order(orderNumber, voucher, qnty, customer, null, null); 
        orderList.add(order);
        
        dtm2 = (DefaultTableModel) cart.getModel();
        dtm2.setRowCount(0);
        totalamt = 0;
        for(Order ord : orderList){
            Object [] row = new Object[3];
            row[0] = ord.getVoucher();
            row[1] = ord.getQuantity();
            row[2] = ord.getVoucher().getPoints()*ord.getQuantity();
            totalamt+=ord.getVoucher().getPoints()*ord.getQuantity();
            dtm2.addRow(row);
        }
        totamt.setText(""+totalamt);
    
        for(Order ord : orderList) {
            length++;
            ord.setOrderNumber("VOU#"+length);
            ord.setPurchaseDate(dtf.format(now)+"");
            ord.setPointsEarned(ord.getPointsEarned()-(ord.getVoucher().getPoints()*ord.getQuantity()));
            
        }
        
    }//GEN-LAST:event_btnAddtoCartActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void MerchantListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MerchantListActionPerformed
        String item = MerchantList.getSelectedItem().toString();
        if(item.equals("Select")) {
            voucherCategory.setSelectedItem("Select");
            voucherCategory.setEnabled(false);
        }
        else if(item != "Select") {
            Merchant merchant = (Merchant) ecoSystem.getMerchantDirectory().getMerchant(item);
            voucherCategory.setEnabled(true);

            ArrayList<String> categoryList = new ArrayList<String>();
            categoryList.add("Select");
            for(Voucher ct : ecoSystem.getVoucherList().getVoucherList()) {
                if(ct.getMerchant().getName().equals(merchant.getName()))
                categoryList.add(ct.getCategory());
            }
            String[] cardTypeLstArray = new String[categoryList.size()];
            cardTypeLstArray = categoryList.toArray(cardTypeLstArray);
            voucherCategory.setModel(new javax.swing.DefaultComboBoxModel(cardTypeLstArray));
        }
    }//GEN-LAST:event_MerchantListActionPerformed

    private void voucherCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voucherCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voucherCategoryActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        String rowi = voucherCategory.getSelectedItem().toString();
        if(rowi.equals("Select")) {
            JOptionPane.showMessageDialog(null,"Please select a category to proceed further.", "Warining", JOptionPane.WARNING_MESSAGE);
            return;            
        }

        DefaultTableModel dtm = (DefaultTableModel) merchantOffersTable.getModel();
        dtm.setRowCount(0);
        String category = voucherCategory.getSelectedItem().toString();
        //Product product = ecoSystem.getProductDirectory().getProductDirectory();
        for(Voucher voucher : ecoSystem.getVoucherList().getVoucherList())
        {
            if(voucher.getCategory().equalsIgnoreCase(category))
            {
                Object [] row = new Object[3];
                row[0] = voucher;
                row[1] = voucher.getCategory();
                row[2] = voucher.getPoints();
                dtm.addRow(row);
            }
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void paymentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentListActionPerformed
        // TODO add your handling code here:
        availablePoints.setText(""+ecoSystem.getCustomerDirectory().getCustomer(customer.getUserame()).getTotalPointsEarned());

    }//GEN-LAST:event_paymentListActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        DefaultTableModel cart1 = (DefaultTableModel) cart.getModel();
        int rowSize = cart1.getRowCount();
        if(rowSize <= 0) {
            JOptionPane.showMessageDialog(null,"Cart is already empty.", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int selectedRow = cart.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        orderList.remove(selectedRow);
        totalamt = 0;
        this.dtm2 = (DefaultTableModel) cart.getModel();
        dtm2.setRowCount(0);
        for(Order ord : orderList){
            Object [] row = new Object[5];
            row[0] = ord.getProduct();
            row[1] = ord.getProduct().getName();
            row[2] = ord.getProduct().getPrice()*ord.getQuantity();
            row[3] = ord.getQuantity();
            row[4] = ord.getProduct().getPrice()*ord.getQuantity();
            totalamt+=ord.getProduct().getPrice()*ord.getQuantity();
            dtm2.addRow(row);
        }
        totamt.setText(""+totalamt);    
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> MerchantList;
    private javax.swing.JLabel availablePoints;
    private javax.swing.JButton btnAddtoCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTable cart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTable merchantOffersTable;
    private javax.swing.JTable orderHistory;
    private javax.swing.JComboBox<String> paymentList;
    private javax.swing.JSpinner qty;
    private javax.swing.JLabel totamt;
    private javax.swing.JComboBox<String> voucherCategory;
    // End of variables declaration//GEN-END:variables
}
