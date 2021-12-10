/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Product;

import Business.Merchant.Merchant;

/**
 *
 * @author achintyasingh
 */
public class Product {
    
    private String name;
    private String code;
    private int price;
    private String category;
   // private String productType;//Sell/Redeem
    private int points;
    private Merchant merchant;

    public Product(String name, String code, int price, String category,  Merchant merchant) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.category = category;
        this.merchant = merchant;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
         @Override
    public String toString() {
        return name;
    } 
    
}
