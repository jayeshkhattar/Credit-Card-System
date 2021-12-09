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
import userinterface.BankAdminWorkArea.BankAdminWorkAreaJPanel;

/**
 *
 * @author somnathsolaskar
 */
public class BankRole extends Role{

      public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {//, CustomerDirectory customerDirectory, BankDirectory bankDirectory, CardCompanyDirectory cardCompanyDirectory, MerchantDirectory merchantDirectory ) {
        return new BankAdminWorkAreaJPanel(userProcessContainer, account, business);
    }
}
