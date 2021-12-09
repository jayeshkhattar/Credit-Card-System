/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CardType;

import java.util.ArrayList;

/**
 *
 * @author achintyasingh
 */
public class CardTypeList {
    
    private ArrayList<CardType> cardTypeList;
    public CardTypeList() {
        cardTypeList = new ArrayList<CardType>();
    }

    public ArrayList<CardType> getCardTypeList() {
        return cardTypeList;
    }

    public void setCardTypeList(ArrayList<CardType> cardTypeList) {
        this.cardTypeList = cardTypeList;
    }
    
    public CardType newCardCompany(String name, String code,  String cardPlatinumType, int pointsEarnedPercent, int limit ) {
        CardType cardCompany = new CardType(name, code, cardPlatinumType, pointsEarnedPercent,limit);
        cardTypeList.add(cardCompany);
        return cardCompany;
    }
    
    public void removeCardCompany(CardType cardCompany) {
        cardTypeList.remove(cardCompany);
    }
}
