/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerWorkArea;

import Business.Card.Card;
import Business.Customer.Customer;
import Business.Order.Order;
import javax.swing.JPanel;
import Business.EcoSystem;
import Business.Merchant.Merchant;
import Business.Product.Product;
import Business.Product.ProductDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author somnathsolaskar
 */
public class ManageShoppingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageBankJPanel
     */
    private JPanel userProcessContainer; 
    private EcoSystem ecoSystem; 
    private ProductDirectory productDirectory;
    private UserAccount account;
    private Customer customer;
    float totalamt=0;
    DefaultTableModel dtm2;
    ArrayList<String> merchantList;
    ArrayList<Order> orderList;
    ArrayList<String> paymentCardList;
    
    public ManageShoppingJPanel(JPanel userProcessContainer,  UserAccount account, EcoSystem ecoSystem, ProductDirectory productDirectory, Customer customer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.account = account;
        this.productDirectory = productDirectory;
        this.customer = customer;
        orderList = new ArrayList<Order>();
        paymentCardList = new ArrayList<String>();
        fillValue();
        populateTable();
    }
    public void fillValue() {
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
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) orderHistory.getModel();
        dtm.setRowCount(0);
        if(ecoSystem.getOrderHistory().getOrderHistory() != null) {
            for(Order order : ecoSystem.getOrderHistory().getOrderHistory()){
                if(order.getCustomer() == customer && order.getIsProduct() == true) {
                    Object [] row = new Object[7];
                    row[0] = order.getOrderNumber();
                    row[1] = order.getProduct().getName();
                    row[2] = order.getProduct().getPrice();
                    row[3] = order.getQuantity();
                    row[4] = order.getPointsEarned();
                    row[5] = order.getPurchaseDate();
                    row[6] = order.getPaymentMethod().getCardNumber();
                    dtm.addRow(row);                
                }
            }            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JPanel = new javax.swing.JPanel();
        btnShop = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        totamt = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cart = new javax.swing.JTable();
        paymentList = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderHistory = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        productCategory = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        qty = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        MerchantList = new javax.swing.JComboBox<>();

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE SHOPPING");

        btnShop.setText("Confirm Order");
        btnShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShopActionPerformed(evt);
            }
        });

        jLabel5.setText("Total Amount:");

        cart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product Name", "Product Category", "Product Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(cart);

        paymentList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Electronics", "Clothing", "Food", "Home Decor", "Baby Products", "Beauty and Health" }));
        paymentList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentListActionPerformed(evt);
            }
        });

        jLabel6.setText("Payment Method");

        orderHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Order #", "Product Name", "Product Price", "Quantity", "Points Earned", "Order Date", "Payment Method"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(orderHistory);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Order List");

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1229, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnShop)
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(paymentList, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totamt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1229, Short.MAX_VALUE)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totamt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(paymentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(btnDelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShop, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
        );

        jLabel2.setText("Product Category");

        productCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Electronics", "Clothing", "Food", "Home Decor", "Baby Products", "Beauty and Health" }));
        productCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productCategoryActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantity");

        qty.setValue(1);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Product Category", "Product Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        jLabel3.setText("Merchant");

        MerchantList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Electronics", "Clothing", "Food", "Home Decor", "Baby Products", "Beauty and Health" }));
        MerchantList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MerchantListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(JPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1229, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdd))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(55, 55, 55)
                                .addComponent(MerchantList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(55, 55, 55)
                                .addComponent(productCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnSearch)))
                        .addGap(0, 610, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(productCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(jLabel3)
                    .addComponent(MerchantList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerWorkAreaJPanel mcjp = (CustomerWorkAreaJPanel) component;
        mcjp.setText();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShopActionPerformed

        DefaultTableModel cart1 = (DefaultTableModel) cart.getModel();
        int rowSize = cart1.getRowCount();
        if(rowSize <= 0) {
            JOptionPane.showMessageDialog(null,"Cart is empty. Please add products to confirm order.", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int selectedRow =  paymentList.getSelectedIndex();
        Card card;
        if(selectedRow <= 0) {
            JOptionPane.showMessageDialog(null,"Please Select a payment method to continue", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else {
            String cardNum  = paymentCardList.get(selectedRow - 1);
            card = ecoSystem.getCardDirectory().getCard(cardNum);
        }
        float remainingCredits = card.getCreditAvailable()-totalamt;
        if(remainingCredits < 0) {
            JOptionPane.showMessageDialog(null, "You do not have enough credit limit to complete this purchase.");
            return;
        }
        
        int length = (ecoSystem.getOrderHistory() != null && ecoSystem.getOrderHistory().getOrderHistory() != null) ?  ecoSystem.getOrderHistory().getOrderHistory().size() : 0;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");  
        LocalDateTime now = LocalDateTime.now();
        float pointsEarned = 0;
        for(Order ord : orderList) {
            length++;
            ord.setPaymentMethod(card);
            ord.setOrderNumber("ORD#"+length);
            ord.setPurchaseDate(dtf.format(now)+"");
            ord.setPointsEarned();
            pointsEarned += ord.getPointsEarned();
        }
        ecoSystem.getOrderHistory().addOrderList(orderList);        
        float expend = totalamt;
        ecoSystem.getCardDirectory().getCard(card.getCardNumber()).setExpenditure(expend);

        float totalPoints = ecoSystem.getCardDirectory().getCard(card.getCardNumber()).getTotalPointsEarned();
        ecoSystem.getCardDirectory().getCard(card.getCardNumber()).setTotalPointsEarned(totalPoints + pointsEarned);
        
        float totalPointsRemaing = ecoSystem.getCardDirectory().getCard(card.getCardNumber()).getPointsRemaining();
        ecoSystem.getCardDirectory().getCard(card.getCardNumber()).setPointsRemaining(totalPointsRemaing + pointsEarned);

        float totalPointsCustomer = ecoSystem.getCustomerDirectory().getCustomer(customer.getUserame()).getTotalPointsEarned();
        ecoSystem.getCustomerDirectory().getCustomer(customer.getUserame()).setTotalPointsEarned(totalPointsCustomer + pointsEarned);

        float totalDueCustomer = ecoSystem.getCustomerDirectory().getCustomer(customer.getUserame()).getExpenditure();
        ecoSystem.getCustomerDirectory().getCustomer(customer.getUserame()).setExpenditure(totalDueCustomer + totalamt);
        
        JOptionPane.showMessageDialog(null, "Congratulations - Your purchase is complete!");
        populateTable();
        //card.setPoints()
    }//GEN-LAST:event_btnShopActionPerformed

    private void productCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productCategoryActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCustomer.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int qnty = (int) qty.getValue();
        if(qnty <= 0) {
            JOptionPane.showMessageDialog(null,"Quantity should be atleast 1", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        

        Product product = (Product) tblCustomer.getValueAt(selectedRow, 0);
        String orderNumber = "";
        this.dtm2 = (DefaultTableModel) cart.getModel();
        dtm2.setRowCount(0);
        Order order = new Order(orderNumber, product, qnty, customer, null, null); 
        orderList.add(order);
        //totalamt = 0;
        for(Order ord : orderList){
            Object [] row = new Object[5];
            row[0] = ord.getProduct();
            row[1] = ord.getProduct().getName();
            row[2] = ord.getProduct().getPrice()*ord.getQuantity();
            row[3] = ord.getQuantity();
            row[4] = ord.getProduct().getPrice()*ord.getQuantity();
            dtm2.addRow(row);
        }
        totalamt+= order.getProduct().getPrice()*order.getQuantity();
        totamt.setText(""+totalamt);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tblCustomer.getModel();
        dtm.setRowCount(0);
        String category = productCategory.getSelectedItem().toString();
        //Product product = ecoSystem.getProductDirectory().getProductDirectory();
        for(Product product : ecoSystem.getProductDirectory().getProductDirectory())
        {
            if(product.getCategory().equalsIgnoreCase(category))
            {
                Object [] row = new Object[3];
                row[0] = product;
                row[1] = product.getCategory();
                row[2] = product.getPrice();
                dtm.addRow(row);
            }
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void MerchantListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MerchantListActionPerformed
        String item = MerchantList.getSelectedItem().toString();
        if(item != "Select") {
            Merchant merchant = (Merchant) ecoSystem.getMerchantDirectory().getMerchant(item);

            ArrayList<String> categoryList = new ArrayList<String>();
            categoryList.add("Select");
            for(Product ct : ecoSystem.getProductDirectory().getProductDirectory()) {
                if(ct.getMerchant().getName().equals(merchant.getName()))
                    categoryList.add(ct.getCategory());
            }
            String[] cardTypeLstArray = new String[categoryList.size()];
            cardTypeLstArray = categoryList.toArray(cardTypeLstArray);
            productCategory.setModel(new javax.swing.DefaultComboBoxModel(cardTypeLstArray));            
        }
    }//GEN-LAST:event_MerchantListActionPerformed

    private void paymentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentListActionPerformed
        // TODO add your handling code here:
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
        System.out.println("---"+selectedRow);
        for(Order ord : orderList){
            System.out.println("-1-"+ord.getProduct().getName()+"--"+ord.getQuantity());
        }
        orderList.remove(selectedRow);
        for(Order ord : orderList){
            System.out.println("-2-"+ord.getProduct().getName()+"--"+ord.getQuantity());
        }
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
    private javax.swing.JPanel JPanel;
    private javax.swing.JComboBox<String> MerchantList;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShop;
    private javax.swing.JTable cart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable orderHistory;
    private javax.swing.JComboBox<String> paymentList;
    private javax.swing.JComboBox<String> productCategory;
    private javax.swing.JSpinner qty;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JLabel totamt;
    // End of variables declaration//GEN-END:variables

  
}
