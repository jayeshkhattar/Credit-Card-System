/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MerchantEmployee;

import Business.Merchant.Merchant;
import java.util.ArrayList;

/**
 *
 * @author somnathsolaskar
 */
public class MerchantEmployeeDirectory {
    private ArrayList<MerchantEmployee> merchantEmployeeDirectory;
    
    public MerchantEmployeeDirectory() {
        merchantEmployeeDirectory = new ArrayList();
    }

    public ArrayList<MerchantEmployee> getMerchantEmployeeDirectory() {
        return merchantEmployeeDirectory;
    }

    public void setMerchantEmployeeDirectory(ArrayList<MerchantEmployee> merchantEmployeeDirectory) {
        this.merchantEmployeeDirectory = merchantEmployeeDirectory;
    }
    
    public MerchantEmployee newMerchantEmployee(String name, String address, String code, String phoneNumber, Merchant merchant) {
        MerchantEmployee be = new MerchantEmployee(name, address, code, phoneNumber, merchant);
        merchantEmployeeDirectory.add(be);
        return be;
    }
    
    public void removeMerchantEmployee(MerchantEmployee be) {
        merchantEmployeeDirectory.remove(be);
        
    }
    
    public MerchantEmployee getMerchantEmployee(String cpde){
        for(MerchantEmployee be: merchantEmployeeDirectory){
            if(be.getCode().equalsIgnoreCase(cpde)){
                return be;
            }
        }
        return null;
    }
    
}
