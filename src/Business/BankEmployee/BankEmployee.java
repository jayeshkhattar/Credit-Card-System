/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BankEmployee;

import Business.Bank.Bank;
import Business.Product.ProductDirectory;

/**
 *
 * @author somnathsolaskar
 */
public class BankEmployee {
    
    private String name;
    private String address;
    private String code;
    private String phoneNumber;
    private Bank bank;
    private String role;

    public BankEmployee(String name, String address, String code, String phoneNumber, String role, Bank bank) {
        this.name = name;
        this.address = address;
        this.code = code;
        this.phoneNumber = phoneNumber;
        this.bank = bank;
        this.role = role;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    
     @Override
    public String toString() {
        return name;
    } 
    
    
}
