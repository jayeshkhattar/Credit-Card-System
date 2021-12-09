/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Customer;

import Business.Product.Product;
import java.util.Date;

/**
 *
 * @author ashis
 */
public class Shopping {

    private String orderNumber;
    private Product product;
    private Customer customer;
    private Date purchaseDate;
    private String paymentMethod;

    public Shopping(String orderNumber, Product product, Customer customer, Date purchaseDate, String paymentMethod) {
        this.orderNumber = orderNumber;
        this.product = product;
        this.customer = customer;
        this.purchaseDate = purchaseDate;
        this.paymentMethod = paymentMethod;
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

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    
}
