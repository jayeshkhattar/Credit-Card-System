/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Bank;

import java.util.ArrayList;

/**
 *
 * @author achintyasingh
 */
public class BankDirectory {
    
    private ArrayList<Bank> bankDirectory;
    
    public BankDirectory() {
        bankDirectory = new ArrayList();
    }

    public ArrayList<Bank> getBankDirectory() {
        return bankDirectory;
    }

    public void setBankDirectory(ArrayList<Bank> bankDirectory) {
        this.bankDirectory = bankDirectory;
    }
    
    public Bank newBank(String name, String code, String address) {
        Bank bank = new Bank(name, code, address);
        bankDirectory.add(bank);
        return bank;
    }
    
    public void removeBank(Bank bank) {
        bankDirectory.remove(bank);
    }
    
    public Bank getBank(String username) {
        for(Bank b : bankDirectory) {
            if(b.getName().equals(username)) {
                return b;
            }
        }
        return null;
    }
}
