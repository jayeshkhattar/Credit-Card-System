/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Card;

import Business.CardType.CardType;
import Business.Customer.Customer;

/**
 *
 * @author achintyasingh
 */
public class Card {
    
    private String cardNumber;
    private String expiryDate;
    private String cardHolderName;
    private String cvv;
    private CardType cardType;
    private Customer cardOwner;
    private String status;
    private String reason;

    private float totalPointsEarned;
    private float pointsUsed;
    private float pointsRemaining;
    private float creditAvailable;
    private float creditLimit;
    private float expenditure;
    
    
    public static final String statusNew = "Pending Approval";
    public static final String statusActive = "Active";
    public static final String statusRejected = "Rejected";
    public static final String statusDisabled = "Disabled";
    
    
    
    public Card(String cardNumber, String expiryDate, String cardHolderName, String cvv, float creditLimit, float expenditure, float totalPointsEarned, float pointsRemaining, CardType cardType, Customer cardOwner, String status, float creditAvailable) {
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
        this.creditAvailable = creditAvailable;
    }
    
    public float getCreditAvailable() {
        return creditAvailable;
    }

    public void setCreditAvailable() {
        this.creditAvailable = creditLimit-expenditure;
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

    public float getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
        setCreditAvailable();
    }

    public float getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(float expenditure) {
        this.expenditure = expenditure;
        setCreditAvailable();
    }
    
    

    public float  getTotalPointsEarned() {
        return totalPointsEarned;
    }

    public void setTotalPointsEarned(float totalPointsEarned) {
        this.totalPointsEarned = totalPointsEarned;
    }

    public float getPointsRemaining() {
        return pointsRemaining;
    }

    public void setPointsRemaining(float pointsRemaining) {
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public float getPointsUsed() {
        return pointsUsed;
    }

    public void setPointsUsed(float pointsUsed) {
        this.pointsUsed = pointsUsed;
    }
    
    
    @Override
    public String toString() {
        return this.cardType.getName();
    }
    
    
}
