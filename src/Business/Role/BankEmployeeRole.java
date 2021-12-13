/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.BankEmpCustomerService.BankCustomerServiceEmployeeWorkAreaJPanel;
import userinterface.BankEmpSalesPerson.BankSalesEmployeeWorkAreaJPanel;
import userinterface.BankEmployeeWorkArea.BankEmployeeWorkAreaJPanel;

/**
 *
 * @author somnathsolaskar
 */
public class BankEmployeeRole extends Role {
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {//, CustomerDirectory customerDirectory, BankDirectory bankDirectory, CardCompanyDirectory cardCompanyDirectory, MerchantDirectory merchantDirectory ) {
        String empCode = account.getEmployee().getName();
        String empRole = business.getBankEmployeeDirectory().getBankEmployee(empCode).getRole();
        if(empRole.equals("Manager")) {
            return new BankEmployeeWorkAreaJPanel(userProcessContainer, account, business);
        }
        else if(empRole.equals("Sales Person")) {
            return new BankSalesEmployeeWorkAreaJPanel(userProcessContainer, account, business);   
        }
        else if(empRole.equals("Customer Service")) {
            return new BankCustomerServiceEmployeeWorkAreaJPanel(userProcessContainer, account, business);   
        }
        return null;
    }
}
