/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Bank.BankDirectory;
import Business.CardCompany.CardCompanyDirectory;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Merchant.MerchantDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author somnathsolaskar
 */
public class CardCompanyRole extends Role {

   

      public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
              //, CustomerDirectory customerDirectory, BankDirectory bankDirectory, CardCompanyDirectory cardCompanyDirectory, MerchantDirectory merchantDirectory ) {
        return null;
// return new CustomerAreaJPanel(userProcessContainer, account, business, customerDirectory);
    }
}
