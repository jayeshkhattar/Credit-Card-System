/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import Business.Card.Card;
import Business.Customer.Customer;
import Business.Product.Product;
import Business.Voucher.Voucher;

/**
 *
 * @author ashis
 */
public class Order {

    private String orderNumber;
    private Product product;
    private int quantity;
    private Customer customer;
    private String purchaseDate;
    private Card paymentMethod;
    private float pointsEarned;
    private Voucher voucher;
    private boolean isProduct;
    private float orderAmount;

    public float getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(float orderAmount) {
        if(isProduct == true)
            this.orderAmount = quantity * product.getPrice();
        else
            this.orderAmount = quantity * voucher.getPoints();
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }
    
    public void setIsProduct(boolean isProduct) {
        this.isProduct = isProduct;
    }
    
    public boolean getIsProduct() {
        return this.isProduct;
    }

    public Order(String orderNumber, Product product, int quantity, Customer customer, String  purchaseDate, Card paymentMethod) {
        this.orderNumber = orderNumber;
        this.product = product;
        this.quantity = quantity;
        this.customer = customer;
        this.purchaseDate = purchaseDate;
        this.paymentMethod = paymentMethod;
        this.isProduct = true;
    }
    
    public Order(String orderNumber, Voucher voucher, int quantity, Customer customer, String  purchaseDate, Card paymentMethod) {
        this.orderNumber = orderNumber;
        this.voucher = voucher;
        this.quantity = quantity;
        this.customer = customer;
        this.purchaseDate = purchaseDate;
        this.paymentMethod = paymentMethod;
        this.isProduct = false;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String  getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Card getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Card paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    public void setPointsEarned() {
        this.pointsEarned = quantity * product.getPrice() * paymentMethod.getCardType().getPointsEarnedPercent()/100;
    }
    
    public void setPointsEarned(float PointsEarned) {
        this.pointsEarned = PointsEarned;
    }
    
    public float getPointsEarned() {
        return this.pointsEarned;
    }
    
}
