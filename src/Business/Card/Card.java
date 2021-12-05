/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Card;

import java.util.Date;

/**
 *
 * @author achintyasingh
 */
public class Card {
    
    private String cardNumber;
    private Date expiryDate;
    private String cardHolderName;
    private String cardType;
    private String cvv;    
    private int creditLimit;
    private int expenditure;
    private int totalPointsEarned;
    private int pointsRemaining;
    private String cardPlatinumType;

    public Card(String cardNumber, Date expiryDate, String cardHolderName, String cardType, String cvv, int creditLimit, int expenditure, int totalPointsEarned, int pointsRemaining, String cardPlatinumType) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cardHolderName = cardHolderName;
        this.cardType = cardType;
        this.cvv = cvv;
        this.creditLimit = creditLimit;
        this.expenditure = expenditure;
        this.totalPointsEarned = totalPointsEarned;
        this.pointsRemaining = pointsRemaining;
        this.cardPlatinumType = cardPlatinumType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
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

    public String getCardPlatinumType() {
        return cardPlatinumType;
    }

    public void setCardPlatinumType(String cardPlatinumType) {
        this.cardPlatinumType = cardPlatinumType;
    }

    
}
