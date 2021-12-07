/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerDirectory;
import Business.Bank.BankDirectory;
import Business.CardCompany.CardCompanyDirectory;
import Business.Merchant.MerchantDirectory;
import Business.EcoSystem;
import Business.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class CustomerRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return null;
// return new CustomerAreaJPanel(userProcessContainer, account, business, customerDirectory);
    }
    
    
}
