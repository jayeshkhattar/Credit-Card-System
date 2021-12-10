/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Card;

import Business.CardType.CardType;
import Business.Customer.Customer;
import java.util.Date;

/**
 *
 * @author achintyasingh
 */
public class Card {
    
    private String cardNumber;
    private String expiryDate;
    private String cardHolderName;
    private String cvv;    
    private int creditLimit;
    private int expenditure;
    private int totalPointsEarned;
    private int pointsRemaining;
    private CardType cardType;
    private Customer cardOwner;
    private String status;
    private String reason;
    
    public static final String statusNew = "New Application. Pending Approval";
    public static final String statusActive = "Active";
    public static final String statusRejected = "Rejected";
    public static final String statusDisabled = "Disabled";
    

    public Card(String cardNumber, String expiryDate, String cardHolderName, String cvv, int creditLimit, int expenditure, int totalPointsEarned, int pointsRemaining, CardType cardType, Customer cardOwner, String status) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.creditLimit = creditLimit;
        this.expenditure = expenditure;
        this.totalPointsEarned = totalPointsEarned;
        this.pointsRemaining = pointsRemaining;
        this.cardType = cardType;
        this.cardOwner = cardOwner;
        this.status = status;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(int expenditure) {
        this.expenditure = expenditure;
    }

    public int getTotalPointsEarned() {
        return totalPointsEarned;
    }

    public void setTotalPointsEarned(int totalPointsEarned) {
        this.totalPointsEarned = totalPointsEarned;
    }

    public int getPointsRemaining() {
        return pointsRemaining;
    }

    public void setPointsRemaining(int pointsRemaining) {
        this.pointsRemaining = pointsRemaining;
    }

    public Customer getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(Customer cardOwner) {
        this.cardOwner = cardOwner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return this.cardType.getName();
    }
    
    
}
