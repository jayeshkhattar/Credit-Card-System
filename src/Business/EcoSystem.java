/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import Business.Bank.BankDirectory;
import Business.CardCompany.CardCompanyDirectory;
import Business.Merchant.MerchantDirectory;


/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private CustomerDirectory customerDirectory;
    private BankDirectory bankDirectory;
    private CardCompanyDirectory cardCompanyDirectory;
    private MerchantDirectory merchantDirectory;
    

    public EcoSystem() {
        super(null);
        customerDirectory = new CustomerDirectory();
        bankDirectory = new BankDirectory();
        cardCompanyDirectory = new CardCompanyDirectory();
        merchantDirectory = new MerchantDirectory();
        
    }
    
    public EcoSystem(CustomerDirectory customerDirectory, BankDirectory bankDirectory, CardCompanyDirectory cardCompanyDirectory, MerchantDirectory merchantDirectory) {

        this.customerDirectory = customerDirectory;
        this.bankDirectory = bankDirectory;
        this.cardCompanyDirectory = cardCompanyDirectory;
        this.merchantDirectory = merchantDirectory;
        
    }


    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

      public BankDirectory getBankDirectory() {
        return bankDirectory;
    }

    public void setBankDirectory(BankDirectory bankDirectory) {
        this.bankDirectory = bankDirectory;
    }

    public CardCompanyDirectory getCardCompanyDirectory() {
        return cardCompanyDirectory;
    }

    public void setCardCompanyDirectory(CardCompanyDirectory cardCompanyDirectory) {
        this.cardCompanyDirectory = cardCompanyDirectory;
    }
    
    

    public MerchantDirectory getMerchantDirectory() {
        return merchantDirectory;
    }

    public void setMerchantDirectory(MerchantDirectory merchantDirectory) {
        this.merchantDirectory = merchantDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    
    public boolean checkIfUserIsUnique(String userName){
        //
       return false;
    }

    
}