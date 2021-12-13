/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Transaction;

import Business.Card.Card;
import Business.Customer.Customer;

/**
 *
 * @author somnathsolaskar
 */
public class Transaction {
    
   // private String method;
    private String gateway;
    private Long amount;
    private String status;
    private Customer customer;
    private Card card;

      public Transaction(Customer customer ,Long amount, Card card, String gateway, String status) {
        this.customer = customer;
        this.amount = amount;
        this.card = card;
        this.gateway = gateway;
        this.status = status;
      
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
      

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
      
  

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
     @Override
    public String toString() {
        return customer.getName();
    } 
    
    
}
