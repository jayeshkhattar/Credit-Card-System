/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MerchantEmployee;

import Business.Merchant.Merchant;

/**
 *
 * @author somnathsolaskar
 */
public class MerchantEmployee {
    
    private String name;
    private String address;
    private String code;
    private String phoneNumber;
    private Merchant merchant;

    public MerchantEmployee(String name, String address, String code, String phoneNumber, Merchant merchant) {
        this.name = name;
        this.address = address;
        this.code = code;
        this.phoneNumber = phoneNumber;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
     @Override
    public String toString() {
        return code;
    } 
    
    
}
