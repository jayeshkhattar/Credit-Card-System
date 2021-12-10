/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Voucher;

import Business.Merchant.Merchant;

/**
 *
 * @author somnathsolaskar
 */
public class Voucher {
    
   private String name;
   private String code;
   private int points;
   private String category;
   private Merchant merchant;
   
    public Voucher(String name, String code, int points, String category, Merchant merchant) {
        this.name = name;
        this.code = code;
        this.category = category;
        this.points = points;
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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
   
    @Override
    public String toString() {
        return name;
    } 
   
    
}
