/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CardCompany;

import java.util.ArrayList;

/**
 *
 * @author achintyasingh
 */
public class CardCompanyDirectory {
    
    private ArrayList<CardCompany> cardCompanyDirectory;
    public CardCompanyDirectory() {
        cardCompanyDirectory = new ArrayList<CardCompany>();
    }

    public ArrayList<CardCompany> getCardCompanyDirectory() {
        return cardCompanyDirectory;
    }

    public void setCardCompanyDirectory(ArrayList<CardCompany> cardCompanyDirectory) {
        this.cardCompanyDirectory = cardCompanyDirectory;
    }
    
    public CardCompany newCardCompany(String name, String code, String address) {
        CardCompany cardCompany = new CardCompany(name, code, address);
        cardCompanyDirectory.add(cardCompany);
        return cardCompany;
    }
    
    public void removeCardCompany(CardCompany cardCompany) {
        cardCompanyDirectory.remove(cardCompany);
    }
}
