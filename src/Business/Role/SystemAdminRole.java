/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;
import Business.Customer.CustomerDirectory;
import Business.Bank.BankDirectory;
import Business.CardType.CardTypeList;
import Business.Merchant.MerchantDirectory;

/**
 *
 * @author jayesh
 */
public class SystemAdminRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, business);
    }

   
    
}
