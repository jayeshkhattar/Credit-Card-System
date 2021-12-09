/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CardType;

/**
 *
 * @author achintyasingh
 */
public class CardType {
    
    private String name;
    private String code;
    private String cardPlatinumType;
    private int pointsEarnedPercent;
    private int limit;

    public CardType(String name, String code, String cardPlatinumType, int pointsEarnedPercent, int limit) {
        this.name = name;
        this.code = code;
        this.cardPlatinumType = cardPlatinumType;
        this.pointsEarnedPercent = pointsEarnedPercent;
        this.limit = limit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return name;
    }    

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getCardPlatinumType() {
        return cardPlatinumType;
    }

    public void setCardPlatinumType(String cardPlatinumType) {
        this.cardPlatinumType = cardPlatinumType;
    }

    public int getPointsEarnedPercent() {
        return pointsEarnedPercent;
    }

    public void setPointsEarnedPercent(int pointsEarnedPercent) {
        this.pointsEarnedPercent = pointsEarnedPercent;
    }

}
