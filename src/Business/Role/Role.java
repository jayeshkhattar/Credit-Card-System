/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Bank.BankDirectory;
import Business.CardType.CardTypeList;
import Business.Merchant.MerchantDirectory;

import Business.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author jayesh
 */
public abstract class Role {
    
    public enum RoleType{
        Bank("Bank"),
        Customer("Customer"),
        CardCompany("CardCompany"),
        Merchant("Merchant"),
        BankEmployee("BankEmployee"),
        SysAdmin("Sysadmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}