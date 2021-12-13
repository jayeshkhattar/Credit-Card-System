/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.MerchantEmployeeWorkArea.MerchantEmployeeWorkAreaJPanel;

/**
 *
 * @author somnathsolaskar
 */
public class MerchantEmployeeRole extends Role {
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {//, CustomerDirectory customerDirectory, BankDirectory bankDirectory, CardCompanyDirectory cardCompanyDirectory, MerchantDirectory merchantDirectory ) {
            return new MerchantEmployeeWorkAreaJPanel(userProcessContainer, account, business);
    }
}
