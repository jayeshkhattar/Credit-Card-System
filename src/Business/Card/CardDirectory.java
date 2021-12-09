/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Card;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author achintyasingh
 */
public class CardDirectory {
    
    private ArrayList<Card> cardDirectory;
    
    public CardDirectory() {
        cardDirectory = new ArrayList();
    }

    public ArrayList<Card> getCardDirectory() {
        return cardDirectory;
    }

    public void setCardDirectory(ArrayList<Card> bankDirectory) {
        this.cardDirectory = cardDirectory;
    }
    
    public Card newCard(String cardNumber, Date expiryDate, String cardHolderName, String cardType, String cvv, int creditLimit, int expenditure, int totalPointsEarned, int pointsRemaining, String cardPlatinumType) {
        Card card = new Card(cardNumber, expiryDate, cardHolderName, cardType, cvv, creditLimit, expenditure, totalPointsEarned, pointsRemaining, cardPlatinumType);
        cardDirectory.add(card);
        return card;
    }
    
    public void removeCard(Card card) {
        cardDirectory.remove(card);
    }

    
}
